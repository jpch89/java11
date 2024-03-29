package com.atguigu.exer;

/*
使用简单数组
(1)创建一个名为ArrayTest6的类，在main()方法中声明array1和array2两个变量，
他们是int[]类型的数组。
(2)使用大括号{}，把array1初始化为8个素数： 2,3,5,7,11,13,17,19。
(3)显示array1的内容。
(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
(如array[0]=0,array[2]=2)。打印出array1。
思考： array1和array2是什么关系？
拓展： 修改题目，实现array2对array1数组的复制
*/

public class ArrayExer6 {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] {2,3,5,7,11,13,17,19};
		// 显示 array1 的内容
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		// 赋值array2变量等于array1
		// 这个操作不能称作数组的复制！！！
		array2 = array1;
		// 修改array2中的偶索引元素，使其等于索引值
		for(int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
			}
		}
		// 打印出array1
		System.out.println();
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		/*
		 * 2 3 5 7 11 13 17 19
		 * 0 3 2 7 4  13 6  19
		 */
		// array1 和 array2 指向堆内存中的同一个数组
		// 因为它们两个里面保存的地址值一样
		// 其实除了地址值，还能保存类型，所以不同类型的地址值不能随便赋值
		// 必须要求类型一致
	}
}
