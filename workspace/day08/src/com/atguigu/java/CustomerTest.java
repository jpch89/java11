package com.atguigu.java;
// 类中方法的声明和使用
// 方法：描述类应该具有的功能
// 比如：Math类：sqrt()、random()
//       Scanner类：nextXxx()
//       Arrays类：sort()、binarySearch()、toString()、equals()

public class CustomerTest {
	
}

class Customer {
	String name;
	int age;
	boolean isMale;
	
	// 方法
	public void eat() {
		System.out.println("客户吃饭！");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "小时");
	}
	
	public String getName() {
		return name;
	}
	
	public String getNation(String nation) {
		String info = "我的国籍是：" + nation;
		return info;
	}
}
