package me.zwy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy��MM��dd��  E  ����ʱ��");
		SimpleDateFormat format2 = new SimpleDateFormat(
				"yyyy��MM��dd��  HHʱmm��ss��");
		SimpleDateFormat format3 = new SimpleDateFormat("MM-dd-yyyy  HH:mm:ss");

		System.out.println(d);
		System.out.println("��ǰʱ���ǣ�" + format1.format(d));
		System.out.println("��ǰʱ���ǣ�" + format2.format(d));
		System.out.println("ŷ��ʱ�䣺" + format3.format(d));

	}

}
