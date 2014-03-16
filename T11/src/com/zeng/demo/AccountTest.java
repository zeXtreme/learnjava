package com.zeng.demo;

import com.zeng.bean.Account;

/**
 * 写一个测试程序测试Account类。在测试程序中， 创建一个账号为1110，余额为20000元、年利率为4.5%的Account对象。
 * 假设该账户于1月初在银行开户，在5月底使用withdraw（）方法提款5000元，
 * 在7月底使用deposit（）方法存款3000元，计算在屏幕上显示存款第一年每个月的月利息和账户余额。
 * 
 * @author Zeng
 * 
 */

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account(1110, 20000, 0.045);

		for (int month = 1; month <= 12; month++) {
			System.out.print("第" + month + "个月的月利息为" + a.getMonthlyInterest()
					+ "元，");
			a.setBalance(a.getBalance() + a.getMonthlyInterest());
			System.out.println("账户余额为：" + a.getBalance() + "元");
			if (month == 5) {
				a.withdraw(5000);
				System.out.println("取出5000元");
			} else if (month == 7) {
				a.deposit(3000);
				System.out.println("存入3000元");
			}
		}

	}

}
