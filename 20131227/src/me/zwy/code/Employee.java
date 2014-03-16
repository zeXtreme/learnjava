package me.zwy.code;

public class Employee {
	
	private String name;
	private int age;
	public Employee(){
		
	}
	public Employee(int age){
		this.age = age;
	}
	private Employee(String name){
		this.name = name;
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
		return this.name + "  " + this.age;
	}
	private static void printMsg(){
		System.out.println("MSG");
	}
}
