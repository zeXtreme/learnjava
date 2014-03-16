package me.zwy.p6;

import java.util.Scanner;

public class Demo {

	/**
	 * ��Ŀ����������������m��n���������Լ������С�������� 
	 * 1.�������������շ������ 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������һ������");
		int m = scan.nextInt();
		System.out.print("������ڶ�������");
		int n = scan.nextInt();
		System.out.println("���Լ��Ϊ" + gcd(m, n));
		System.out.println("��С������Ϊ" + lcm(m, n));
		scan.close();
	}
	
	/**
	 * ���Լ��
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gcd(int m, int n){
		int r = m%n;
		while(r!=0){
			m = n;
			n = r;
			r = m%n;
		}
		return n;
	}
	
	/**
	 * ��С������
	 * @param m
	 * @param n
	 * @return
	 */
	public static int lcm(int m, int n){
		return (m*n)/gcd(m, n);
	}

}
