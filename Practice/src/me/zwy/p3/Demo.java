package me.zwy.p3;

public class Demo {

	/**
	 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ����
	 * ���λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"��
	 * ��Ϊ153=1�����η���5�����η���3�����η��� 
	 * 1.�������������forѭ������100-999������ÿ�����ֽ����λ��ʮλ����λ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 100;i < 1000;i++){
			int ge = i%10;
			int shi = i%100/10;
			int bai = i/100;
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				System.out.print(i + " ");
			}
		}
	}
}
