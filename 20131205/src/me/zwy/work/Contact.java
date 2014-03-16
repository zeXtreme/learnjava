package me.zwy.work;

import java.io.Serializable;

public class Contact implements Serializable,Comparable {
	
	private String name;
	private int age;
	private String tel;
	
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
	public int compareTo(Object o) {
		Contact c = (Contact) o;
		return this.name.compareTo(c.getName());
	}

}
