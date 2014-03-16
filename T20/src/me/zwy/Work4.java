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
			System.out.println("第"+(i+1)+"个色子为"+a[i]+"点");
			sum+=a[i];
		}
		
		System.out.println("色子的点数之和为"+sum+"点");
		
	}

}
