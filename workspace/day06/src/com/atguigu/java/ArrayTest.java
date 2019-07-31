package com.atguigu.java;

/* 
 * 一维数组的使用：
 * 1. 一维数组的声明和初始化
 * 2. 如何调用数组指定位置的元素
 * 3. 如何获取数组的长度
 * 4. 如何遍历数组
 * 5. 数组元素的默认初始化值
 * 6. 数组的内存解析
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 一维数组的声明和初始化
		int num;  // 声明
		num = 10;  // 初始化
		int id = 1001;  // 声明 + 初始化
		
		int[] ids;  // 声明
		// 1.1 静态初始化：数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001, 1002, 1003, 1004};  // 初始化
		// 1.2 动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		// 错误的写法：
		// int[] arr1 = new int[];
		// int[5] arr2 = new int[5];
		// int[] arr3 = new int[3] {1, 2, 3};
		
		// 总结：数组一旦初始化完成，其长度就确定了。
		
		// 2. 如何调用数组的指定位置的元素：通过角标的方式调用。
		// 数组的角标（或索引）从 0 开始，到数组的长度 - 1 结束。
		names[0] = "王大";
		names[1] = "王二";
		names[2] = "王三";
		names[3] = "王四";
		names[4] = "王五";
		
		// 3. 如何获取数组的长度。
		// 属性：length
		System.out.println(names.length);  // 5
		System.out.println(ids.length);  // 4
		
		// 4. 如何遍历数组
		// 遍历：从头到尾都经历一遍。
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 5. 数组元素的默认初始化值
		int[] arr = new int[4];  // 动态初始化
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);  // 输出 4 个 0
		}
		// 数组元素是整型：byte、short、int、long 都是 0
		// 数组元素是浮点型：float、double 都是 0.0
		// 数组元素是字符类型 char：是 0 或者 '\u0000'，而非 '0'
		// 数组元素是布尔类型 boolean：false
		
		// 数组元素是引用数据类型时，默认值为 null，空值。
		
		
	}
}
