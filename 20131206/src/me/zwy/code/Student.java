package me.zwy.code;

public class Student implements Comparable{
	
	private String name;
	private int age;
	
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
	public int compareTo(Object o) {
		Student t = (Student)o;
		if(this.age>t.getAge()){
			return 1;
		}else if(this.age<t.getAge()){
			return -1;
		}else{
			return 0;
		}
	}

}
