package com.atguigu.java;

import java.util.Scanner;

public class ArrayExercise {
	public static void main(String[] args) {
		// 1. 使用 Scanner，读取学生个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int num = scanner.nextInt();
		// 2. 创建数组，存储学生成绩：动态初始化
		double[] scores = new double[num];
		// 3. 给数组中的元素赋值
		System.out.println("请输入" + num + "个成绩：");
		for (int i = 0; i < num; i++) {
			scores[i] = scanner.nextDouble();
		}
		// 4. 获取数组中的元素的最大值：最高分
		double max = scores[0];
		for (int i = 0; i < num; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("最高分是：" + max);
		// 5. 根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		for (int i = 0; i < num; i++) {
			String grade;
			if (scores[i] >= max - 10) {
				grade = "A";
			} else if (scores[i] >= max - 20) {
				grade = "B";
			} else if (scores[i] >= max - 30) {
				grade = "C";
			} else {
				grade = "D";
			}
			System.out.print("学生 " + i + " 的分数是 " + scores[i]);
			System.out.println(" 等级是 " + grade);
		}
		
		/*
		请输入学生个数：
		5
		请输入5个成绩：
		56
		74
		89
		41
		89
		最高分是：89.0
		学生 0 的分数是 56.0 等级是 D
		学生 1 的分数是 74.0 等级是 B
		学生 2 的分数是 89.0 等级是 A
		学生 3 的分数是 41.0 等级是 D
		学生 4 的分数是 89.0 等级是 A
		 */
	}
}
