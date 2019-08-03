package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		// p.age = 1;
		p.setAge(12);
		System.out.println("年龄为：" + p.getAge());
	}
}
