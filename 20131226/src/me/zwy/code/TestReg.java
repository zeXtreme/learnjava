package me.zwy.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {

	public static void main(String[] args) {
		
	}
	public static void pattern(){
		String str ="0731-82228222";
		Pattern pattren = Pattern.compile("0731");
		Matcher m = pattren.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
