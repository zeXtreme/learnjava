package me.zwy;

import java.util.Random;

public class Work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rm=new Random();
		
		int[] a=new int[5];
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			a[i]=rm.nextInt(5)+1;
			System.out.println("��"+(i+1)+"��ɫ��Ϊ"+a[i]+"��");
			sum+=a[i];
		}
		
		System.out.println("ɫ�ӵĵ���֮��Ϊ"+sum+"��");
		
	}

}
