package me.zwy.code;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, list.remove(list.size()-1));
		for(String s : list){
			System.out.println(s);
		}
	}

}
