package me.zwy.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("asdasd");
		al.add("dddsss");
		al.add("fafads");
		al.add("fafaasdds");
		al.add("f21312ds");
		al.add("33232fads");
		al.add("eeefads");
		al.add("d342fads");
		
//		Iterator it = al.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
