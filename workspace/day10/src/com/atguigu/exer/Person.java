package com.atguigu.exer;

public class Person {
	private int age;
	
	public void setAge(int a) {
		if (a < 0 || a > 130) {
			System.out.println("请输入0-130的数字！");
			return;
		}
		age = a;
	}
	
	public int getAge() {
		return age;
	}
}
