import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String choose;
		int count = 0;
		int sum = 0;
		do {
			System.out.print("������һ�����֣�");
			int num = input.nextInt();
			if (num % 2 == 0) {
				count++;
				sum += num;
			}
			System.out.print("�Ƿ�Ҫ���루y/n����");
			choose = input.next();
		} while (choose.equals("y"));
		System.out.println("һ��������" + count + "��ż�������ǵĺ���" + sum);

	}

}
