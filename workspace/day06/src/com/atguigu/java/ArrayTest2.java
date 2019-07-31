package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 1. 二维数组的声明和初始化
		int[] arr1 = new int[] {1, 2, 3};  // 一维数组
		// 静态初始化
		int[][] arr2 = new int[][] {{1, 2, 3}, {3, 4}, {4, 5, 6}};
		// 动态初始化 1
		// 外层有三个元素，每个元素是长度为 2 的一维数组
		String[][] arr3 = new String[3][2];
		// 动态初始化 2
		String[][] arr4 = new String[3][];
		// 错误的写法
		// String[][] arr5 = new String[][4];
		// String[4][3] arr6 = new String[][];
		// int[][] arr2 = new int[2][2] {{1, 2}, {3, 4}};
		// 也就是说，等号左边不能出现数字来指定长度。
		// 而等号右边数字要么指定长度，要么用来指定初始值，不能同时出现。
		
		// 变体：也是正确的
		int arr5[][] = new int[][] {{1, 2}, {3, 4}};
		int[] arr6[] = new int[][] {{1, 2}, {3, 4}};
		// 类型推断，也是正确的
		// 省略了等号右边的 new int[][]，因为它也不可能是别的
		// 但是，如果先声明，再赋值的情况不能省略，不在一行推断不出来
		int[][] arr7 = {{1, 2}, {3, 4}};
	}
}
