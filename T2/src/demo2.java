import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个物品单价：");
		double price1 = input.nextDouble();
		System.out.println("请输入第一个物品数量：");
		int num1 = input.nextInt();
		double all1 = price1 * num1;

		System.out.println("请输入第二个物品单价：");
		double price2 = input.nextDouble();
		System.out.println("请输入第二个物品数量：");
		int num2 = input.nextInt();
		double all2 = price2 * num2;

		System.out.println("请输入第三个物品单价：");
		double price3 = input.nextDouble();
		System.out.println("请输入第三个物品数量：");
		int num3 = input.nextInt();
		double all3 = price3 * num3;

		System.out.println("所有物品总价为：" + (all1 + all2 + all3));

	}

}
