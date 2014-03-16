package me.zwy.homework;

/**
 * 实现 一个名为Person的类和它的两个子类Student和Employee。
 * Employee有子类Faculty和Staff。Person中的人有name、age、address和phoneNumber。
 * 
 * @author Zeng
 * 
 */

public class Person {

	public Person(String name, int age, String address, int phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	private String name;
	private int age;
	private String address;
	private int phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return "类名：" + getClass().getName() + "名字：" + getName();
	}

}
