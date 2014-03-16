import java.util.Random;
import java.util.Scanner;

public class demo6 {

	/**
	 * @param 一个简单的抽奖程序，随机生成7个数字并且不重复， 然后比较用户输入的数字进行比较，根据相同数字的多少来计算得奖的等级
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rm = new Random();

		int[] userNum = new int[7];// 用于保存用户输入的数字
		int[] randomNum = new int[7];// 用于保存随机生成的数字
		int count = 0;// 用于统计用户猜对多少数字

		for (int i = 0; i < userNum.length; i++) {
			System.out.print("请输入你的第" + (i + 1) + "个数字（1到33（包含）之间不能重复）：");
			userNum[i] = input.nextInt();
			if (userNum[i] > 33 || userNum[i] < 0) {
				System.out.println("输入超出范围，请重新输入！");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (userNum[i] == userNum[j]) {
					System.out.println("输入的数据重复，请重新输入！");
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = rm.nextInt(33) + 1;
			for (int j = 0; j < i; j++) {
				if (randomNum[i] == randomNum[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < userNum.length; i++) {
			for (int j = 0; j < randomNum.length; j++) {
				if (userNum[i] == randomNum[j]) {
					count++;
					break;
				}
			}
		}

		System.out.print("中奖的数字为：");
		for (int i = 0; i < randomNum.length; i++) {
			System.out.print(randomNum[i] + " ");
		}

		switch (count) {
			case 0:
				System.out.println("\n你一个数字都没对，没有得奖。");
				break;
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("\n你一共对了" + count + "个数字，得到三等奖！");
				break;
			case 5:
			case 6:
				System.out.println("\n你一共对了" + count + "个数字，得到二等奖！！");
				break;
			case 7:
				System.out.println("\n你一共对了" + count + "个数字，得到一等奖！！！");
				break;
		}

	}

}
