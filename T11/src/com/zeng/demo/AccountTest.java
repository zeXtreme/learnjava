package com.zeng.demo;

import com.zeng.bean.Account;

/**
 * дһ�����Գ������Account�ࡣ�ڲ��Գ����У� ����һ���˺�Ϊ1110�����Ϊ20000Ԫ��������Ϊ4.5%��Account����
 * ������˻���1�³������п�������5�µ�ʹ��withdraw�����������5000Ԫ��
 * ��7�µ�ʹ��deposit�����������3000Ԫ����������Ļ����ʾ����һ��ÿ���µ�����Ϣ���˻���
 * 
 * @author Zeng
 * 
 */

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account(1110, 20000, 0.045);

		for (int month = 1; month <= 12; month++) {
			System.out.print("��" + month + "���µ�����ϢΪ" + a.getMonthlyInterest()
					+ "Ԫ��");
			a.setBalance(a.getBalance() + a.getMonthlyInterest());
			System.out.println("�˻����Ϊ��" + a.getBalance() + "Ԫ");
			if (month == 5) {
				a.withdraw(5000);
				System.out.println("ȡ��5000Ԫ");
			} else if (month == 7) {
				a.deposit(3000);
				System.out.println("����3000Ԫ");
			}
		}

	}

}
