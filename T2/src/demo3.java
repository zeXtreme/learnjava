import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个整数：");
		int num1 = input.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = input.nextInt();

		System.out.println("两个数的和是：" + (num1 + num2));
		System.out.println("两个数的差是：" + (num1 - num2));
		System.out.println("两个数的积是：" + (num1 * num2));
		System.out.println("两个数的商是：" + (num1 / num2));
		System.out.println("两个数相除的余数是：" + (num1 % num2));

	}

}
