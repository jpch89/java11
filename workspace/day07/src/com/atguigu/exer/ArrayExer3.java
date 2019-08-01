package com.atguigu.exer;

import java.util.Scanner;

public class ArrayExer3 {
	public static void main(String[] args) {
		System.out.println("请输入（1-20）的数字：");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num == 1) {
			int result = 1;
			System.out.println("结果为：");
			System.out.println(result);
		} else {
			// 结果矩阵
			int[][] result = new int[num][num];
			// 要填入的数字
			int count = 1;
			// 起始坐标
			int i0, j0;
			i0 = j0 = 0;
			// 计算结束坐标
			int endI, endJ;
			endI = endJ = num / 2;
			if (num % 2 == 0) {
				endJ--;
			}
			// 当前坐标
			int i = 0, j = 0;
			while (true) {
				/*
				 * if (count == num * num) { break; }
				 */
				// 从左到右
				for (i = i0, j = j0; i < num; i++) {
					if (result[i][j] != 0) {
						break;
					}
					result[i][j] = count++;
				}
				i0 = i - 1;
				j0 = j + 1;
				if(i0 == endI && j0 == endJ) {
					break;
				}
				
				// 从上到下
				for (i = i0, j = j0; j < num; j++) {
					if (result[i][j] != 0) {
						break;
					}
					result[i][j] = count++;
				}
				j0 = j - 1;
				i0 = i - 1;
				if(i0 == endI && j0 == endJ) {
					break;
				}
				
				// 从右到左
				for (i = i0, j = j0; i >= 0; i--) {
					if (result[i][j] != 0) {
						break;
					}
					result[i][j] = count++;
				}
				i0 = i + 1;
				j0 = j - 1;
				if(i0 == endI && j0 == endJ) {
					break;
				}
				
				// 从下到上
				for (i = i0, j = j0; j >= 0; j--) {
					if (result[i][j] != 0) {
						break;
					}
					result[i][j] = count++;
				}
				j0 = j + 1;
				i0 = i + 1;
				if(i0 == endI && j0 == endJ) {
					break;
				}
			}
			
			// 输出结果
			for (i = 0; i < num; i++) {
				for (j = 0; j < num; j++) {
					System.out.print(result[i][j] + "\t");
				}
				System.out.println();
			}
		}
		
		// 关闭 scanner
		scanner.close();
	}
}
