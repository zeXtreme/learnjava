package me.zwy.p5;

import java.util.Scanner;

public class Demo {

	/**
	 * ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��
	 * 60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
	 * 1.���������(a>b)?a:b��������������Ļ������ӡ�
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����������");
		int score = scan.nextInt();
		String grade = (score >= 90)?"A":(score >= 60)?"B":"C";
		System.out.println("�ȼ�Ϊ��" + grade);
		scan.close();
	}

}
