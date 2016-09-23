# Java_front_end
A compiler front end by Java

### 创建
```Shell
javac lexer/*.java
javac symbols/*.java
javac inter/*.java
javac parser/*.java
javac main/*.java
```

### 示例

> 翻译示例文件
```C
java main.Main test     # 翻译test文件 
```
> 翻译控制台输入内容
```C
java main.Main          # 默认由System.in输入
```
