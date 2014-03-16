package me.zwy.p5;

import java.util.Scanner;

public class Demo {

	/**
	 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
	 * 60-89分之间的用B表示，60分以下的用C表示。 
	 * 1.程序分析：(a>b)?a:b这是条件运算符的基本例子。
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入分数：");
		int score = scan.nextInt();
		String grade = (score >= 90)?"A":(score >= 60)?"B":"C";
		System.out.println("等级为：" + grade);
		scan.close();
	}

}
