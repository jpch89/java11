/*
String 类型变量的使用：
1. String 属于引用数据类型，翻译为：字符串
2. 声明 String 类型变量时，使用一对双引号 ""
3. String 可以和 8 种基本数据类型变量做运算，且只能是连接运算，使用加号 +。
4. String 类型进行连接运算，运算结果还是 String 类型。
*/

class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello world!";
        String s2 = "";

        // 注意不能这样，char 必须放一个字符
        // char c = '';

        boolean b1 = false;
        String s3 = "娃哈哈";
        String info = b1 + s3;
        System.out.println(info);  // false娃哈哈

    }
}
