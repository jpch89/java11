package com.atguigu.exer2;

public class Girl {
	private String name;
	private int age;
	
	public Girl() {
		
	}
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给" + boy.getName());
		// boy.marry(new Girl());  // 匿名对象是另一个 girl
		boy.marry(this);
	}
	
	/**
	 * @description 比较两个girl对象的大小
	 * @param girl
	 * @return 正数：当前对象大；负数：当前对象小；0：相等
	 */
	public int compare(Girl girl) {
		if (this.age > girl.age) {
			return 1;
		} else if (this.age < girl.age) {
			return -1;
		} else {
			return 0;
		}
		
		// 简化：
		// return this.age - girl.age;
	}
}
