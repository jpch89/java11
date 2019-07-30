class LongTest {
    public static void main(String[] args) {
        long l1 = 123123;
        System.out.println(l1);
        // 这样不会报错，是因为 1231123 被当成 int 型，然后发生了自动类型提升

        // long l2 = 1231234123412345;
        /*
        LongTest.java:7: 错误: 过大的整数: 1231234123412345
        long l2 = 1231234123412345;
                  ^
        1 个错误
        */

        long l2 = 1231234123412345L;
        System.out.println(l2);

    }
}
