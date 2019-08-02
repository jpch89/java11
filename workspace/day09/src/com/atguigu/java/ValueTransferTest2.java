package com.atguigu.java;

public class ValueTransferTest2 {
	public static void main(String[] args) {
		Data data = new Data();
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);
		
		ValueTransferTest2 v = new ValueTransferTest2();
		v.swap(data);
		
		System.out.println("m = " + data.m + ", n = " + data.n);
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}

class Data{
	int m;
	int n;
}