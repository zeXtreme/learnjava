import java.util.Scanner;

public class demo3 {

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

		int n;// 用于临时存放第一个数
		n = num1;
		num1 = num2;
		num2 = n;

		System.out.println("互换值之后第一个数为：" + num1);
		System.out.println("互换值之后第二个数为：" + num2);

	}

}
