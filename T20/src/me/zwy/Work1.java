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
		
		System.out.println("��ǰ������1970��1��1������Ѿ���"+d.getTime()/1000/60/60/24+"����");

	}

}
