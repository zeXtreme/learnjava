package me.zwy.manage;

public class Emp {

	private String eno;
	private String name;
	private String position;
	private String phoneNumber;
	private int sal;

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public String toString(){
		return eno+"    "+"      "+name+"        "+position+"       "+phoneNumber+"      "+sal;
	}

}
