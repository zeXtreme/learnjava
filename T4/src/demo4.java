import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("��������������ڼ���1-7����");
		int week = input.nextInt();

		switch (week) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("�����տ���");
				break;
			case 6:
			case 7:
				System.out.println("��ĩ���");
				break;
			default:
				System.out.println("��������");
				break;
		}

	}

}
