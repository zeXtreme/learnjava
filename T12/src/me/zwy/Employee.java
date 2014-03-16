package me.zwy;

/**
 * ��������˽��name��salary���Employee�ࡣ �����ʵ��Ĺ��췽���Գ�ʼ����Щ��
 * ������toString���������Է���ָ��name��salary��Ϣ���ַ�����
 * 
 * @author Zeng
 * 
 */

public class Employee {

	private String name;

	private double salary;

	public Employee() {
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(double salary) {
		this.salary = salary;
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + salary;
	}

}
