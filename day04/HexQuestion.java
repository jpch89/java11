/*
如何求一个0~255范围内的整数的十六进制值，例如60的十六进制表示形式3C
*/

class HexQuestion {
    public static void main(String[] args) {
        // 方式一：自动实现
        String str1 = Integer.toBinaryString(60);
        String str2 = Integer.toHexString(60);

        // 方式二：手动实现
        int i = 60;
        int temp = i & 15;  // 取低4位
        String low = (temp > 9) ? (char)(temp - 10 + 'A') + "" : temp + "";

        i = i >>> 4;
        temp = i & 15;  // 取高4位
        String high = (temp > 9) ? (char)(temp - 10 + 'A') + "" : temp + "";

        String result = high + low;
        System.out.println("结果为: " + result);
    }
}
