import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("�������һ��������");
		int num1 = input.nextInt();
		System.out.println("������ڶ���������");
		int num2 = input.nextInt();

		System.out.println("�������ĺ��ǣ�" + (num1 + num2));
		System.out.println("�������Ĳ��ǣ�" + (num1 - num2));
		System.out.println("�������Ļ��ǣ�" + (num1 * num2));
		System.out.println("�����������ǣ�" + (num1 / num2));
		System.out.println("����������������ǣ�" + (num1 % num2));

	}

}
