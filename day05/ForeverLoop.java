import java.util.Scanner;

class ForeverLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pos, neg;
        pos = neg = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num > 0) {
                pos += 1;
            } else if (num < 0) {
                neg += 1;
            } else {
                break;
            }
        }

        System.out.println("正数个数：" + pos);
        System.out.println("负数个数：" + neg);
    }
}
