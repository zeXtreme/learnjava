import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("��������ݣ�");
		int year = input.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("�������������");
		} else {
			System.out.println("���������ƽ��");
		}

	}

}
