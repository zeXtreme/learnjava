import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("�������һ�߳���");
		int b1 = input.nextInt();
		System.out.print("������ڶ��߳���");
		int b2 = input.nextInt();
		System.out.print("����������߳���");
		int b3 = input.nextInt();

		if (b1 + b2 > b3 && b1 + b3 > b2 && b2 + b3 > b1) {
			System.out.println("�������������");
			if (b1 == b2 || b1 == b3 || b2 == b3) {
				if (b1 == b2 && b2 == b3) {
					System.out.println("������Ϊ�ȱ�������");
				} else {
					System.out.println("������Ϊ����������");
				}
			}
			if (((b1 ^ 2 + b2 ^ 2) == (b3 ^ 2))
					|| (b2 ^ 2 + b3 ^ 2) == (b1 ^ 2)
					|| (b1 ^ 2 + b3 ^ 2) == (b2 ^ 2)) {
				System.out.println("������Ϊֱ��������");
			}
		} else {
			System.out.println("�޷����������");
		}

	}
}
