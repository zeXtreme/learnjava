package me.zwy;

import java.util.Scanner;

public class AppendRevertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("�������ַ�����");
		String in=input.next();
		
		StringBuffer s=new StringBuffer(in);
		System.out.println(in+s.reverse());
		

	}

}
