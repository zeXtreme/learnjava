package me.zwy;

import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Date date = new Date();
		String sdate = (date.getYear()+1900) + "" + (date.getMonth()+1) + date.getDate() + date.getHours() + date.getMinutes() + date.getSeconds();
		System.out.println(sdate);
	}

}
