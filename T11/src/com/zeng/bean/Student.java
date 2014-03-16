package com.zeng.bean;

/**
 * 1、编写一个Student类，要求： （1）具有属性：姓名，性别，年龄，年级。 （2）具有方法：自我介绍，负责输出该学生的所有属性。
 * （3）具有两个带参数的构造方法：第一个构造方法中，具有 两个参数：姓名、年龄。性别默认为男，年级为S1，其它属性由参数
 * 给定；第二个构造方法中，所有属性的值都由参数给定。 （4）编写测试类StudentTest进行测试，分别以两种方式完成对两个
 * Student对象的初始化工作，并分别调用它们的自我介绍方法，看看输出结果。
 * 
 * @author Zeng
 * 
 */

public class Student {

	private String name, sex, grade;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.sex = "男";
		this.grade = "S1";
	}

	public Student(String name, String sex, String grade, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}

	public void show() {
		System.out.println("姓名：" + name + " 性别：" + sex + " 年龄：" + age + " 年级："
				+ grade);
	}

}
