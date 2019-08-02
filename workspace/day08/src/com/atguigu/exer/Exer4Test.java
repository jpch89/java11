package com.atguigu.exer;

/*
4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
提示：
1) 生成随机数： Math.random()，返回值类型double;
2) 四舍五入取整： Math.round(double d)，返回值类型long。
*/

public class Exer4Test {
	public static void main(String[] args) {
		// 声明 Student 类型的数组
		// 也就是对象数组，就像前面的 String[] 一样
		Student[] students = new Student[20];
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].number = i + 1;
			// 年级：1-6
			students[i].state = (int)(Math.random() * 6 + 1);
			// 成绩：[0, 100]
			students[i].score = (int)(Math.random() * 101);
		}
		
		// 造一个当前类的对象
		Exer4Test test = new Exer4Test();
		
		// 遍历学生数组
		test.print(students);
		
		// 问题一：打印出3年级(state值为3）的学生信息。
		System.out.println("************");
		test.searchState(students, 3);
		
		// 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		System.out.println("************");
		test.sort(students);
		// 遍历
		test.print(students);
	}
	
	/**
	 * @Description 遍历 Student 数组
	 * @param students
	 */
	public void print(Student[] students) {
		// 遍历学生数组
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);  // 输出地址值
			// 引用类型的对象里面，不是 null 就是地址值
			System.out.println(students[i].info());
		}
	}
	
	/**
	 * @Description 查找Student数组中指定年级的学生信息
	 * @param students 要查找的数组
	 * @param state 要查找的年级
	 */
	public void searchState(Student[] students, int state) {
		// 打印出state年级的学生信息。
		for(int i = 0; i < students.length; i++) {
			if (students[i].state == state) {
				System.out.println(students[i].info());
			}
		}
	}
	
	/**
	 * @Description 使用冒泡排序对Student成绩进行升序排序。
	 * @param students
	 */
	public void sort(Student[] students) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = 0; j < students.length - i - 1; j++) {
				if (students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}
}

class Student {
	int number;  // 学号
	int state;  // 年级
	int score;  // 成绩
	
	// 显示学生信息的方法
	public String info() {
		return "学号：" + number + ", 年级：" + state + ", 成绩：" + score;
	}
}