package com.atguigu.exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		double area = c1.calcArea();
		// radius 属性默认初始化为 0.0
		System.out.println(area);  // 0.0
		
		c1.radius = 2;
		area = c1.calcArea();
		System.out.println(area);  // 12.566370614359172
	}
}

// 圆
class Circle{
	// 属性
	double radius;
	
	// 求圆的面积
	public double calcArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
}