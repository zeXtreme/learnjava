package me.zwy;

import java.util.Scanner;

public class Inputint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		String in;
		System.out.print("请输入一个数字：");
		in=input.next();
		
		while(true){
			try{
				Integer.parseInt(in);
				break;
			}
			catch(NumberFormatException e){
				System.out.print("输入错误，请重新输入：");
				in=input.next();
				continue;
			}
		}
		System.out.println("输入正确，程序结束");
	}

}
