package me.zwy.p2;

public class Demo {

	/**
	 * 题目：判断101-200之间有多少个素数，并输出所有素数。 1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
	 * 则表明此数不是素数，反之是素数。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			if (primeNumber(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n101-200之间有" + count + "个素数");
	}

	/**
	 * 判断一个数是否为素数。
	 * 
	 * @param num
	 *            要判断的数字
	 * @return 是素数返回true，不是素数返回false
	 */
	public static boolean primeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

}
