import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("��������Ļ���״����yΪ�ѻ飬nΪδ�飩:");
		String marry = input.next();
		System.out.print("����������Ա�mΪ���ԣ�fΪŮ�ԣ���");
		String sex = input.next();
		System.out.print("������������䣺");
		int age = input.nextInt();

		if (marry.equals("y")) {
			System.out.println("����Ͷ��");
		} else if (age > 30 && sex.equals("m")) {
			System.out.println("����Ͷ��");
		} else if (age > 25 && sex.equals("f")) {
			System.out.println("����Ͷ��");
		} else {
			System.out.println("��δͶ��");
		}

	}

}
