package me.zwy.p4;

public class Demo {

	/**
	 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
	 * �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ� 
	 * (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
	 * (2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ���� 
	 * (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
	 * @param args
	 */
	public static void main(String[] args) {
		primeFactors(90);
	}
	
	/**
	 * ��һ���������ֽ���������
	 * @param num Ҫ�ֽ���������������
	 */
	public static void primeFactors(int num){
		int k = 2;
		System.out.print(num + "=");
		while(true){
			if(num == k){
				System.out.print(k);
				break;
			}else if(num % k == 0){
				System.out.print(k + "*");
				num /= k;
			}else if(num % k != 0){
				k++;
			}
		}
	}

}
