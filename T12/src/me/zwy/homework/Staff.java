package me.zwy.homework;

public class Staff extends Employee {

	public Staff(String name, int age, String address, int phoneNumber,
			String department, double salary, String office, String title) {
		super(name, age, address, phoneNumber, department, salary, office);
		this.title = title;
		// TODO Auto-generated constructor stub
	}

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "ÀàÃû£º" + getClass().getName() + "Ãû×Ö£º" + getName();
	}

}
