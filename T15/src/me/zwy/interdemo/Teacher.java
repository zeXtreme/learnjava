package me.zwy.interdemo;

public class Teacher implements IDetail{
	
	String name;
	int age;
	
	public String detail(){
		return "����"+name+",����"+age+"��";
	}

}
