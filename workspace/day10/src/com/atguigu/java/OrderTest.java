package com.atguigu.java;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderDefault = 1;
		order.orderPublic = 2;
		// 出了 Order 类之后，私有成员不能调用
		// The field Order.orderPrivate is not visible
		// order.orderPrivate = 3;
		
		order.methodPublic();
		order.methodDefault();
		// 出了 Order 类之后，私有成员不能调用
		// order.methodPrivate();
	}
}
