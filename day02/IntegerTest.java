class IntegerTest {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = -128;
        // b2 = 128; // 编译不通过！
        System.out.println(b1);
        System.out.println(b2);

        // long 类型必须带 l 或者 L
        // 但是输出的时候不带 l 或者 L
        long number = 2341243124234L;
        System.out.println(number);

        // 开发的时候最常用 int
    }
}
