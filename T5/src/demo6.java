import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("������һ����λ����");
		int num = input.nextInt();

		int sum = 0;
		while (num >= 1) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("�����������λ�ĺ�Ϊ��" + sum);

	}

}
