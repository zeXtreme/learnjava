import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("�������һ��������");
		int num1 = input.nextInt();

		System.out.print("������ڶ���������");
		int num2 = input.nextInt();

		System.out.print("�����������������");
		int num3 = input.nextInt();

		int max;// ���ڴ�����ֵ

		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}

		System.out.println("���ֵΪ��" + max);

	}

}
