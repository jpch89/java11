/*
一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。
编程找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
*/

class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int factorSum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    factorSum += j;
                }
            }

            if (i == factorSum) {
                System.out.println(i);
            }
        }
    }
}

/*
6
28
496
*/
