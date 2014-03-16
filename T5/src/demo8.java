import java.util.Scanner;

public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入第一个数：");
		int num1 = input.nextInt();
		System.out.print("请输入第二个数：");
		int num2 = input.nextInt();

		if (num2 > num1) {
			int tmp;
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}

		int sum = 0;
		while (num2 <= num1) {
			if (num2 % 2 != 0) {
				sum += num2;
			}
			num2++;
		}
		System.out.print("两数之间所有奇数的和为：" + sum);

	}

}
