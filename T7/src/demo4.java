import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] score = new int[5];
		int sum = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print("�������" + (i + 1) + "��ѧ���ĳɼ���");
			score[i] = input.nextInt();
			sum += score[i];
			if (i == 0) {
				max = score[i];
				min = score[i];
			} else {
				if (score[i] > max) {
					max = score[i];
				} else if (score[i] < min) {
					min = score[i];
				}
			}
		}
		System.out.println("�����ѧ�����ܷ�Ϊ��" + sum);
		System.out.println("�����ѧ����ƽ����Ϊ��" + (sum / 5));
		System.out.println("������߷�Ϊ��" + max);
		System.out.println("������ͷ�Ϊ��" + min);

	}

}
