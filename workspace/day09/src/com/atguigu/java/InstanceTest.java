package com.atguigu.java;

public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		
		// 匿名对象
		new Phone().sendEmail();
		new Phone().playGame();  // 与上面调用的并不是同一个对象
		
		new Phone().price = 1999;
		new Phone().showPrice();
		// 手机价格为：0.0
		
		//**********************
		PhoneMall mall = new PhoneMall();
		// 匿名对象的使用
		mall.show(new Phone());
	}
}

class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;  // 价格
	
	public void sendEmail() {
		System.out.println("发送邮件");
	}
	
	public void playGame() {
		System.out.println("玩游戏");
	}
	
	public void showPrice() {
		System.out.println("手机价格为：" + price);
	}
}