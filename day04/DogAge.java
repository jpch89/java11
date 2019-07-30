import java.util.Scanner;

class DogAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        int dogAge = scanner.nextInt();
        double humanAge = 0;

        if (dogAge < 0) {
            System.out.println("请输入正确的年龄！");
        } else if (dogAge <= 2) {
            humanAge = dogAge * 10.5;
        } else {
            humanAge = 2 * 10.5 + (dogAge - 2) * 4;
        }

        System.out.println("相当于人的年龄：" + humanAge);
    }
}
