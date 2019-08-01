package com.atguigu.java;

public class ArrayTest4 {
	public static void main(String[] args) {
		// 二分查找：前提条件是数据必须有序
		int[] arr = new int[] {-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
		
		int target = 66;
		int head = 0;  // 初始的首索引
		int tail = arr.length - 1;  // 初始的尾索引
		boolean found = false;
		
		while (head <= tail) {
			int middle = (head + tail) / 2;  // 得到小数取左边的
			if (target == arr[middle]) {
				System.out.println("找到了，在：" + middle);
				found = true;
				break;
			} else if (arr[middle] > target) {
				tail = middle - 1;
			} else {
				head = middle + 1;
			}
		}
		
		if (!found) {
			System.out.println("没找到！");
		}
	}
}
