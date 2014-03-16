package me.zwy.homework;

public class Student extends Person {

	public Student(String name, int age, String address, int phoneNumber) {
		super(name, age, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	static final String FRESHMAN = "一年级";
	static final String SOPHOMORE = "二年级";
	static final String JUNOR = "三年级";
	static final String SENIOR = "四年级";

	public String toString() {
		return "类名：" + getClass().getName() + "名字：" + getName();
	}

}
