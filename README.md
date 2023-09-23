##### OSON
JSON轻量级解析工具;  
在JAVA-ORG.JSON源码基础上扩展编写;  
支持T、Object、Array、Map、List、Collection、Stack、Vector、ArrayList、LinkList、JSONArray、JSONObject;  
#### Jar
|网站|名称|操作|
|-|-|-|
|GitHub|jar|[下载](https://github.com/RelinRan/OSON/blob/master/jar)|
|Gitee|jar|[下载](https://gitee.com/relin/OSON/blob/main/jar)|
#### Jitpack
/build.grade
```
allprojects {
    repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
/app/build.grade
```
dependencies {
	 implementation 'com.github.RelinRan:OSON:2023.9.23.1'
}
```
#### Debug
```
OSON oson = new OSON();
//设置调试模式，调试错误使用
oson.setDebug(true);
```
#### Object

```
//Object -> JSON
String json = oson.toJson(object);
//JSON -> Object
User user = oson.toObject(json,User.class);
```
#### Array
```
String[] array = oson.toArray(json,String.class);
```
#### List
```
List<User> list = oson.toList(json,User.class);
List<String> list = oson.toList(json,String.class);
```
#### Collection
```
ArrayList<User> list = oson.toCollection(json,ArrayList.class,User.class);
Stack<User> list = oson.toCollection(json,Stack.class,User.class);
Vector<User> list = oson.toCollection(json,Vector.class,User.class);
Collection<String> decode = oson.toCollection(json,Collection.class,String.class);
```
#### T
```
//多个泛型
Map<String,Class<?>> variable = new HashMap<>();
variable.put("data",Data.class);
User<Data> user = oson.toObject(json,user,variable);
//单个泛型
User<Data> user = oson.toObject(json,User.class,"data",Data.class);
```
#### Map
```
Map<String,Object> map = oson.toMap(json);
```
#### List Map
```
List<Map<String, Object>> listMap =  oson.toMapCollection(json);
```
