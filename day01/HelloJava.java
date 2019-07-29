/*
1. Java 规范的三种注释方式
单行注释
多行注释
文档注释

2. 单行注释和多行注释的作用
对所写的程序进行解释说明，增强可读性。方便别人，方便自己。
调试所写的代码

3. 特点
被注释的内容不参与编译，
换句话说，编译以后生成的 .class 结尾的字节码文件不包含注释掉的信息。

4. 文档注释的使用：
注释内容可以被 JDK 提供的工具 javadoc 所解析，生成一套以网页文件形式体现的该程序的说明文档

5. 多行注释不可以嵌套使用
*/

/**
文档注释
@author 指定java程序的作者
@version 指定源文件的版本
*/

public class HelloJava {
    // 单行注释：main 方法是程序的入口！
    /*
    多行
    注释
    */
    /**
    如下的方法是 main()，作用：程序的入口。
    */
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
