package me.zwy.p2;

public class Demo {

	/**
	 * ��Ŀ���ж�101-200֮���ж��ٸ���������������������� 1.����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ�������
	 * ���������������������֮��������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			if (primeNumber(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n101-200֮����" + count + "������");
	}

	/**
	 * �ж�һ�����Ƿ�Ϊ������
	 * 
	 * @param num
	 *            Ҫ�жϵ�����
	 * @return ����������true��������������false
	 */
	public static boolean primeNumber(int num) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

}
