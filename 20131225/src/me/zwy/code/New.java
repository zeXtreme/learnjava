package me.zwy.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class New {

	enum WEEK{
		星期一,星期二,星期三,星期四,星期五,星期六,星期日
	}
	public static void main(String[] args) {
		//jdk1.5新特性
		//for each语句
//		foreach();
		//可变参数
//		param();
//		param(1);
//		param(1,2);
		//泛型
		//枚举类型
//		enumriction(WEEK.星期一);
		Set<Person> set = new HashSet<Person>();
		Employee e = new Employee();
		set.add(e);
	}
	//for each
	public static void foreach(){
		Set s = new HashSet();
		s.add(122);
		s.add(432);
		s.add("dfe");
		s.add(true);
		for(Object o:s){
			System.out.println(o.toString());
		}
	}
	//可变参数
	public static void param(int... x){
		for(int i:x){
			System.out.println(i);
		}
	}
	//枚举
	public static void enumriction(WEEK week){
		
	}
	public static void gernera(){
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(10);
		ary.add(23);
	}

}
