package me.zwy.code;

public class Student {

	private String name;
	private int age;
	private String tel;
	
	public Student(){
		
	}
	public Student(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return name + " " + age + " " + tel;
	}
}
