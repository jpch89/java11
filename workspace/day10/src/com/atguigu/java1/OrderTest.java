package com.atguigu.java1;

import com.atguigu.java.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderPublic = 1;
		// 出了 Order 类所属的包之后，私有和缺省的成员不可用
		// order.orderDefault = 2;
		// 出了 Order 类之后，私有成员不能调用
		// The field Order.orderPrivate is not visible
		// order.orderPrivate = 3;
		
		order.methodPublic();
		// 出了 Order 类所属的包之后，私有和缺省的成员不可用
		// order.methodDefault();
		// 出了 Order 类之后，私有成员不能调用
		// order.methodPrivate();
	}
}
