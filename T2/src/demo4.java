import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("��������εĳ���");
		int c = input.nextInt();
		System.out.println("��������εĿ�");
		int k = input.nextInt();

		System.out.println("���ε��ܳ�Ϊ��" + ((c + k) * 2));
		System.out.println("���ε����Ϊ��" + (c * k));

	}

}
