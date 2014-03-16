package me.zwy;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入字符串：");
		String in=input.next();
		
		StringBuffer s=new StringBuffer(in);
		
		if(in.equals(s.reverse().toString())){
			System.out.println("这串字符为回文串");
		}
		else{
			System.out.println("这串字符不是回文串");
		}

	}

}
