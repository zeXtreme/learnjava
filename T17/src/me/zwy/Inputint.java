package me.zwy;

import java.util.Scanner;

public class Inputint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		String in;
		System.out.print("������һ�����֣�");
		in=input.next();
		
		while(true){
			try{
				Integer.parseInt(in);
				break;
			}
			catch(NumberFormatException e){
				System.out.print("����������������룺");
				in=input.next();
				continue;
			}
		}
		System.out.println("������ȷ���������");
	}

}
