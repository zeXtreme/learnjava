package me.zwy.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=0;i<=10;i++){
			sum+=i;
			if(i==4){
				break;
			}	
		}
		System.out.println(sum);
	}

}
