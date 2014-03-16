package me.zwy.interdemo;

public class Teacher implements IDetail{
	
	String name;
	int age;
	
	public String detail(){
		return "我是"+name+",今年"+age+"岁";
	}

}
