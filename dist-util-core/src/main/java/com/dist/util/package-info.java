/**
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @Author: 郑家骜[ào]
 * @Email: zhengja@dist.com.cn
 * @Date: 2022-06-10 11:20
 * @Since:
 */
package com.dist.util;
/*

【上海数慧工具类定制包】

一、思考
    1、先集成现有产品、项目上的工具类，并加以优化，然后，反哺与产品、项目
    2、后期，会考虑拷贝第三方库中优秀且常用的工具类，优点：减少依赖，方便优化，支持扩展。     例：StringUtils、FileUtils
    3、零依赖，不会依赖其它任何类库，避免与项目中的库版本起冲突


二、dist-utils-core特点
    1、【数慧】自定义的特殊工具类, 所有研发人员可参与维护、并提交【issues】
    2、不与框架耦合，任何Maven项目都可引入使用
    3、零依赖(没有依赖其它任何类库)

三、命名规则
    com.dist.utils
    1、包命名(可选的)： com.dist.utils.*     例： com.dist.utils.json 、 com.dist.utils.file
    2、类的命名：*Util.java                 例： JsonUtil.java 、 FileUtil.java
    3、来源第三方库的工具类，按第三方库命名
          例：来源commons-lang3库中的StringUtils.java工具类  拷贝后的命名：com.dist.utils.commons.lang3.StringUtils.java

 */
