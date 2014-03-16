package me.zwy.homework;

public class Faculty extends Employee {

	public Faculty(String name, int age, String address, int phoneNumber,
			String department, double salary, String office,int officeHours,int rank) {
		super(name, age, address, phoneNumber, department, salary, office);
		this.officeHours=officeHours;
		this.rank=rank;
		// TODO Auto-generated constructor stub
	}
	
	private int officeHours;
	
	private int rank;

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return "ÀàÃû£º" + getClass().getName() + "Ãû×Ö£º" + getName();
	}

}
