class AriTest {
    public static void main(String[] args) {
        // 除法：整型与整型运算，得到的还是整型
        int num1 = 12;
        int num2 = 5;

        int res1 = num1 / num2;
        System.out.println(res1);  // 2

        int res2 = num1 / num2 * num2;
        System.out.println(res2);  // 10

        double res3 = num1 / num2;
        System.out.println(res3);  // 2.0

        double res4 = num1 / num2 + 0.0;  // 2.0
        double res5 = num1 / (num2 + 0.0);  // 2.4
        System.out.println(res4);
        System.out.println(res5);

        double res6 = (double)num1 / num2;  // num1 强转先运算
        System.out.println(res6);  // 2.4

        double res7 = (double)(num1 / num2);
        System.out.println(res7);  // 2.0
    }
}
