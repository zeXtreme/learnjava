package me.zwy;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("�������ַ�����");
		String in=input.next();
		
		StringBuffer s=new StringBuffer(in);
		
		if(in.equals(s.reverse().toString())){
			System.out.println("�⴮�ַ�Ϊ���Ĵ�");
		}
		else{
			System.out.println("�⴮�ַ����ǻ��Ĵ�");
		}

	}

}
