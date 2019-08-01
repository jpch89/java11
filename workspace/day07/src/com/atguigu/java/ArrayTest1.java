package com.atguigu.java;

// 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
// 然后求出所有元素的最大值， 最小值，和值， 平均值， 并输出出来。
// 要求： 所有随机数都是两位数。

public class ArrayTest1 {
	public static void main(String[] args) {
		// 10 - 99
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			// [10, 99]
			// 公式：(int)(Math.random() * (b - a + 1) + a)
			arr[i] = (int)(Math.random() * 90 + 10);
		}
		
		// 最大值
		int maxValue = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		
		// 最小值
		int minValue = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		
		// 总和
		int sumValue = 0;
		for(int i = 0; i < arr.length; i++) {
			sumValue += arr[i];
		}
		
		// 平均数
		double averageValue = sumValue / 10;
		
		// 输出数组
		System.out.println("数组为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("最大值：" + maxValue);
		System.out.println("最小值：" + minValue);
		System.out.println("总和：" + sumValue);
		System.out.println("平均数：" + averageValue);
	}
}
