package com.atguigu.exer;

public class ArrayExer7 {
	// 实现数组的复制
	public static void main(String[] args) {
		int[] array1;
		array1 = new int[] {2,3,5,7,11,13,17,19};
		int[] array2 = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		// 修改array2中的偶索引元素，使其等于索引值
		for(int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
				}
		}
		// 打印出array1
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		// 打印出array2
		System.out.println();
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}
		/*
		 * 2 3 5 7 11 13 17 19
		 * 0 3 2 7 4  13 6  19
		 */
	}
}
