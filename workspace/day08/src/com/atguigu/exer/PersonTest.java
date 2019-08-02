package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
		
		p1.study();  // studying
		p1.showAge();  // age: 18
		
		int newAge = p1.addAge(2);
		// Tom的新年龄为：20
		System.out.println(p1.name + "的新年龄为：" + newAge);
		// 20
		System.out.println(p1.age);
		
		//*********************
		Person p2 = new Person();
		p2.showAge();  // age: 0
		p2.addAge(10);
		p2.showAge();  // age: 10
		
		p1.showAge();  // age: 20
		
	}
}
