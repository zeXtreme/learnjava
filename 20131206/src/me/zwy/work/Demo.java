package me.zwy.work;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee e = new Employee(42,"zs",2500);
		al.add(e);
		e = new Employee(12, "ls", 3000);
		al.add(e);
		e = new Employee(15, "qq", 5000);
		al.add(e);
		e = new Employee(59, "ww", 1000);
		al.add(e);
		e = new Employee(3, "sd", 1234);
		al.add(e);
		e = new Employee(34, "kk", 1000);
		al.add(e);
		e = new Employee(43, "wt", 9527);
		al.add(e);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
