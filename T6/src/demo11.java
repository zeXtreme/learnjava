import java.util.Scanner;

public class demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 100; i++) {
			System.out.print("���������֣�");
			int num = input.nextInt();

			if (num != -1) {
				System.out.println(num);
			} else {
				System.out.println("�������");
				break;
			}
		}

	}

}
