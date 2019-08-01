package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ", "DD", "MM", "BB", "GG", "AA"};
		
		// 数组的复制（区别于数组变量的赋值，arr1 = arr）
		String[] arr1 = new String[arr.length];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		// 数组的反转
		// 方法一：
		for(int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		// 遍历
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		// 方法二：
		for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// 遍历
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		// 方法三：不推荐，用一个临时数组
	}
}
