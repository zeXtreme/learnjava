package me.zwy;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
		System.out.print("������һ��ʮ���Ƴ���������");
		Long l=new Long(input.nextLong());
	
		System.out.println("ת����������Ϊ��"+Long.toBinaryString(l));

	}

}
