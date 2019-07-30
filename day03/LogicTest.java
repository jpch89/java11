class LogicTest {
    public static void main(String[] args) {
        // 区分 & 与 &&
        // 结果相同
        // 左边是 false 时，双与不会继续执行到右边
        boolean b1 = false;
        int num1 = 10;

        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println("num1 = " + num1);

        // 下面用 &&
        boolean b2 = false;
        int num2 = 10;

        if (b2 && (num2++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
        System.out.println("num2 = " + num2);

        /*
        我现在在南京
        num1 = 11
        我现在在南京
        num2 = 10
        */
    }
}
