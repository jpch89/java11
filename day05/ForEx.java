/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/
class ForEx{
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            int star = i + 1;
            if (i > 4) {
                star = 9 - i;
            }

            for (int j = 0; j < 5 - star; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
