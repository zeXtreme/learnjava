package me.zwy.work.work3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition a=new NumberAddition();
		System.out.println(a.add(2,3));
		
		a=new StringAddition();
		System.out.println(a.add("2", "3"));

	}

}
