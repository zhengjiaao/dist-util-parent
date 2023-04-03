# dist-utils-parent

> 来源作者：郑家骜**[ào]**

​		超级实用的 Java 工具类,  这篇文章将介绍Java中使用最频繁及最通用的Java工具类。参考数据来源于Github上随机选取的5万个开源项目源码。



## 快速查找

此页面进行快速查找工具类 or 依赖，例：

搜索 `StringUtils`、`FileUtils`、`IOUtils`、`ArrayUtils`、`CollectionUtils`、`Word`、`Excel`、`图片`、`解压`、`集合`等，会匹配到相关依赖。



## 版本列表

当前版本：**1.0.0** 

| 版本列表 | 文档说明 | 兼容旧版本 |
| -------- | -------- | ---------- |
| 1.0.0    |          |            |
|          |          |            |



## dist-utils-bom

**引用第三方库(权威)，可以快速开发，方便编码，并减少编码错误。**

### 使用

**import方式**

> 引入`dist-utils-bom`，再由子模块决定用到哪些模块，你可以在父模块中加入：

```xml
    <dependencyManagement>
        <dependencies>
            <!--dist-utils-bom-->
            <dependency>
                <groupId>com.dist</groupId>
                <artifactId>dist-utils-bom</artifactId>
                <!--当前版本-->
                <version>1.0.0</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

在子模块中就可以引入自己需要的模块了：

```xml
    <dependencies>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
        </dependency>
    </dependencies>
```



### 包含组件

> 包含组件：28个

| 模块                   | 描述                                                         |
| :--------------------- | ------------------------------------------------------------ |
| guava                  | 提供用于集合，缓存，支持原语，并发性，常见注解，字符串处理，I/O和验证的实用方法。 |
| lombok                 | 简化代码，永远不要再编写另一个 `get`、`ste` 、`equals` 、`toString`方法，使用一个注解。 |
| netty-all              | Netty是一个异步事件驱动的网络应用程序框架，用于快速开发可维护的高性能协议服务器和客户端。 |
| fastjson               | FastJson 是阿里的开源框架，是一个极其优秀的 json 框架。      |
| jackson-databind       | 虽然 Jackson 的原始用例是 JSON 数据绑定，但它现在也可以用于读取以其他数据格式编码的内容，只要存在解析器和生成器实现即可。 |
| commons-lang3          | 为 java.lang API 提供了许多帮助实用程序，特别是字符串操作方法、基本数值方法、对象反射、并发、创建和序列化以及系统属性。 |
| commons-collections4   | Java 集合框架扩展，通过提供新的接口、实现和实用程序来构建 JDK 类。 |
| commons-beanutils      | BeanUtils 提供了一个易于使用但灵活的反射和自省包装器。Apache的BeanUtils性能较差，不建议使用，推荐Spring的BeanUtils 或者使用其他拷贝框架。 |
| commons-compress       | 文件解压 and 压缩：定义了一个 API，用于处理 ar、cpio、Unix dump、tar、zip、gzip、XZ、Pack200、bzip2、7z、arj、lzma、snappy、DEFLATE、lz4、Brotli、Zstandard、DEFLATE64 和 Z 文件。 |
| commons-io             | 实用程序库，可帮助开发 IO 功能。例：流，文件过滤等操作。     |
| commons-text           | 专注于字符串算法的库。                                       |
| commons-codec          | 提供常见编码器和解码器的实现，例如 Base64、Hex、Phonetic 和 URL。 |
| commons-pool2          | 提供了一个对象池 API 和许多对象池实现。支持完全重写池实现，包括强大的实例跟踪和池监控。 |
| commons-net            | 网络开发包，实现了许多基本 Internet 协议的客户端。该库的目的是提供基本协议访问，而不是更高级别的抽象。例：实现FTP客户端等。 |
| commons-configuration2 | 提供了一个通用配置接口，使 Java 应用程序能够从各种来源读取配置数据。 |
| mapstruct              | mapstruct是比较优秀的一个框架Java对象转换器。是编译期动态生成 set/get 代码的class文件，在运行时直接调用该class的 set/get 方法。 |
| dozer                  | Dozer是Java Bean到Java Bean映射器，它以递归方式将数据从一个对象复制到另一个对象。通常，这些Java Bean将具有不同的复杂类型。是运行期反射调用 set/get 或者是直接对成员变量赋值。官方已停止维护。 |
| modelmapper            | 自动确定一个对象模型如何映射到另一个对象模型，从而简化对象映射，同时提供一个简单、重构安全的 API 来处理特定用例。是运行期反射调用 set/get 或者是直接对成员变量赋值。 |
| poi                    | Apache POI - 访问 Microsoft 格式文件的 Java API。例：Word、Excel等操作的API。 |
| easyexcel              | EasyExcel是一个基于Java的、快速、简洁、解决大文件内存溢出的Excel处理工具。<br/>他能让你在不用考虑性能、内存的等因素的情况下，快速完成Excel的读、写等功能。 |
| poi-tl                 | poi-tl 是Word模板引擎，使用Word模板和数据, 创建很棒的Word文档。 |
| zxing                  | 创建与识别 二维码、条形码等工具包。                          |
| thumbnailator          | 图片操作：缩略图、压缩图片、图片缩放、转换文件格式、旋转、裁剪与加水印等功能。 |
| easy-captcha           | 图形验证码：支持gif、中文、算术等类型，可用于Java Web、JavaSE等项目。 |
| pinyin4j               | 获取中文拼音，可实现自定义。                                 |
| dom4j                  | Dom4j用于 Java 解析 XML 、XPath和XSLT，完全支持 DOM，SAX 和 JAXP。了解基本的 [XML](https://so.csdn.net/so/search?q=XML&spm=1001.2101.3001.7020)-[DOM](https://so.csdn.net/so/search?q=DOM&spm=1001.2101.3001.7020) 模型，就能使用。 |
| dist-utils-core        | 上海数慧 定制工具包，第三方工具无法满足的情况，使用公司自定义工具类。特点是，不与框架耦合，任何Maven项目都可引入使用、零依赖(没有依赖其它任何类库)。 |
| hutool-bom             | Hutool是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以“甜甜的”。 |



### guava

**[GitHub](https://github.com/google/guava)、[教程1](https://www.yiibai.com/guava/)、[教程2](http://ifeve.com/google-guava/#more-8776)**

> 提供用于集合，缓存，支持原语，并发性，常见注解，字符串处理，I/O和验证的实用方法。高效、可靠、快速和有效的扩展JAVA标准库。

```xml
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>${guava.version}</version>
</dependency>
```

- 工具类：Optional、Objects、Preconditions、Ordering、Throwables、Strings
- 集合类工具：Multiset、Multimap、BiMap、Table、...
- 缓存：LoadingCache、CacheBuilder
- 并发：ListenableFuture、Service、...
- 其它：EventBus、Math、Reflection、IO、Primitives、...

**简单示例**

Multimap 示例 

DEMO代码地址：[MultimapTests.java](https://www.yiibai.com/guava/guava_multimap.html)

功能描述：多重映射接口扩展映射，使得其键一次可被映射到多个值。

```java
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class GuavaTester {
   public static void main(String args[]){
      GuavaTester tester = new GuavaTester();
      Multimap<String,String> multimap = tester.getMultimap();

      List<String> lowerList = (List<String>)multimap.get("lower");
      System.out.println("Initial lower case list");
      System.out.println(lowerList.toString());
      lowerList.add("f");
      System.out.println("Modified lower case list");
      System.out.println(lowerList.toString());

      List<String> upperList = (List<String>)multimap.get("upper");
      System.out.println("Initial upper case list");
      System.out.println(upperList.toString());
      upperList.remove("D");
      System.out.println("Modified upper case list");
      System.out.println(upperList.toString());

      Map<String, Collection<String>> map = multimap.asMap();
      System.out.println("Multimap as a map");
      for (Map.Entry<String,  Collection<String>> entry : map.entrySet()) {
         String key = entry.getKey();
         Collection<String> value =  multimap.get("lower");
         System.out.println(key + ":" + value);
      }

      System.out.println("Keys of Multimap");
      Set<String> keys =  multimap.keySet();
      for(String key:keys){
         System.out.println(key);
      }

      System.out.println("Values of Multimap");
      Collection<String> values = multimap.values();
      System.out.println(values);
   }	

   private Multimap<String,String> getMultimap(){
      //Map<String, List<String>>
      // lower -> a, b, c, d, e 
      // upper -> A, B, C, D

      Multimap<String,String> multimap = ArrayListMultimap.create();		

      multimap.put("lower", "a");
      multimap.put("lower", "b");
      multimap.put("lower", "c");
      multimap.put("lower", "d");
      multimap.put("lower", "e");

      multimap.put("upper", "A");
      multimap.put("upper", "B");
      multimap.put("upper", "C");
      multimap.put("upper", "D");		
      return multimap;		
   }
}
```

打印结果

```
Initial lower case list
[a, b, c, d, e]
Modified lower case list
[a, b, c, d, e, f]
Initial upper case list
[A, B, C, D]
Modified upper case list
[A, B, C]
Multimap as a map
upper:[a, b, c, d, e, f]
lower:[a, b, c, d, e, f]
Keys of Multimap
upper
lower
Values of Multimap
[A, B, C, a, b, c, d, e, f]
```



### lombok

**[GitHub](https://github.com/projectlombok/lombok)、[官网](https://projectlombok.org/)、[官方教程](https://projectlombok.org/features/all)、[教程2](https://juejin.cn/post/6844903557016076302)、[教程3](https://juejin.cn/post/7102785140979400735)**

>简化代码，永远不要再编写另一个 `get`、`ste` 、`equals` 、`toString`方法，使用一个注解，您的类就有一个功能齐全的构建器、自动化您的日志变量等等。
>
>IDEA 对于 2020.3 之前的版本，可以添加[Lombok IntelliJ 插件](https://projectlombok.org/setup/intellij)以添加对 IntelliJ 的 lombok 支持。

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>${lombok.version}</version>
</dependency>
```

