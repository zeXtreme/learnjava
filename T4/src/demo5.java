import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("������һ����λ����");
		int num = input.nextInt();

		int num1 = num / 10000;
		int num2 = num % 10000 / 1000;
		int num4 = num % 100 / 10;
		int num5 = num % 10;

		if (num1 == num5 && num2 == num4) {
			System.out.println("��������ǻ�����");
		} else {
			System.out.println("������ֲ��ǻ�����");
		}

	}

}
