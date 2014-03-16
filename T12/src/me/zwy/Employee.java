package me.zwy;

/**
 * 创建带有私有name和salary域的Employee类。 引入适当的构造方法以初始化这些域，
 * 并覆盖toString（）方法以返回指定name和salary信息的字符串。
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
