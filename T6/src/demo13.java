import java.util.Random;
import java.util.Scanner;

public class demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm = new Random();
		Scanner input = new Scanner(System.in);

		String choose = "y";
		String yunSuanFu = "";
		int countT = 0, countF = 0;

		System.out.println("��ѧ����������Գ���ʼ");
		do {
			int num1 = rm.nextInt(100);
			int num2 = rm.nextInt(100);
			int yun = rm.nextInt(4);
			int result = 0, userResult = 0;

			switch (yun) {
				case 0:
					yunSuanFu = "+";
					result = num1 + num2;
					break;
				case 1:
					yunSuanFu = "-";
					result = num1 - num2;
					break;
				case 2:
					yunSuanFu = "*";
					result = num1 * num2;
					break;
				case 3:
					yunSuanFu = "/";
					result = num1 / num2;
					break;
			}
			if (yunSuanFu.equals("+") && result > 100) {
				continue;
			} else if (yunSuanFu.equals("-") && num1 < num2) {
				continue;
			} else if (yunSuanFu.equals("/") && num1 % num2 != 0) {
				continue;
			} else if (yunSuanFu.equals("*") && result > 100) {
				continue;
			}

			System.out.print(num1 + yunSuanFu + num2 + "=");
			userResult = input.nextInt();
			if (userResult == result) {
				System.out.println("�ش���ȷ��");
				countT++;
			} else {
				System.out.println("�ش����");
				countF++;
			}
			System.out.print("�Ƿ��������y/n��:");
			choose = input.next();
		} while (choose.equals("y"));
		System.out.println("���������������" + countT + "����,�����" + countF
				+ "����,��ȷ��Ϊ��"
				+ (int) ((double) countT / (countT + countF) * 100) + "%");
	}

}
