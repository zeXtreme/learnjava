package me.zwy.homework;

public class Student extends Person {

	public Student(String name, int age, String address, int phoneNumber) {
		super(name, age, address, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	static final String FRESHMAN = "һ�꼶";
	static final String SOPHOMORE = "���꼶";
	static final String JUNOR = "���꼶";
	static final String SENIOR = "���꼶";

	public String toString() {
		return "������" + getClass().getName() + "���֣�" + getName();
	}

}
