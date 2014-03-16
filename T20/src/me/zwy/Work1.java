package me.zwy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date(2013-1900, 9, 26);
		
		System.out.println(d);
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(format.format(d));
		
		System.out.println("当前日期自1970年1月1日起的已经有"+d.getTime()/1000/60/60/24+"天了");

	}

}
