// 如何获取一个随机数？

class RandomTest {
    public static void main(String[] args) {
        // double value = Math.random();  // [0.0, 1.0)
        int value = (int)(Math.random() * 90 + 10);  // [10, 99]

        // 公式：[a, b]
        // (int)(Math.random() * (b - a + 1) + a)
    }
}
