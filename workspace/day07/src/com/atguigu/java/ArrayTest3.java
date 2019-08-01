package com.atguigu.java;

public class ArrayTest3 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ", "DD", "MM", "BB", "GG", "AA"};
		
		// 查找（或搜索）
		// 线性查找
		String target = "BB";
		boolean flag = true;
		for(int i = 0; i < arr.length; i++) {
			if(target.equals(arr[i])) {
				System.out.println("找到了，在：" + i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("没找到！");
		}
	}
}
