package me.zwy.homework;

/**
 * ʵ�� һ����ΪPerson�����������������Student��Employee��
 * Employee������Faculty��Staff��Person�е�����name��age��address��phoneNumber��
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
		return "������" + getClass().getName() + "���֣�" + getName();
	}

}
