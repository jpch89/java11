package com.atguigu.java;

// java.util.Arrays：操作数组的工具类，里面定义了很多操作数组的方法
import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		// 1. boolean equals(int[] a, int[] b)：判断两个数组是否相等
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = new int[] {1, 3, 2, 4};
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println(isEqual);  // false
		
		// 2. String toString(int[] a)：输出数组信息。
		System.out.println(Arrays.toString(arr1));
		// [1, 2, 3, 4]
		
		// 3. void fill(int[] a, int val)：将指定值填充到数组当中。
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		// [10, 10, 10, 10]
		
		// 4. void sort(int[] a)：对数组进行排序。
		Arrays.sort(arr2);  // 底层用的也是快排，只不过有些小变化
		System.out.println(Arrays.toString(arr2));
		// [1, 2, 3, 4]
		
		// 5. int binarySearch(int[] a, int key)
		int[] arr3 = new int[] {-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
		int index = Arrays.binarySearch(arr3, 210);
		System.out.println(index);  // 8
		index = Arrays.binarySearch(arr3, 211);
		System.out.println(index);  // -10
		// 返回负数就是没找到
		// 查看源码，返回的是  -(low + 1)
	}
	
}
