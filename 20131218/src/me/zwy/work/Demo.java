package me.zwy.work;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random rm = new Random();
		Account a = new Account();
		SaveMoneyThread st = new SaveMoneyThread(a, rm.nextInt(1000) + 1);
		st.setName("张三");
		TakeMoneyThread tt = new TakeMoneyThread(a, rm.nextInt(1000) + 1);
		tt.setName("李四");
		st.start();
		tt.start();
	}

}
