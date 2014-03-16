package me.zwy.code;

@Table("employee1")
public class Employee {
	@Cloumn(name="eid",length=3,type="varchar2")
	private String eid;
	@Cloumn(name="name",length=8,type="varchar2")
	private String name;
	@Cloumn(name="age",length=3,type="number")
	private int age;
	public Employee() {
	}
	public Employee(String eid, String name, int age) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
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
	@Override
	public String toString() {
		return this.eid + " " + this.name + " " + this.age;
	}
}
