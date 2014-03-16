package me.zwy.p1;

public class Demo {

	/**
	 * 【程序1】 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
	 * 问每个月的兔子总数为多少？ 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;//前一个数
		int j = 1;//后一个数
		int sum = 0;//两数之和（第三个数）
		for(int k = 0;k < 10 ;k++){
			sum = i + j;
			int tmp = j;
			j = sum;//将第三个数字赋给第二个
			i = tmp;//将第二个数字赋给第一个
			System.out.print(i + " ");
		}
	}
}
