import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("���������εĳ���");
		int c = input.nextInt();
		System.out.print("���������εĿ�");
		int k = input.nextInt();

		double s = S(c, k);

		System.out.println("�����ε����Ϊ��" + s);

	}

	static double S(int c, int k) {
		int s = c * k / 2;

		return s;
	}

}
