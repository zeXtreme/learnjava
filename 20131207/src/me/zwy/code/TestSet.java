package me.zwy.code;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		ticket();
		
	}
	
	public static void ticket(){
		HashSet hs = new HashSet();
		Random rm = new Random();
		while(hs.size() != 7){
			hs.add(rm.nextInt(33) + 1);
		}
		System.out.println("³é³öµÄºÅÂëÎª£º" + hs);
		
	}

}
