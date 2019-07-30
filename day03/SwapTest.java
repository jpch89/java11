class SwapTest{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        // 方式一：使用中间变量
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        /*
        n1 = 20
        n2 = 10
        */

        // 方式二：加减法
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        /*
        n1 = 10
        n2 = 20
        */

        // 方式三：使用位运算符
        // 局限性：只能用于数值类型；更难理解
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        /*
        n1 = 20
        n2 = 10
        */
    }
}
