package com.atguigu.java;

public class ArrayTest3 {
	public static void main(String[] args) {
		// y 是一个二维数组
		int[] x, y[];
		
		int[][] arr1 = new int[3][];
		System.out.println(arr1[0]);  // null
		
		System.out.println("**********");
		int[][] arr2 = new int[3][4];
		System.out.println(arr2);  // [[I@15db9742
		System.out.println(arr2[0]);  // [I@6d06d69c
		System.out.println(arr2[0][0]);  // 0
		
		System.out.println("**********");
		float[][] arr3 = new float[4][3];
		System.out.println(arr3[1]);  // [F@7852e922
		System.out.println(arr3[1][1]);  // 0.0
		
		System.out.println("**********");
		String[][] arr4 = new String[4][2];
		System.out.println(arr4[1]);  // [Ljava.lang.String;@4e25154f
		System.out.println(arr4[1][1]);  // null
		
		System.out.println("**********");
		String[][] arr5 = new String[4][];
		System.out.println(arr5[1]);  // null
		// System.out.println(arr5[1][0]);  // 报错 NullPointerException
		
		
	}
}
