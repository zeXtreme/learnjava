package me.zwy.p3;

public class Demo {

	/**
	 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
	 * 其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
	 * 因为153=1的三次方＋5的三次方＋3的三次方。 
	 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 100;i < 1000;i++){
			int ge = i%10;
			int shi = i%100/10;
			int bai = i/100;
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				System.out.print(i + " ");
			}
		}
	}
}
