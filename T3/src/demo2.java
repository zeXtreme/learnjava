import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("������һ����λ����");
		int num = input.nextInt();

		int q = num / 1000;
		int b = num % 1000 / 100;
		int s = num % 100 / 10;
		int g = num % 10;

		System.out.println("�ĸ���λ�ĺ�Ϊ��" + (q + b + s + g));

	}

}
