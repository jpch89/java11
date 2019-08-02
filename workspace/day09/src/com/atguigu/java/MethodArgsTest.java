package com.atguigu.java;

public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");  // 会优先考虑接收一个字符串的方法！
		// 可以是 0 - 很多个
		test.show();
		
		// 调用方法还可以跟数组一样！
		test.show("AA", "BB", "CC");
		test.show(new String[] {"AA", "BB", "CC"});
	}
	
	public void show(int i) {
		
	}
	
	/*
	public void show(String s) {
		System.out.println(s);
	}
	*/
	
	public void show(String ... strs) {
		System.out.println("show(String... str)");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	// 这个会报错！！！
	// 因为这是 JDK 5.0 以前的写法
	// 不能和 ... 一起使用，只能二者择其一
	/*
	public void show(String[] strs) {
		
	}
	*/
}
