import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("请输入第一个整数：");
		int num1 = input.nextInt();

		System.out.print("请输入第二个整数：");
		int num2 = input.nextInt();

		System.out.print("请输入第三个整数：");
		int num3 = input.nextInt();

		int max;// 用于存放最大值

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}

		System.out.println("最大值为：" + max);

	}

}
