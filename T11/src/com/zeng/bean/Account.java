package com.zeng.bean;

/**
 * дһ����ΪAccount����ģ�������˻�����������Ժͷ������£���Ϣ�����ۼƣ��� ���ԣ�id��balance��annulInterestRate
 * ������Account������Account��int id��double balance, double
 * annualInterestRate)��getId()��
 * getBalance������getAnnualInterestRate������setId()��setBalance��double balance����
 * setAnnualInterestRate��double annualInterestRate����getMonthlyInterest()��
 * withdraw��double amount����deposit��double amount�� 
 * дһ�����Գ������Account�ࡣ�ڲ��Գ����У�
 * ����һ���˺�Ϊ1110�����Ϊ20000Ԫ��������Ϊ4.5%��Account����
 * ������˻���1�³������п�������5�µ�ʹ��withdraw�����������5000Ԫ��
 * ��7�µ�ʹ��deposit�����������3000Ԫ����������Ļ����ʾ����һ��ÿ���µ�����Ϣ���˻���
 * 
 * @author Zeng
 * 
 */
public class Account {

	private int id;
	private double balance, annulInterestRate;

	public Account() {

	}

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annulInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnulInterestRate() {
		return annulInterestRate;
	}

	public void setAnnulInterestRate(double annulInterestRate) {
		this.annulInterestRate = annulInterestRate;
	}

	public double getMonthlyInterest() {
		return balance * annulInterestRate / 12;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

}
