import java.util.Scanner;


class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入岳小鹏期末成绩：[0-100]");
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一台iPhone");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一个iPad");
        } else {
            System.out.println("什么奖励都没有");
        }

    }
}
