import java.util.Random;
import java.util.Scanner;

public class demo6 {

	/**
	 * @param һ���򵥵ĳ齱�����������7�����ֲ��Ҳ��ظ��� Ȼ��Ƚ��û���������ֽ��бȽϣ�������ͬ���ֵĶ���������ý��ĵȼ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rm = new Random();

		int[] userNum = new int[7];// ���ڱ����û����������
		int[] randomNum = new int[7];// ���ڱ���������ɵ�����
		int count = 0;// ����ͳ���û��¶Զ�������

		for (int i = 0; i < userNum.length; i++) {
			System.out.print("��������ĵ�" + (i + 1) + "�����֣�1��33��������֮�䲻���ظ�����");
			userNum[i] = input.nextInt();
			if (userNum[i] > 33 || userNum[i] < 0) {
				System.out.println("���볬����Χ�����������룡");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (userNum[i] == userNum[j]) {
					System.out.println("����������ظ������������룡");
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = rm.nextInt(33) + 1;
			for (int j = 0; j < i; j++) {
				if (randomNum[i] == randomNum[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < userNum.length; i++) {
			for (int j = 0; j < randomNum.length; j++) {
				if (userNum[i] == randomNum[j]) {
					count++;
					break;
				}
			}
		}

		System.out.print("�н�������Ϊ��");
		for (int i = 0; i < randomNum.length; i++) {
			System.out.print(randomNum[i] + " ");
		}

		switch (count) {
			case 0:
				System.out.println("\n��һ�����ֶ�û�ԣ�û�еý���");
				break;
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("\n��һ������" + count + "�����֣��õ����Ƚ���");
				break;
			case 5:
			case 6:
				System.out.println("\n��һ������" + count + "�����֣��õ����Ƚ�����");
				break;
			case 7:
				System.out.println("\n��һ������" + count + "�����֣��õ�һ�Ƚ�������");
				break;
		}

	}

}
