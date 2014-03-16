package me.zwy.p6;

import java.util.Scanner;

public class Demo {

	/**
	 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 
	 * 1.程序分析：利用辗除法。 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int m = scan.nextInt();
		System.out.print("请输入第二个数：");
		int n = scan.nextInt();
		System.out.println("最大公约数为" + gcd(m, n));
		System.out.println("最小公倍数为" + lcm(m, n));
		scan.close();
	}
	
	/**
	 * 最大公约数
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
	 * 最小公倍数
	 * @param m
	 * @param n
	 * @return
	 */
	public static int lcm(int m, int n){
		return (m*n)/gcd(m, n);
	}

}
