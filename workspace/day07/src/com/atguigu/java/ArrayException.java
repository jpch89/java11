package com.atguigu.java;

public class ArrayException {
	public static void main(String[] args) {
		// 数组中的常见异常
		// 1. 数组角标越界的异常：ArrayIndexOutOfBoundsException
		int[] arr = new int[] {1, 2, 3, 4, 5};
//		for(int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// 也不允许负数，只能 0 到 arr.length - 1
		
		// 2. 空指针异常：NullPointerException
		// 情况一：
		// int[] arr1 = new int[] {1, 2, 3};
		// arr1 = null;  // 把地址擦掉了
		// System.out.println(arr1[0]);  // NullPointerException
		
		// 情况二：
		// int[][] arr2 = new int[4][];
		// System.out.println(arr2[0]);  // null
		// System.out.println(arr2[0][0]);  // NullPointerException
		
		// 情况三：
		String[] arr3 = new String[] {"AA", "BB", "CC"};
		System.out.println(arr3[0].toString());  // AA
		arr3[0] = null;
		System.out.println(arr3[0].toString());  // NullPointerException
		// 其实情况三不属于数组的范畴，而是属于面向对象的范畴
		// 调用对象上的方法时，对象是一个空指针，所以会抛出异常
	}
}
