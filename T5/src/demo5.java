import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choose;
		do {
			System.out.print("������һ�����֣�");
			int num = input.nextInt();
			System.out.println("��������ǣ�" + num);
			System.out.print("�Ƿ���Ҫ�������룿��y/n��");
			choose = input.next();
		} while (choose.equals("y"));
		System.out.println("��������");

	}

}
