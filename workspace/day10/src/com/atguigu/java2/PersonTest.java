package com.atguigu.java2;

public class PersonTest {

}

class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		// 调用无参数构造器
		// this();
		
		this(name);
		// this.name = name;
		 this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		// return name;
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		// return age;
		return this.age;
	}
	
	public void eat() {
		System.out.println("人吃饭");
		study();
		// this.study();
		// 相当于谁调用 eat 方法，我就调用谁的 study 方法
	}
	
	public void study() {
		System.out.println("人学习");
	}
	
}