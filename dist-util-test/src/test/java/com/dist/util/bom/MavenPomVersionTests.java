/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2022-06-13 13:33
 * @Since:
 */
package com.dist.util.bom;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class MavenPomVersionTests {

    /**
     * 解析当前模块的所有依赖，排查依赖是否需要更新，它可能来源第三方或数慧公司。
     */
    public static void main(String[] args) throws Exception {

        //要检测依赖更新的模块
        String moduleName = "dist-util-bom";

        //检测依赖版本，校验出可更新的依赖项(它可能不是特别精准，这不是最重要的。)
        StringBuilder dependenciesVersion = checkDependenciesVersion(moduleName);

        System.out.println();
        System.out.println("========================可升级的版本列表-Start======================");
        System.out.println("[" + moduleName + "]模块需手动升级的依赖版本列表：");
        System.out.println(dependenciesVersion);
        System.out.println("========================可升级的版本列表-End========================");
        System.out.println();
    }

    /**
     * 检查依赖版本
     */
    private static StringBuilder checkDependenciesVersion(String moduleName) throws Exception {
        MavenXpp3Reader reader = new MavenXpp3Reader();
        String myPom = System.getProperty("user.dir") + File.separator + moduleName + File.separator + "pom.xml";
        Model model = reader.read(new FileReader(myPom));
        Properties properties = new Properties();
        if (ObjectUtils.isNotEmpty(model.getProperties())) {
            properties = model.getProperties();
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (ObjectUtils.isEmpty(model.getDependencyManagement())) {
            return stringBuilder;
        }

        List<Dependency> dependencies = model.getDependencyManagement().getDependencies();
        if (ObjectUtils.isEmpty(dependencies)) {
            return stringBuilder;
        }

        for (Dependency dependency : dependencies) {
            String currentVersion = getCurrentVersion(dependency.getVersion(), properties);
            String latestVersion = getLatestVersion(dependency.getGroupId(), dependency.getArtifactId(), currentVersion);
            //校验版本 是否是最新的
            if (!currentVersion.equals(latestVersion)) {
                stringBuilder.append(dependency.getGroupId() + ":" + dependency.getArtifactId() + " [" + currentVersion + "  --> " + latestVersion + "]\n");
            }
        }

        return stringBuilder;
    }

    /**
     * 获取当前版本
     */
    private static String getCurrentVersion(String version, Properties properties) {
        if (ObjectUtils.isEmpty(version)) {
            return null;
        }
        if (version.startsWith("${") && version.endsWith("}")) {
            String start = StringUtils.removeStart(version, "${");
            String propertyKey = StringUtils.removeEnd(start, "}");
            return properties.getProperty(propertyKey);
        } else {
            return version;
        }
    }

    /**
     * 获取最新版本
     */
    public static String getLatestVersion(String groupId, String artifactId, String version) {

        String latestVersion = null;
        //检测公司远程仓库
        if (groupId.contains("dist")) {
            String releaseVersion = getDistOrgLatestVersion(groupId, artifactId, "libs-release-local");
//            String snapshotVersion = getDistOrgLatestVersion(groupId, artifactId, "libs-snapshot-local");
            String snapshotVersion = null;
            if (ObjectUtils.isNotEmpty(releaseVersion) && ObjectUtils.isNotEmpty(snapshotVersion)) {
                latestVersion = releaseVersion + "  or  " + snapshotVersion;
            } else if (ObjectUtils.isNotEmpty(releaseVersion)) {
                latestVersion = releaseVersion;
            } else if (ObjectUtils.isNotEmpty(snapshotVersion)) {
                latestVersion = snapshotVersion;
            }
        }

        //检测maven远程仓库
        if (ObjectUtils.isEmpty(latestVersion)) {
            latestVersion = getMavenOrgLatestVersion(groupId, artifactId);
        }

        return latestVersion;
    }

    /**
     * 从dist公司远程仓库检测
     * 检测仓库：libs-release-local or libs-snapshot-local
     * 获取规则：按最新发布的时间获取版本，默认就当是最新的版本。
     */
    public static String getDistOrgLatestVersion(String groupId, String artifactId, String selectedRepositories) {
        //POST http://elb-791125809.cn-northwest-1.elb.amazonaws.com.cn:5336/artifactory/ui/artifactsearch/gavc
        //参数 {"search":"gavc","groupID":"com.dist.utils*","artifactID":"dist-utils-core*","selectedRepositories":["libs-release-local"],"selectedPackageType":{"id":"gavc","displayName":"Maven GAVC","icon":"pom"}}

        String url = "http://elb-791125809.cn-northwest-1.elb.amazonaws.com.cn:5336/artifactory/ui/artifactsearch/gavc";

        String jsonParams = "{\"search\":\"gavc\",\"groupID\":\"" + groupId + "\",\"artifactID\":\"" + artifactId + "\",\"selectedRepositories\":[\"" + selectedRepositories + "\"],\"selectedPackageType\":{\"id\":\"gavc\",\"displayName\":\"Maven GAVC\",\"icon\":\"pom\"}}";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().
                setConnectTimeout(20 * 1000).setConnectionRequestTimeout(20 * 1000)
                .setSocketTimeout(20 * 1000).setRedirectsEnabled(true).build();
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Content-Type", "application/json");
        String version = null;
        try {
            httpPost.setEntity(new StringEntity(jsonParams, ContentType.create("application/json", "utf-8")));
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null && response.getStatusLine().getStatusCode() == 200) {
                String result = EntityUtils.toString(response.getEntity());
                System.out.println("DistOrg响应内容为:" + result);
                JSONObject parseObject = JSON.parseObject(result);
                if (ObjectUtils.isEmpty(parseObject)) {
                    return null;
                }
                JSONArray jsonArray = parseObject.getJSONArray("results");

                if (jsonArray.size() > 0) {
                    Integer maxModifiedDate = 1;
                    for (int i = 0; i < jsonArray.size(); i++) {
                        JSONObject job = jsonArray.getJSONObject(i);
                        Integer modifiedDate = job.getInteger("modifiedDate");
                        if (modifiedDate > maxModifiedDate) {
                            maxModifiedDate = modifiedDate;
                            version = job.getString("version");
                        }
                    }
                }
            }
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("DistOrg检测版本失败：[" + groupId + ":" + artifactId + "]");
        } finally {
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 从maven远程仓库检测
     * 获取规则：按最新发布的时间获取版本，默认就当时最新的版本。
     */
    private static String getMavenOrgLatestVersion(String groupId, String artifactId) {

        String url = "https://search.maven.org/solrsearch/select?q=g:" + groupId + "+AND+a:" + artifactId + "&core=gav&rows=2&wt=json";

        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
            HttpEntity responseEntity = response.getEntity();
            if (responseEntity != null) {
                String s = EntityUtils.toString(responseEntity);
                System.out.println("MavenOrg响应内容为:" + s);
                JSONObject parseObject = JSON.parseObject(s);
                JSONObject response1 = (JSONObject) parseObject.get("response");
                JSONArray docs = response1.getJSONArray("docs");
                if (ObjectUtils.isNotEmpty(docs)) {
                    JSONObject doc = (JSONObject) docs.get(0);
                    String v1 = doc.getString("v");
                    if (!v1.endsWith(".android")) {
                        return v1;
                    } else {
                        JSONObject doc2 = (JSONObject) docs.get(1);
                        String v2 = doc2.getString("v");
                        return v2;
                    }
                }
                return null;
            }
        } catch (ParseException | IOException e) {
            System.err.println("MavenOrg连接失败:" + e.getMessage());
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
