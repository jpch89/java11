package com.atguigu.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[] {32, 34, 32, 5, 54, 654, -98, 0, -53, 5};
		
		int max = util.getMax(arr);
		System.out.println("最大值为：" + max);
	}
}
