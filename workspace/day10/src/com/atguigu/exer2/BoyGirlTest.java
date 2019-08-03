package com.atguigu.exer2;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("罗密欧", 21);
		boy.shout();  // 先多谈谈恋爱！
		
		Girl girl = new Girl("朱丽叶", 18);
		girl.marry(boy);
		// 我想嫁给罗密欧
		// 我想娶朱丽叶
		
		Girl girl1 = new Girl("祝英台", 19);
		int compare = girl.compare(girl1);
		System.out.println(compare);  // -1
	}
}
