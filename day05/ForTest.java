import java.util.Scanner;

class ForTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个正整数：");
        int m = scanner.nextInt();

        System.out.println("请输入第二个正整数：");
        int n = scanner.nextInt();

        // 获取两个数中的最小值
        int min = m <= n ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;  // 找到了最大公约数
            }
        }

        // 获取两个数中的最大值
        int max = m > n ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
