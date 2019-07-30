/*
如何从键盘获取不同的变量：需要使用 Scanner 类

具体实现步骤：
1. 导包：import java.util.Scanner;
2. Scanner 的实例化
3. 调用 Scanner 类的相关方法 next() / nextXxx()，来获取指定类型的变量
*/

import java.util.Scanner;


class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了呢？(true/false)");
        boolean isLove = scan.nextBoolean();
        System.out.println(isLove);

        // 对于 char 类型的获取，Scanner 没有提供相关的方法，只能获取一个字符串。
        System.out.println("请输入你的性别：(男/女)");
        String gender = scan.next();
        char genderChar = gender.charAt(0);  // 获取索引为 0 位置上的字符
        System.out.println(genderChar);

    }
}
