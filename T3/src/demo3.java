import java.util.Scanner;

public class demo3 {

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

		int n;// ������ʱ��ŵ�һ����
		n = num1;
		num1 = num2;
		num2 = n;

		System.out.println("����ֵ֮���һ����Ϊ��" + num1);
		System.out.println("����ֵ֮��ڶ�����Ϊ��" + num2);

	}

}
