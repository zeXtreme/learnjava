package me.zwy.homework;

public class Employee extends Person {

	public Employee(String name, int age, String address, int phoneNumber,
			String department, double salary, String office) {
		super(name, age, address, phoneNumber);
		this.department = department;
		this.salary = salary;
		this.office = office;
		// TODO Auto-generated constructor stub
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	private String department;

	private double salary;

	private String office;

	public String toString() {
		return "ÀàÃû£º" + getClass().getName() + "Ãû×Ö£º" + getName();
	}

}