- 常用注解：[`@Data`](https://projectlombok.org/features/Data)、[`@Getter/@Setter`](https://projectlombok.org/features/GetterSetter)、[`val`](https://projectlombok.org/features/val)、[`@Log`](https://projectlombok.org/features/log)、[`@NonNull`](https://projectlombok.org/features/NonNull)、[`@Builder`](https://projectlombok.org/features/Builder)、[`@ToString`](https://projectlombok.org/features/ToString)、[`@NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor`](https://projectlombok.org/features/constructor)、[`@SneakyThrows`](https://projectlombok.org/features/SneakyThrows)

**简单示例**

简化 get/set 代码

使用lombok  `@Getter` 和`@Setter`  注解

```java
public class GetterSetterExample {
    @Getter 
    @Setter
    private int age = 10;
    @Setter(AccessLevel.PROTECTED)
    private String name;
    
    @Override public String toString() {
    	return String.format("%s (age: %d)", name, age);
  	}
}
```

原生 Java 写法

```java
public class GetterSetterExample {
    private int age = 10;
    private String name;
    
    public int getAge() {
    	return age;
  	}
    public void setAge(int age) {
    	this.age = age;
  	}
    
    protected void setName(String name) {
    	this.name = name;
  	}
    
    @Override public String toString() {
    	return String.format("%s (age: %d)", name, age);
  	}
}
```



### netty-all

**[GitHub](https://github.com/netty/netty)、[官网](https://netty.io/)、[教程1-Netty初识篇](https://cloud.tencent.com/developer/article/1456465)、[教程2-Netty进阶版](https://cloud.tencent.com/developer/article/1456295)、[教程3-理解Netty](https://juejin.cn/post/6844903703183360008)、[教程4-理解Netty](https://juejin.cn/post/6921858121774137352)**

> Netty是一个异步事件驱动的网络应用程序框架，用于快速开发可维护的高性能协议服务器和客户端。
>
> Netty应用场景：1.远程过程调用(RPC)，比如dubbo 2.聊天服务器 ，比如websocket。 3.弹幕服务器。 4.车联网等TCP层网络通讯。 5.Netty与MQTT协议打造LOT服务器。 6.网络游戏服务器。

```xml
<dependency>
    <groupId>io.netty</groupId>
    <artifactId>netty-all</artifactId>
    <version>${netty-all.version}</version>
</dependency>
```

简单示例

```
篇幅较多，请参考：教程
```



### fastjson

**[GitHub](https://github.com/alibaba/fastjson)、[官网](https://github.com/alibaba/fastjson/wiki/Quick-Start-CN)、[教程1](https://cloud.tencent.com/developer/article/1489650)、[Fastjson和对象互相转换-教程2](https://blog.csdn.net/shy52134/article/details/122113426)**

> FastJson 是阿里的开源框架，是一个极其优秀的 json 框架。

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>${fastjson.version}</version>
</dependency>
```

- 常用方法：
  - `JSON.parse(String text);`: 把JSON文本parse为JSONObject或者JSONArray
  - `JSON.parseObject(String text);`: 把JSON文本parse成JSONObject
  - `JSON.parseArray(String text);`: 把JSON文本parse成JSONArray
  - `JSON.toJSONString(Object object);`: 将JavaBean序列化为JSON文本

**简单示例**

json处理

功能描述：服务器接收请求数据，发送 JSON 回浏览器，并根据不同的请求方式，分别解决中文乱码问题：

浏览器发送json数据

```java
 $.ajax({
     url: 'http://localhost:8080/RequestNResponse/GetJSON',
     method: 'GET',
     data: {
         json:
         `{
             "username": "张三",
             "age": 23,
             "hobby":["篮球","足球","羽毛球"]
         }`
     },
     complete: function (res) {
         console.log(res)
         $('body').append(`<h1>${res.responseText}</h1>`)
     }
 })
```

服务器端接收请求

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html;charset=utf-8");
         //允许所有IP地址和端口请求
         response.setHeader("Access-Control-Allow-Origin", "*"); 
         //允许所有的文档类型请求 
         response.setHeader("Access-Control-Content-Type", "*"); 
         String jsonStr = new String(request.getParameter("json").getBytes("ISO-8859-1"), "utf-8");
         JSONObject object = JSON.parseObject(jsonStr);
         response.getWriter().println("username:" + object.get("username"));
         response.getWriter().println("username:" + object.get("age"));
         JSONArray hobbies = (JSONArray) object.get("hobby");
         hobbies.forEach(obj -> {
             try {
                 response.getWriter().println(obj);
             } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
         });
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html;charset=utf-8");
         //允许所有IP地址和端口请求
         response.setHeader("Access-Control-Allow-Origin", "*"); 
         //允许所有的文档类型请求 
         response.setHeader("Access-Control-Content-Type", "*"); 
         String jsonStr = request.getParameter("json");
         JSONObject object = JSON.parseObject(jsonStr);
         response.getWriter().println("username:" + object.get("username"));
         response.getWriter().println("username:" + object.get("age"));
         JSONArray hobbies = (JSONArray) object.get("hobby");
         hobbies.forEach(obj -> {
             try {
                 response.getWriter().println(obj);
             } catch (IOException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
             }
         });
     }
```



### jackson-databind

**[GitHub](https://github.com/FasterXML/jackson-databind)、[官网](https://github.com/FasterXML/jackson-databind#readme)、[教程](https://cloud.tencent.com/developer/article/1674222)**

> 虽然 Jackson 的原始用例是 JSON 数据绑定，但它现在也可以用于读取以其他数据格式编码的内容，只要存在解析器和生成器实现即可。尽管对 JSON 格式没有实际的硬依赖性，但在许多地方命名类都使用了“JSON”一词。
>
> 依赖于`jackson-core`和`jackson-annotations`包

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>${jackson-databind.version}</version>
</dependency>
```

- 常用类：ObjectMapper

**简单示例**

1 分钟教程：POJO 到 JSON 并返回

功能描述：最常见的用法是获取一段 JSON，并从中构造一个普通的旧 Java 对象（“POJO”）。

```java
@Data
public class MyValue {
  public String name;
  public int age;
}
```

读取json或转换json

```java
//创建 ObjectMapper实例，用于所有数据绑定
ObjectMapper mapper = new ObjectMapper();

MyValue value = mapper.readValue(new File("data.json"), MyValue.class);
// or:
value = mapper.readValue(new URL("http://some.com/api/entry.json"), MyValue.class);
// or:
value = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", MyValue.class);
```

如果我们想写 JSON，我们做相反的事情：

```java
ObjectMapper mapper = new ObjectMapper();

mapper.writeValue(new File("result.json"), myResultObject);
// or:
byte[] jsonBytes = mapper.writeValueAsBytes(myResultObject);
// or:
String jsonString = mapper.writeValueAsString(myResultObject);
```



### commons-lang3

**[官网](https://commons.apache.org/proper/commons-lang/)、[教程系列1](https://cloud.tencent.com/developer/article/1787096)、[教程系列2](https://cloud.tencent.com/developer/article/1787097)、[教程系列3](https://cloud.tencent.com/developer/article/1787099)、[字符串处理教程](https://www.jianshu.com/p/1886903ed14c)**

> 为 java.lang API 提供了许多帮助实用程序，特别是字符串操作方法、基本数值方法、对象反射、并发、创建和序列化以及系统属性。

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>${commons-lang3.version}</version>
</dependency>
```

- 工具类：**StringUtils**、StringEscapeUtils、ArchUtils、ArrayUtils、BooleanUtils、ClassPathUtils、EnumUtils、ObjectUtils、RandomUtils、SystemUtils、...

**简单示例**

字符串处理类 `StringUtils` 示例

```java
        //字符串结尾的后缀是否与你要结尾的后缀匹配，若不匹配则添加后缀
        StringUtils.appendIfMissing("abc","xyz");//---"abcxyz"
        StringUtils.appendIfMissingIgnoreCase("abcXYZ","xyz");//---"abcXYZ"

        //首字母大小写转换
        StringUtils.capitalize("cat");//---"Cat"
        StringUtils.uncapitalize("Cat");//---"cat"

        //去除字符串中的"\n", "\r", or "\r\n"
        StringUtils.chomp("abc\r\n");//---"abc"

        //判断一字符串是否包含另一字符串
        StringUtils.contains("abc", "z");//---false
        StringUtils.containsIgnoreCase("abc", "A");//---true

        //统计一字符串在另一字符串中出现次数
        StringUtils.countMatches("abba", "a");//---2

        //删除字符串中的梭有空格
        StringUtils.deleteWhitespace("   ab  c  ");//---"abc"

        //比较两字符串，返回不同之处。确切的说是返回第二个参数中与第一个参数所不同的字符串
        StringUtils.difference("abcde", "abxyz");//---"xyz"

        //检查字符串结尾后缀是否匹配
        StringUtils.endsWith("abcdef", "def");//---true
        StringUtils.endsWithIgnoreCase("ABCDEF", "def");//---true
        StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"});//---true

        //检查起始字符串是否匹配
        StringUtils.startsWith("abcdef", "abc");//---true
        StringUtils.startsWithIgnoreCase("ABCDEF", "abc");//---true
        StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"});//---true

        //判断两字符串是否相同
        StringUtils.equals("abc", "abc");//---true
        StringUtils.equalsIgnoreCase("abc", "ABC");//---true

        //比较字符串数组内的所有元素的字符序列，起始一致则返回一致的字符串，若无则返回""
        StringUtils.getCommonPrefix(new String[] {"abcde", "abxyz"});//---"ab"

        //正向查找字符在字符串中第一次出现的位置
        StringUtils.indexOf("aabaabaa", "b");//---2
        StringUtils.indexOf("aabaabaa", "b", 3);//---5(从角标3后查找)
        StringUtils.ordinalIndexOf("aabaabaa", "a", 3);//---1(查找第n次出现的位置)

        //反向查找字符串第一次出现的位置
        StringUtils.lastIndexOf("aabaabaa", ‘b‘);//---5
        StringUtils.lastIndexOf("aabaabaa", ‘b‘, 4);//---2
        StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2);//---1

        //判断字符串大写、小写
        StringUtils.isAllUpperCase("ABC");//---true
        StringUtils.isAllLowerCase("abC");//---false

        //截取字符串
        StringUtils.substring("abcd", 2);//---"cd"
        StringUtils.substring("abcdef", 2, 4);//---"cd"

        //left、right从左(右)开始截取n位字符
        StringUtils.left("abc", 2);//---"ab"
        StringUtils.right("abc", 2);//---"bc"
        //从第n位开始截取m位字符       n  m
        StringUtils.mid("abcdefg", 2, 4);//---"cdef"

        StringUtils.substringBefore("abcba", "b");//---"a"
        StringUtils.substringBeforeLast("abcba", "b");//---"abc"
        StringUtils.substringAfter("abcba", "b");//---"cba"
        StringUtils.substringAfterLast("abcba", "b");//---"a"

        StringUtils.substringBetween("tagabctag", "tag");//---"abc"
        StringUtils.substringBetween("yabczyabcz", "y", "z");//---"abc"
```



### commons-collections4

**[GitHub](https://github.com/apache/commons-collections)、[官网](https://commons.apache.org/proper/commons-collections/)、[教程](https://cloud.tencent.com/developer/article/1497565)**

> Java 集合框架扩展，通过提供新的接口、实现和实用程序来构建 JDK 类。

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-collections4</artifactId>
    <version>${commons-collections4.version}</version>
</dependency>
```

- 集合类：MultiKeyMap、Bag、HashBag、TreeBag、BidiMap、TreeList、LRUMap、MultiSet、...
- 集合工具类：**CollectionUtils**、SetUtils、ListUtils、MapUtils、...

**简单示例**

多键Map `MultiKeyMap ` 示例

功能描述：Map的key，可能是由多个字段的值联合决定的（有点类似联合索引的意思）

```java
	public static void main(String[] args) {
        // MultiKey功能很简单：装载多个key的一个对象
        MultiKey<String> multiKey = new MultiKey<>("a", "b");
        System.out.println(multiKey); //MultiKey[a, b]


        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap();

        // 多个键对应一个值 两个key：name和NAME
        multiKeyMap.put("name", "NAME", "jianggujin");
        System.out.println(multiKeyMap); //{MultiKey[name, NAME]=jianggujin}
        System.out.println(multiKeyMap.get("name")); //null
        System.out.println(multiKeyMap.get("NAME")); //null
        System.out.println(multiKeyMap.get("name", "NAME")); //jianggujin

        //测试key覆盖
        multiKeyMap.put("name", "shixiang", "cover");
        System.out.println(multiKeyMap); //{MultiKey[name, shixiang]=cover, MultiKey[name, NAME]=jianggujin}

        //这样子  value值才会被覆盖
        multiKeyMap.put("name", "NAME", "cover");
        System.out.println(multiKeyMap); //{MultiKey[name, shixiang]=cover, MultiKey[name, NAME]=cover}
    }
```



### commons-beanutils-不推荐

**[GitHub](https://github.com/apache/commons-beanutils)、[官网](https://commons.apache.org/proper/commons-beanutils/)、[教程]()、[BeanUtils-不推荐的原因](https://cloud.tencent.com/developer/article/1544300)**

> BeanUtils 提供了一个易于使用但灵活的反射和自省包装器。
>
> 缺点：Apache的BeanUtils性能较差，不建议使用，推荐Spring的BeanUtils 或者使用其他拷贝框架。

```xml
<dependency>
    <groupId>commons-beanutils</groupId>
    <artifactId>commons-beanutils</artifactId>
    <version>${commons-beanutils.version}</version>
</dependency>
```

- 工具类：**BeanUtils**、MethodUtils、ConstructorUtils、PropertyUtils、ConvertUtils、...

**简单示例**

访问类级别属性

功能描述：BeanUtilsBean 访问类级别属性，而后者又使用 PropertyUtilsBean

```java
public void testSuppressClassPropertyByDefault() throws Exception {
  final BeanUtilsBean bub = new BeanUtilsBean();
  final AlphaBean bean = new AlphaBean();
  try {
    bub.getProperty(bean, "class");
    fail("Could access class property!");
  } catch (final NoSuchMethodException ex) {
    // ok
  }
}
```



### commons-compress

**[GitHub](https://github.com/apache/commons-compress)、[官网](https://commons.apache.org/proper/commons-compress/)、[教程1](https://cloud.tencent.com/developer/article/1703421)、[教程2](https://cloud.tencent.com/developer/article/1130020)**

> 文件解压 and 压缩：定义了一个 API，用于处理 ar、cpio、Unix dump、tar、zip、gzip、XZ、Pack200、bzip2、7z、arj、lzma、snappy、DEFLATE、lz4、Brotli、Zstandard、DEFLATE64 和 Z 文件。

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-compress</artifactId>
    <version>${commons-compress.version}</version>
</dependency>
```

**简单示例**

压缩

功能描述：将两个文件打包到tar.gz

```java
  @Test
  void testFilesTarGzip() throws IOException {
    //输入文件，被压缩文件
    Path path1 = Paths.get("/home/test/file-a.xml");
    Path path2 = Paths.get("/home/test/file-b.txt");
    List<Path> paths = Arrays.asList(path1, path2);

    //输出文件压缩结果
    Path output = Paths.get("/home/test/output.tar.gz");

    //OutputStream输出流、BufferedOutputStream缓冲输出流
    //GzipCompressorOutputStream是gzip压缩输出流
    //TarArchiveOutputStream打tar包输出流（包含gzip压缩输出流）
    try (OutputStream fOut = Files.newOutputStream(output);
         BufferedOutputStream buffOut = new BufferedOutputStream(fOut);
         GzipCompressorOutputStream gzOut = new GzipCompressorOutputStream(buffOut);
         TarArchiveOutputStream tOut = new TarArchiveOutputStream(gzOut)) {

      //遍历文件list
      for (Path path : paths) {
        //该文件不是目录或者符号链接
        if (!Files.isRegularFile(path)) {
          throw new IOException("Support only file!");
        }
        //将该文件放入tar包，并执行gzip压缩
        TarArchiveEntry tarEntry = new TarArchiveEntry(
                path.toFile(),
                path.getFileName().toString());

        tOut.putArchiveEntry(tarEntry);
        Files.copy(path, tOut);

        tOut.closeArchiveEntry();
      }
      //for循环完成之后，finish-tar包输出流
      tOut.finish();
    }
  }
```

解压

功能描述：解压tar.gz压缩文件

```java
@Test
void testDeCompressTarGzip() throws IOException {
  //解压文件
  Path source = Paths.get("/home/test/output.tar.gz");
  //解压到哪
  Path target = Paths.get("/home/test2");

  if (Files.notExists(source)) {
    throw new IOException("您要解压的文件不存在");
  }

  //InputStream输入流，以下四个流将tar.gz读取到内存并操作
  //BufferedInputStream缓冲输入流
  //GzipCompressorInputStream解压输入流
  //TarArchiveInputStream解tar包输入流
  try (InputStream fi = Files.newInputStream(source);
       BufferedInputStream bi = new BufferedInputStream(fi);
       GzipCompressorInputStream gzi = new GzipCompressorInputStream(bi);
       TarArchiveInputStream ti = new TarArchiveInputStream(gzi)) {

    ArchiveEntry entry;
    while ((entry = ti.getNextEntry()) != null) {

      //获取解压文件目录，并判断文件是否损坏
      Path newPath = zipSlipProtect(entry, target);

      if (entry.isDirectory()) {
        //创建解压文件目录
        Files.createDirectories(newPath);
      } else {
        //再次校验解压文件目录是否存在
        Path parent = newPath.getParent();
        if (parent != null) {
          if (Files.notExists(parent)) {
            Files.createDirectories(parent);
          }
        }
        // 将解压文件输入到TarArchiveInputStream，输出到磁盘newPath目录
        Files.copy(ti, newPath, StandardCopyOption.REPLACE_EXISTING);

      }
    }
  }

}

//判断压缩文件是否被损坏，并返回该文件的解压目录
private  Path zipSlipProtect(ArchiveEntry entry,Path targetDir)
        throws IOException {

  Path targetDirResolved = targetDir.resolve(entry.getName());
  Path normalizePath = targetDirResolved.normalize();

  if (!normalizePath.startsWith(targetDir)) {
    throw new IOException("压缩文件已被损坏: " + entry.getName());
  }

  return normalizePath;
}
```



### commons-io

**[GitHub](https://github.com/apache/commons-io)、[官网](https://commons.apache.org/proper/commons-io/)、[教程](https://ifeve.com/commons-io/)**

> 实用程序库，可帮助开发 IO 功能。
>
> - [io](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/package-summary.html) - 这个包定义了用于处理流、读取器、写入器和文件的实用程序类。
> - [comparator](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/comparator/package-summary.html) - 此包为文件提供各种比较器实现。
> - [file](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/file/package-summary.html) - 这个包提供了 java.nio.file 领域的扩展。
> - [filefilter](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/filefilter/package-summary.html) - 这个包定义了一个结合了 FileFilter 和 FilenameFilter 的接口 (IOFileFilter)。
> - [function](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/function/package-summary.html) - 此包为 lambda 表达式和方法引用定义了仅与 IO 相关的功能接口。
> - [input](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/input/package-summary.html) - 此包提供输入类的实现，例如 InputStream 和 Reader。
> - [input.buffer](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/input/buffer/package-summary.html) - 此包提供缓冲输入类的实现，例如 CircularBufferInputStream 和 PeekableInputStream。
> - [monitor](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/monitor/package-summary.html) - 这个包提供了一个用于监视文件系统事件（目录和文件创建、更新和删除事件）的组件。
> - [output](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/output/package-summary.html) - 此包提供输出类的实现，例如 OutputStream 和 Writer。
> - [serialization](https://commons.apache.org/proper/commons-io/apidocs/index.html?org/apache/commons/io/serialization/package-summary.html) - 这个包提供了一个控制类反序列化的框架。

```xml
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>${commons-io.version}</version>
</dependency>
```

- 工具类：**IOUtils**、**FileUtils**、FilenameUtils、FileSystemUtils、FileFilterUtils、...
- 其它类：FileAlterationListener、*FileComparator、...

**简单示例**

使用 `IOUtils` 工具

功能描述：从URL中读取byte数据，并打印。

```java
InputStream in = new URL( "http://commons.apache.org" ).openStream();
try {
    System.out.println( IOUtils.toString( in ) );
} finally {
    IOUtils.closeQuietly(in);
}
```

使用 `IOUtils` 工具

功能描述：复制文件

```java
//复制文件 小于2G时，推荐使用
copy(inputstream,outputstream)
copy(inputstream,writer)
copy(inputstream,writer,encoding)
copy(reader,outputstream)
copy(reader,writer)
copy(reader,writer,encoding)

//复制大文件 一般超过2G
copyLarge(reader,writer) //默认会用1024*4的buffer来读取
copyLarge(reader,writer,buffer)
```

使用 `IOUtils` 工具

功能描述：把流的全部内容放在另一个流中 

```java
InputStream in = classPathResource.getInputStream();

InputStream inputStream = IOUtils.toBufferedInputStream(in);
```



### commons-text

**[GitHub](https://github.com/apache/commons-text)、[官网](https://commons.apache.org/proper/commons-text/)、[教程](https://www.jianshu.com/p/a83840eebf3f)**

> 专注于字符串算法的库。

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-text</artifactId>
    <version>${commons-text.version}</version>
</dependency>
```

- 工具类：StringEscapeUtils
- 字符串操作类：**StrSubstitutor** 

**简单示例**

占位符替换 `StrSubstitutor` 

```java
    /**
     * 替换
     * @param source 源内容
     * @param parameter 占位符参数
     * @param prefix 占位符前缀 例如:${
     * @param suffix 占位符后缀 例如:}
     * @param enableSubstitutionInVariables 是否在变量名称中进行替换 例如:${system-${版本}}
     * 
     * 转义符默认为'$'。如果这个字符放在一个变量引用之前，这个引用将被忽略，不会被替换 如$${a}将直接输出${a}
     * @return
     */
    public static String replace(String source,Map<String, Object> parameter,String prefix, String suffix,boolean enableSubstitutionInVariables){
        //StrSubstitutor不是线程安全的类
        StrSubstitutor strSubstitutor = new StrSubstitutor(parameter,prefix, suffix);
        //是否在变量名称中进行替换
        strSubstitutor.setEnableSubstitutionInVariables(enableSubstitutionInVariables);
        return strSubstitutor.replace(source);
    }
    
    /**
     * 测试
     */
    public static void test(){
       //替换字符串中的占位符
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user", "admin");
        params.put("password", "123456");
        params.put("system-version", "windows 10");
        params.put("版本", "version");//中文也可以
        params.put("详", "翔");//中文也可以

        System.out.println(replace("你的用户名是${user},密码是${password}。系统版本${system-${版本}}",params,"${","}",true));
        System.out.println(replace("表达对一个人无比的崇拜怎么表述最好？答：“愿闻其${详}”",params,"${","}",false));
    }
```

输出结果

```
你的用户名是admin,密码是123456。系统版本windows 10
```



### commons-codec

**[GitHub](https://github.com/apache/commons-codec)、[官网](https://commons.apache.org/proper/commons-codec/)、[教程](https://www.jianshu.com/p/062560c67e70)**

> 提供常见编码器和解码器的实现，例如 Base64、Hex、Phonetic 和 URL。

```xml
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>${commons-codec.version}</version>
</dependency>
```

- 工具类：**DigestUtils**、Base64、Hex、...

**简单示例**

使用`DigestUtils.md5Hex() 方法` 加密

功能描述：以 `MD5` 加密算法对数据源进行加密，返回加密后的十六进制形式字符串

```java
String md5Hex(byte[] data)
String md5Hex(InputStream data)
String md5Hex(String data)
```



### commons-pool2

**[GitHub](https://github.com/apache/commons-pool)、[官网](https://commons.apache.org/proper/commons-pool/)、[教程1](https://blog.csdn.net/privateobject/article/details/123815473)、[教程2](https://cloud.tencent.com/developer/article/1478302)、[池化技术探究](https://cloud.tencent.com/developer/article/1818849)**

> 提供了一个对象池 API 和许多对象池实现。支持完全重写池实现，包括强大的实例跟踪和池监控。

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-pool2</artifactId>
    <version>${commons-pool2.version}</version>
</dependency>
```

**简单示例**

参考：教程

```
内容较多，不便展示。
```



### commons-net

**[GitHub](https://github.com/apache/commons-net)、[官网](https://commons.apache.org/proper/commons-net/)、[教程1-FTP](https://www.cnblogs.com/eer123/p/9120256.html)、[教程2-FTP](https://cloud.tencent.com/developer/article/1432735)**

> 网络开发包，实现了许多基本 Internet 协议的客户端。该库的目的是提供基本协议访问，而不是更高级别的抽象。尽可能使协议的全局功能可访问（例如，TFTP 发送文件和接收文件），但在适用的情况下也提供对基本协议的访问，以便程序员可以构建自己的自定义实现（例如，TFTP数据包类和 TFTP 数据包发送和接收方法被公开）。
>
> 支持的协议包括：FTP/FTPS、FTP over HTTP (experimental)、NNTP、SMTP(S)、POP3(S)、IMAP(S)、Telnet、TFTP、Finger、Whois、rexec/rcmd/rlogin、Time (rdate) and Daytime、Echo、Discard、NTP/SNTP

```xml
<dependency>
    <groupId>commons-net</groupId>
    <artifactId>commons-net</artifactId>
    <version>${commons-net.version}</version>
</dependency>
```

**简单示例**

参考：教程

```
内容较多，不便展示。
```

**官方示例**

FTP（包：examples/ftp）

- [FTPClientExample](https://commons.apache.org/proper/commons-net/examples/ftp/FTPClientExample.java) 演示文件下载和上传、LIST、MLST 等通过 FTP(S) 和 FTP 通过 HTTP
- [ServerToServerFTP](https://commons.apache.org/proper/commons-net/examples/ftp/ServerToServerFTP.java) 该程序安排服务器到服务器的文件传输，将文件从主机 1 传输到主机 2。
- [TFTPExample](https://commons.apache.org/proper/commons-net/examples/ftp/TFTPExample.java) 这是一个简单的 Java tftp 客户端示例

邮件（包：示例/邮件）

- [IMAPMail](https://commons.apache.org/proper/commons-net/examples/mail/IMAPMail.java) 这是一个演示如何使用 IMAP[S]Client 类的示例程序。
- [POP3Mail](https://commons.apache.org/proper/commons-net/examples/mail/POP3Mail.java) 这是一个演示如何使用 POP3[S]Client 类的示例程序。
- [SMTPMail](https://commons.apache.org/proper/commons-net/examples/mail/SMTPMail.java) 这是一个演示如何使用 SMTP[S]Client 类的示例程序。



### commons-configuration2

**[GitHub](https://github.com/apache/commons-configuration)、[官网](https://commons.apache.org/proper/commons-configuration/)、[教程](https://cloud.tencent.com/developer/article/1497667)**

> 提供了一个通用配置接口，使 Java 应用程序能够从各种来源读取配置数据。
>
> 支持加载配置参数的文件类型: Properties files、XML documents、Windows INI files、Property list files (plist)、JNDI、JDBC Datasource、System properties、Applet parameters、Servlet parameters

```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-configuration2</artifactId>
    <version>${commons-configuration2.version}</version>
</dependency>
```

**简单示例**

读取`properties`配置

功能描述：读取`properties`配置中的值

```java
Configurations configs = new Configurations();
try{
    Configuration config = configs.properties(new File("config.properties"));
    // access configuration properties
 
    String dbHost = config.getString("database.host");
    // provide a default
    String dbPassword = config.getString("database.password", "secret"); 
    int dbPort = config.getInt("database.port");
    long dbTimeout = config.getLong("database.timeout");
}catch (ConfigurationException cex){
    // Something went wrong
}
```

读取值

功能描述：允许读取单值和多值配置参数的类型访问

```java
Double double = config.getDouble("number");
Integer integer = config.getInteger("number");
```



### mapstruct

**[GitHub](https://github.com/mapstruct/mapstruct)、[官网](https://mapstruct.org/)、[教程](https://www.baeldung.com/mapstruct)**

>编译期动态生成 set/get 代码的class文件，在运行时直接调用该class的 set/get 方法。
>
>mapstruct是比较优秀的一个框架Java对象转换器。

```xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>${mapstruct.version}</version>
</dependency>
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-processor</artifactId>
    <version>${mapstruct.version}</version>
</dependency>
```



**简单示例**

转换 DO和DTO

```java
//用到了lombok简化代码
@Data 
public class Car {     
    private String make;     
    private int numberOfSeats;     
    private CarType type; 
}
@Data 
public class CarDTO {     
    private String make;     
    private int seatCount;     
    private String type; 
}
```

定义 Mapper

```java
//映射器接口: 要生成映射器以从对象中创建CarDto对象Car，需要定义映射器接口
@Mapper
public interface CarMapper {
 
    //通过Mappers 工厂生成静态实例使用。
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
 
    /**
    * @Mapper中描述映射，在编辑的时候mapstruct将会根据此描述生成实现类：
    * 	当属性与其目标实体副本同名时，它将被隐式映射。
    *	当目标实体中的属性具有不同名称时，可以通过@Mapping注释指定其名称。
    */
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}
```

使用映射器 Mapper

```java
//使用映射器:基于映射器接口，客户端可以以非常简单且类型安全的方式执行对象映射：
@Test
public void shouldMapCarToDto() {
    //given
    Car car = new Car("Morris", 5, CarType.SEDAN);
 
    //when
    CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
 
    //then
    assertThat(carDto).isNotNull();
    assertThat(carDto.getMake()).isEqualTo("Morris");
    assertThat(carDto.getSeatCount()).isEqualTo(5);
    assertThat(carDto.getType()).isEqualTo("SEDAN");
}
```



### dozer-不推荐

**[GitHub-已停止维护](https://github.com/DozerMapper/dozer)、 [官网-已停止维护](http://dozer.sourceforge.net/documentation/about.html)、[教程](https://cloud.tencent.com/developer/article/1014547)**

>运行期反射调用 set/get 或者是直接对成员变量赋值。
>
>Dozer是Java Bean到Java Bean映射器，它以递归方式将数据从一个对象复制到另一个对象。通常，这些Java Bean将具有不同的复杂类型。
>注意:dozer 目前不支持集合之间的转换 ,需要自己进行处理,稍后我会提供一个简单的工具类。
>
>缺点：性能有点差，官方已停止维护，不建议使用。

```xml
<dependency>
    <groupId>net.sf.dozer</groupId>
    <artifactId>dozer</artifactId>
    <version>${dozer.version}</version>
</dependency>
<dependency>
    <groupId>net.sf.dozer</groupId>
    <artifactId>dozer-spring</artifactId>
    <version>${dozer.version}</version>
</dependency>
```

**简单示例**

使用 `Mapper` 映射

```java
@Data
public class NotSameAttributeA {
    private long id;
    private String name;
    private Date date;
    @Mapping("binaryData")
    private String data;
    
    @Mapping("pk")
    public Long getId() {
        return this.id;
    }
}

@Data
public class NotSameAttributeB {
    private String pk;
    private String value;
    private Date date;
    private String binaryData;
}
```

```java
public class DozerTest {
    //自动装配
    @Autowired
    Mapper mapper;

    @Test
    public void testNotSameAttributeMapping() {
        NotSameAttributeA src = new NotSameAttributeA();
        src.setId(007);
        src.setName("邦德");
        src.setDate(new Date());

        NotSameAttributeB desc = mapper.map(src, NotSameAttributeB.class);
        Assert.assertNotNull(desc);
    }
}
```



### modelmapper

**[GitHub](https://github.com/modelmapper/modelmapper)、[官网](http://modelmapper.org/)、[教程1](http://modelmapper.org/getting-started/)**

> 自动确定一个对象模型如何映射到另一个对象模型，从而简化对象映射，同时提供一个简单、重构安全的 API 来处理特定用例。

```xml
<dependency>
    <groupId>org.modelmapper</groupId>
    <artifactId>modelmapper</artifactId>
    <version>${modelmapper.version}</version>
</dependency>
```

- 实用类：**ModelMapper**

**简单示例**

模型映射 

功能描述：尝试映射一些对象。考虑以下源和目标对象模型

DEMO 代码地址： [对象模型-示例代码库](https://github.com/jhalterman/modelmapper/tree/master/examples/src/main/java/org/modelmapper/gettingstarted)  

Source model

```java
// Assume getters and setters on each class
class Order {
  Customer customer;
  Address billingAddress;
}

class Customer {
  Name name;
}

class Name {
  String firstName;
  String lastName;
}

class Address {
  String street;
  String city;
}
```

Destination Model

```java
// Assume getters and setters
class OrderDTO {
  String customerFirstName;
  String customerLastName;
  String billingStreet;
  String billingCity;
}
```

使用 ModelMapper 将一个`order`实例隐式映射到一个新的`OrderDTO`：

```java
ModelMapper modelMapper = new ModelMapper();
OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
```

测试属性是否按预期映射：

```java
assertEquals(order.getCustomer().getName().getFirstName(), orderDTO.getCustomerFirstName());
assertEquals(order.getCustomer().getName().getLastName(), orderDTO.getCustomerLastName());
assertEquals(order.getBillingAddress().getStreet(), orderDTO.getBillingStreet());
assertEquals(order.getBillingAddress().getCity(), orderDTO.getBillingCity());
```



### poi

**[GitHub](https://github.com/apache/poi)、[官网](https://poi.apache.org/)、[教程-Excel](https://poi.apache.org/components/spreadsheet/quick-guide.html)**

> Apache POI - 访问 Microsoft 格式文件的 Java API。
>
> 例如：Excel、PowerPoint、Word、Visio、Outlook、OpenXML4J(OOXML)、Publisher、...

```xml
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>${poi.version}</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>${poi.version}</version>
</dependency>
```

**简单示例**

Excel 创建 Sheet

```java
Workbook wb = new HSSFWorkbook();  // or new XSSFWorkbook();
Sheet sheet1 = wb.createSheet("new sheet");
Sheet sheet2 = wb.createSheet("second sheet");

// 注意工作表名称为 Excel 不能超过 31 个字符
// 并且不得包含以下任何字符：
// 0x0000
// 0x0003
// 冒号 （：）
// 反斜杠 (\)
// 星号 (*)
// 问号 (?)
// 正斜杠 (/)
// 左方括号 ([)
// 右方括号 (])

// 你可以使用 org.apache.poi.ss.util.WorkbookUtil#createSafeSheetName(String nameProposal)}
// 为了安全地创建有效名称，此实用程序用空格 (' ') 替换无效字符
String safeName = WorkbookUtil.createSafeSheetName("[O'Brien's sales*?]"); // returns " O'Brien's sales   "
Sheet sheet3 = wb.createSheet(safeName);
try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
    wb.write(fileOut);
}
```

Excel 创建单元格

```java
Workbook wb = new HSSFWorkbook();
//Workbook wb = new XSSFWorkbook();
CreationHelper createHelper = wb.getCreationHelper();
Sheet sheet = wb.createSheet("new sheet");
// 创建一行并将一些单元格放入其中。行是基于 0 的。
Row row = sheet.createRow(0);
// 创建一个单元格并在其中放入一个值。
Cell cell = row.createCell(0);
cell.setCellValue(1);
// 或者在一行上做。
row.createCell(1).setCellValue(1.2);
row.createCell(2).setCellValue(
     createHelper.createRichTextString("This is a string"));
row.createCell(3).setCellValue(true);
// 将输出写入文件
try (OutputStream fileOut = new FileOutputStream("workbook.xls")) {
    wb.write(fileOut);
}
```



### easyexcel

**[GitHub](https://github.com/alibaba/easyexcel)、[官网](https://easyexcel.opensource.alibaba.com/)**

> EasyExcel是一个基于Java的、快速、简洁、解决大文件内存溢出的Excel处理工具。
> 他能让你在不用考虑性能、内存的等因素的情况下，快速完成Excel的读、写等功能。

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>easyexcel</artifactId>
    <version>${easyexcel.version}</version>
</dependency>
```

- 工具类：EasyExcel

**简单示例**

读Excel

DEMO代码地址：[ReadTest.java](https://github.com/alibaba/easyexcel/blob/master/src/test/java/com/alibaba/easyexcel/demo/read/ReadTest.java)

```java
    /**
     * 最简单的读
     * <p>1. 创建excel对应的实体对象 参照{@link DemoData}
     * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link DemoDataListener}
     * <p>3. 直接读即可
     */
    @Test
    public void simpleRead() {
        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, DemoData.class, new DemoDataListener()).sheet().doRead();
    }
```

写Excel

DEMO代码地址：[WriteTest.java](https://github.com/alibaba/easyexcel/blob/master/src/test/java/com/alibaba/easyexcel/test/demo/write/WriteTest.java)

```java
    /**
     * 最简单的写
     * <p>1. 创建excel对应的实体对象 参照{@link com.alibaba.easyexcel.test.demo.write.DemoData}
     * <p>2. 直接写即可
     */
    @Test
    public void simpleWrite() {
        String fileName = TestFileUtil.getPath() + "write" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去读，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data());
    }
```



### poi-tl

**[GitHub](https://github.com/Sayi/poi-tl)、[官网](http://deepoove.com/poi-tl/#_getting_started)、[教程](http://deepoove.com/poi-tl/#_getting_started)**

> poi-tl 是Word模板引擎，使用Word模板和数据**创建很棒的Word文档**。

```xml
<dependency>
    <groupId>com.deepoove</groupId>
    <artifactId>poi-tl</artifactId>
    <version>${poi-tl.version}</version>
</dependency>
```

- **XWPFTemplate**

**简单示例**

新建Word 模板文档`template.docx`，内容包含标签 `{{title}}`

```
{{title}}
```

代码

```java
XWPFTemplate template = XWPFTemplate.compile("template.docx").render(
  new HashMap<String, Object>(){{
    put("title", "Hi, poi-tl Word模板引擎");
}});  
template.writeAndClose(new FileOutputStream("output.docx")); 
```

输出文档`output.docx` 内容

```
Hi, poi-tl Word模板引擎
```



### zxing

**[GitHub](https://github.com/zxing/zxing)、[官网](https://github.com/zxing/zxing)、[教程]()**

> 创建与识别 二维码、条形码等工具包。
>
> 优点：google的开源项目，高可定制性, 识别多种码，不仅仅是二维码，不依赖第三方库。
>
> 支持格式：
>
> - **2D**：**QR Code**、Data Matrix、Aztec、PDF 417、MaxiCode、RSS-14、RSS-Expanded
> - **1D industrial**：Code 39、Code 93、Code 128、Codabar、ITF
> - **1D product**：UPC-A、UPC-E、EAN-8、EAN-13、UPC/EAN Extension 2/5

```xml
<dependency>
    <groupId>com.google.zxing</groupId>
    <artifactId>core</artifactId>
    <version>${zxing.version}</version>
</dependency>
<!--ZXing Java SE Extensions-->
<dependency>
    <groupId>com.google.zxing</groupId>
    <artifactId>javase</artifactId>
    <version>${zxing.version}</version>
</dependency>
```

- 工具类：QRCode

**简单示例**

二维码

生成二维码

```java
    @Test
    public void testQrcode2() {
        ByteArrayOutputStream bout =
                QRCode.from("https://www.baidu.com")
                        .withCharset("utf-8")
                        .withSize(250, 250)
                        .to(ImageType.PNG)
                        .stream();
        try {
            OutputStream out = new FileOutputStream("D:\\qrCode-2.png");
            bout.writeTo(out);
            out.flush();
            out.close();
            System.out.println("***********二维码生成成功！**********");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

根据模板生成二维码

```java
    @Test
    public void testQrcode3() {

        VCard vCard = new VCard();
        vCard.setName("myname");
        vCard.setAddress("上海市浦东新区张江镇");
        vCard.setCompany("公司名称");
        vCard.setPhoneNumber("15937966356");
        vCard.setTitle("Java开发");
        vCard.setEmail("122354652@qq.com");
        vCard.setWebsite("https://www.baidu.com");

        ByteArrayOutputStream bout =
                QRCode.from(vCard)
                        .withCharset("utf-8")
                        .withSize(250, 250)
                        .to(ImageType.PNG)
                        .stream();
        try {
            OutputStream out = new FileOutputStream("D:\\qrCode-3.png");
            bout.writeTo(out);
            out.flush();
            out.close();
            System.out.println("***********二维码生成成功！**********");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
```



### thumbnailator

**[GitHub](https://github.com/coobird/thumbnailator/)、[官网](https://github.com/coobird/thumbnailator)、[教程](https://cloud.tencent.com/developer/article/1779344)**

> 图片操作：缩略图、压缩图片、图片缩放、转换文件格式、旋转、裁剪与加水印等功能。
> 优点：压缩程度可控、压缩之后图片尽可能的不失真、压缩速度要快、代码简单，依赖较少。

```xml
<dependency>
    <groupId>net.coobird</groupId>
    <artifactId>thumbnailator</artifactId>
    <version>${thumbnailator.version}</version>
</dependency>
```

- 工具类：**Thumbnails**

**简单示例**

图片压缩

```java
//宽高缩放50%
Thumbnails.of("原图文件的路径") 		//原图(200px*162px)
        .scale(0.5) 				 //宽高缩放50%
        .toFile("压缩后文件的路径"); 	//压缩图(100px*81px)

//设置宽为原图100%，高为原图50%，非等比例缩放
Thumbnails.of("原图文件的路径")		//原图(200px*162px)
    	.scale(1.0, 0.5)
		.toFile("压缩后文件的路径");	//压缩图(200px*81px)
```

处理图片大小，并且添加水印

```java
Thumbnails.of(new File("/Users/baidu/work/image/xiaohuangren.jpg"))
                .size(200, 200)  //处理图片大小
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)  //添加水印 参数分别为（水印位置，水印图片的路径，透明度）
                .outputQuality(0.8f)  //压缩比例
                .toFile("/Users/baidu/work/image/xiaohuangrennew.jpg");  //生成的图片的位置
```



### easy-captcha

**[Gitee](https://gitee.com/ele-admin/EasyCaptcha)、[官网](https://gitee.com/ele-admin/EasyCaptcha)、[教程](https://gitee.com/ele-admin/EasyCaptcha)**

> Java图形验证码，支持gif、中文、算术等类型，可用于Java Web、JavaSE等项目。
>
> 支持类型：gif、中文、算术等类型

```xml
<dependency>
    <groupId>com.github.whvcse</groupId>
    <artifactId>easy-captcha</artifactId>
    <version>${easy-captcha.version}</version>
</dependency>
```

- 工具类：CaptchaUtil
- 验证码类型：GifCaptcha、ChineseCaptcha、ChineseGifCaptcha、ArithmeticCaptcha、...

**简单示例**

在 SpringMVC中使用

```java
@Controller
public class CaptchaController {
    //获取验证码(生成验证码)
    @RequestMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }
    
    //校验验证码
    @PostMapping("/login")
    public JsonResult login(String username,String password,String verCode){
        if (!CaptchaUtil.ver(verCode, request)) {
            CaptchaUtil.clear(request);  // 清除session中的验证码
            return JsonResult.error("验证码不正确");
        }
    }   
}
```

前端代码

```html
<img src="/captcha" width="130px" height="48px" />
```

**其它示例**

设置宽高和位数

```java
@RequestMapping("/captcha")
public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
    // 设置位数
    CaptchaUtil.out(5, request, response);
    // 设置宽、高、位数
    CaptchaUtil.out(130, 48, 5, request, response);

    // 使用gif验证码
    GifCaptcha gifCaptcha = new GifCaptcha(130,48,4);
    CaptchaUtil.out(gifCaptcha, request, response);
}
```

验证码类型

```java
public class Test {
    public static void main(String[] args) {
        // png类型
        SpecCaptcha captcha = new SpecCaptcha(130, 48);
        captcha.text();  // 获取验证码的字符
        captcha.textChar();  // 获取验证码的字符数组
        
        // gif类型
        GifCaptcha captcha = new GifCaptcha(130, 48);
        // 中文类型
        ChineseCaptcha captcha = new ChineseCaptcha(130, 48);
        // 中文gif类型
        ChineseGifCaptcha captcha = new ChineseGifCaptcha(130, 48);
        // 算术类型
        ArithmeticCaptcha captcha = new ArithmeticCaptcha(130, 48);
        
        captcha.setLen(3);  // 几位数运算，默认是两位
        captcha.getArithmeticString();  // 获取运算的公式：3+2=?
        captcha.text();  // 获取运算的结果：5
        
        captcha.out(outputStream);  // 输出验证码
    }
}
```

>注意：
> 算术验证码的len表示是几位数运算，而其他验证码的len表示验证码的位数，算术验证码的text()表示的是公式的结果， 对于算术验证码，你应该把公式的结果存储session，而不是公式。



### pinyin4j

**[GitHub](https://github.com/belerweb/pinyin4j)、[官网](https://github.com/belerweb/pinyin4j)、[教程](https://blog.csdn.net/qq_42449963/article/details/119847918)**

> 获取中文拼音

```xml
<dependency>
    <groupId>com.belerweb</groupId>
    <artifactId>pinyin4j</artifactId>
    <version>${pinyin4j.version}</version>
</dependency>
```

**简单示例**

```
参考教程
```

**其它示例**

**多音字识别**

在pinyin4j的基础上添加了多音字识别，带近一万个多音词，但是这远远不够，所以用户可设置外挂词库

**外挂多音词库**

用户配置的外挂词库会覆盖系统中相同词的读音,可用于纠错

配置方式很简单,只需要配置路径即可

```
MultiPinyinConfig.multiPinyinPath="/Users/yiboliu/my_multi_pinyin.txt"
```

格式同系统的多音词库,如:

```
吸血鬼日记 (xi1,xue4,gui3,ri4,ji4)
```



### dom4j

**[GitHub](https://github.com/dom4j/dom4j)、[官网](https://dom4j.github.io/)、[教程](https://dom4j.github.io/)**

> Dom4j用于 Java 解析 XML 、XPath和XSLT，完全支持 DOM，SAX 和 JAXP。了解基本的 [XML](https://so.csdn.net/so/search?q=XML&spm=1001.2101.3001.7020)-[DOM](https://so.csdn.net/so/search?q=DOM&spm=1001.2101.3001.7020) 模型，就能使用。

```xml
<dependency>
    <groupId>org.dom4j</groupId>
    <artifactId>dom4j</artifactId>
    <version>${dom4j.version}</version>
</dependency>
```

**简单示例**

读取xml文件

功能描述：读取`books.xml` 文件内容

books.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<books>
    <book sn="SN12341232">
        <name>辟邪剑谱</name>
        <price>9.9</price>
        <author>班主任</author>
    </book>
    <book sn="SN12341231">
        <name>葵花宝典</name>
        <price>99.99</price>
        <author>班长</author>
    </book>
</books>
```

Book.java

```java
@Data
public class Book {
    private String sn;
    private String name;
    private Double price;
    private String author;
}
```

测试类

```java
public class Dom4jTest {

    //直接读取内容
    @Test
    public void test01() throws SAXException, DocumentException {
        //读取内容
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/books.xml");
        System.out.println(document);
    }

    //读取books.xml文件，生成Book类
    @Test
    public void test02() throws DocumentException {
        //1、通过SAXReader解析器(SAXReader流对象---<这个说法我不知道是不是正确的，但其中肯定涉及到流对象>)读取book.xml文件,并通过read方法获取Document对象
       SAXReader saxReader = new SAXReader();
       Document document = saxReader.read("src/books.xml");

       //2、通过Document对象获取根元素(Element对象)
       Element rootElement = document.getRootElement();
//       System.out.println(rootElement);

       //3、通过根元素获取book标签对象
       List<Element> books = rootElement.elements("book");

       //4、遍历，处理每个Book标签转换为Book对象
        for(Element book:books){
/*            //(1)asXML()把标签对象(Element对象)转换为标签字符串
//            System.out.println(book.asXML());

            Element nameElement = book.element("name");
//            System.out.println(nameElement.asXML());

            //(2)getText() 可以获取标签里面的内容
            String nameText = nameElement.getText();
            System.out.println(nameText);//获取book下name标签里面的内容*/

            //所以，综上，先获取所有的子标签和属性
            String nameText = book.elementText("name");
            String priceText = book.elementText("price");
            String authorText = book.elementText("author");//elementText()直接获取调用者的标签值
            String snText = book.attributeValue("sn");
            System.out.println(new Book(snText,nameText,Double.parseDouble(priceText),authorText));
        }
   }
    
}
```



### dist-utils-core

**[GitLab]()、[官网]()、[教程]()**

> 上海数慧 定制工具包，第三方工具无法满足的情况，使用公司自定义工具类。
>
> 特点：
>
> - 不与框架耦合，任何Maven项目都可引入使用
> - 零依赖(没有依赖其它任何类库)

```xml
<!--Dist 定制工具包-->
<dependency>
    <groupId>com.dist</groupId>
    <artifactId>dist-utils-core</artifactId>
    <version>${dist-utils-core.version}</version>
</dependency>
```

- 工具类：ProjectPathUtil

**简单示例**

```java

```





### hutool-bom

**[GitHub](https://github.com/dromara/hutool/)、[官网](https://hutool.cn/)、[教程](https://hutool.cn/docs/#/)**

> Hutool是一个小而全的Java工具类库，通过静态方法封装，降低相关API的学习成本，提高工作效率，使Java拥有函数式语言般的优雅，让Java语言也可以“甜甜的”。
>
> Hutool中的工具方法来自每个用户的精雕细琢，它涵盖了Java开发底层代码中的方方面面，它既是大型项目开发中解决小问题的利器，也是小型项目中的效率担当；
>
> Hutool是项目中“util”包友好的替代，它节省了开发人员对项目中公用类和公用工具方法的封装时间，使开发专注于业务，同时可以最大限度的避免封装不完善带来的bug。

```xml
<dependency>
    <groupId>cn.hutool</groupId>
    <artifactId>hutool-bom</artifactId>
    <version>${hutool.version}</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

#### [包含组件](https://hutool.cn/docs/#/?id=🛠️包含组件)

一个Java基础工具类，对文件、流、加密解密、转码、正则、线程、XML等JDK方法进行封装，组成各种Util工具类，同时提供以下组件：

| 模块               | 介绍                                                         |
| ------------------ | ------------------------------------------------------------ |
| hutool-aop         | JDK动态代理封装，提供非IOC下的切面支持                       |
| hutool-bloomFilter | 布隆过滤，提供一些Hash算法的布隆过滤                         |
| hutool-cache       | 简单缓存实现                                                 |
| hutool-core        | 核心，包括Bean操作、日期、各种Util等                         |
| hutool-cron        | 定时任务模块，提供类Crontab表达式的定时任务                  |
| hutool-crypto      | 加密解密模块，提供对称、非对称和摘要算法封装                 |
| hutool-db          | JDBC封装后的数据操作，基于ActiveRecord思想                   |
| hutool-dfa         | 基于DFA模型的多关键字查找                                    |
| hutool-extra       | 扩展模块，对第三方封装（模板引擎、邮件、Servlet、二维码、Emoji、FTP、分词等） |
| hutool-http        | 基于HttpUrlConnection的Http客户端封装                        |
| hutool-log         | 自动识别日志实现的日志门面                                   |
| hutool-script      | 脚本执行封装，例如Javascript                                 |
| hutool-setting     | 功能更强大的Setting配置文件和Properties封装                  |
| hutool-system      | 系统参数调用封装（JVM信息等）                                |
| hutool-json        | JSON实现                                                     |
| hutool-captcha     | 图片验证码实现                                               |
| hutool-poi         | 针对POI中Excel和Word的封装                                   |
| hutool-socket      | 基于Java的NIO和AIO的Socket封装                               |
| hutool-jwt         | JSON Web Token (JWT)封装实现                                 |

可以根据需求对每个模块单独引入，也可以通过引入`hutool-all`方式引入所有模块:

引入单独模块示例-**推荐**

```xml
<dependencies>
    <dependency>
        <groupId>cn.hutool</groupId>
        <artifactId>hutool-http</artifactId>
    </dependency>
</dependencies>
```

引入所有模块 `hutool-all`示例-**不推荐**

```xml
<dependency>
    <groupId>cn.hutool</groupId>
    <artifactId>hutool-all</artifactId>
    <version>${hutool.version}</version>
</dependency>
```

引入核心工具包模块`hutool-core`示例-**推荐**

```xml
<dependencies>
    <dependency>
        <groupId>cn.hutool</groupId>
        <artifactId>hutool-core</artifactId>
    </dependency>
</dependencies>
```







**[GitHub]()、[官网]()、[教程]()**

