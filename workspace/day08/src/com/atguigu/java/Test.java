package com.atguigu.java;

public class Test {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 4, 2, 8, 5, 7};
		int target = 1;
		int location = -1;
		int i;
		for (i = 0; i < arr.length; i ++) {
			if (arr[i] == target) {
				location = i;
				break;
			}
		}
		
		if (i == arr.length) {
			System.out.println("没找到。");
		} else {
			System.out.println("找到了，在：" + location);
		}
	}
}
