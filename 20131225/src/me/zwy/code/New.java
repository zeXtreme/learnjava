package me.zwy.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class New {

	enum WEEK{
		����һ,���ڶ�,������,������,������,������,������
	}
	public static void main(String[] args) {
		//jdk1.5������
		//for each���
//		foreach();
		//�ɱ����
//		param();
//		param(1);
//		param(1,2);
		//����
		//ö������
//		enumriction(WEEK.����һ);
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
	//�ɱ����
	public static void param(int... x){
		for(int i:x){
			System.out.println(i);
		}
	}
	//ö��
	public static void enumriction(WEEK week){
		
	}
	public static void gernera(){
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(10);
		ary.add(23);
	}

}
