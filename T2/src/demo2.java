import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("�������һ����Ʒ���ۣ�");
		double price1 = input.nextDouble();
		System.out.println("�������һ����Ʒ������");
		int num1 = input.nextInt();
		double all1 = price1 * num1;

		System.out.println("������ڶ�����Ʒ���ۣ�");
		double price2 = input.nextDouble();
		System.out.println("������ڶ�����Ʒ������");
		int num2 = input.nextInt();
		double all2 = price2 * num2;

		System.out.println("�������������Ʒ���ۣ�");
		double price3 = input.nextDouble();
		System.out.println("�������������Ʒ������");
		int num3 = input.nextInt();
		double all3 = price3 * num3;

		System.out.println("������Ʒ�ܼ�Ϊ��" + (all1 + all2 + all3));

	}

}
