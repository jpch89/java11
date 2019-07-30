class BreakContinue {
    public static void main(String[] args) {
        label: for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 4) {
                    // break label;
                    // continue label;
                    break;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}

/*
break label; 输出
i: 0, j: 0
i: 0, j: 1
i: 0, j: 2
i: 0, j: 3
*/

/*
continue label; 输出
i: 0, j: 0
i: 0, j: 1
i: 0, j: 2
i: 0, j: 3
i: 1, j: 0
i: 1, j: 1
i: 1, j: 2
i: 1, j: 3
*/

/* break; 输出
i: 0, j: 0
i: 0, j: 1
i: 0, j: 2
i: 0, j: 3
i: 1, j: 0
i: 1, j: 1
i: 1, j: 2
i: 1, j: 3
*/
