package me.zwy;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
		System.out.print("请输入一个十进制长整型数：");
		Long l=new Long(input.nextLong());
	
		System.out.println("转换到二进制为："+Long.toBinaryString(l));

	}

}
