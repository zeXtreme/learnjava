package me.zwy.work1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1={7,6,5,4,2,1};
		int[] a2={0,1,2,3};
		
		for(int i=0;i<a1.length;i++){
			try{
				System.out.println("a1[i]/a2[i]="+a1[i]/a2[i]);
			}
			catch(ArithmeticException e){
				System.out.println("�����������г���Ϊ0");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("��һ������ĳ��Ȳ���");
			}
		}

	}

}
