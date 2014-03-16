package me.zwy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy年MM月dd日  E  北京时间");
		SimpleDateFormat format2 = new SimpleDateFormat(
				"yyyy年MM月dd日  HH时mm分ss秒");
		SimpleDateFormat format3 = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss");

		System.out.println(d);
		System.out.println("当前时间是：" + format1.format(d));
		System.out.println("当前时间是：" + format2.format(d));
		System.out.println("欧美时间：" + format3.format(d));

	}

}
