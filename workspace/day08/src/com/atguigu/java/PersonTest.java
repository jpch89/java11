package com.atguigu.java;

// 测试类
public class PersonTest {
	public static void main (String[] args) {
		// 创建 Person 类的对象
		// 创建类的对象 = 类的实例化 = 实例化类
		Person p1 = new Person();
		
		// 调用对象的结构：属性和方法
		// 调用属性的格式：对象名.属性
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		// 调用方法的格式：对象名.方法
		p1.eat();
		p1.sleep();
		p1.talk("中文");
		
		//****************************
		Person p2 = new Person();
		System.out.println(p2.name);  // null，不会报错
		System.out.println(p2.isMale);  // false
		// 属性有默认的初始化值
		
		//****************************
		// 将 p1 变量保存的对象地址值赋值给 p3
		// 导致 p1 和 p3 指向了堆空间的同一个对象实体
		Person p3 = p1;
		System.out.println(p3.name);  // Tom
		p3.age = 10;
		System.out.println(p1.age);  // 10
	}
}


class Person {
	// 属性
	String name;
	int age = 1;
	boolean isMale;
	
	// 方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话，使用的是：" + language);
	}
}
