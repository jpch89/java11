package com.atguigu.exer;

// 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。
// 同时，要求元素的值各不相同。

public class ArrayExer2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int i = 0;
		
		while (i < arr.length) {
			int num = (int)(Math.random() * 30 + 1);
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == num) {
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate) {
				continue;
			} else {
				arr[i] = num;
				i++;
			}
		}
		
		// 输出
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
