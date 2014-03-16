import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入一个三位数：");
		int num = input.nextInt();

		int sum = 0;
		while (num >= 1) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("这个数三个数位的和为：" + sum);

	}

}
