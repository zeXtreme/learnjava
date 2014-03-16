package com.zeng.bean;

/**
 * 写一个名为Account的类模拟银行账户。该类的属性和方法如下（利息按月累计）： 属性：id，balance，annulInterestRate
 * 方法：Account（），Account（int id，double balance, double
 * annualInterestRate)，getId()，
 * getBalance（），getAnnualInterestRate（），setId()，setBalance（double balance），
 * setAnnualInterestRate（double annualInterestRate），getMonthlyInterest()，
 * withdraw（double amount），deposit（double amount） 
 * 写一个测试程序测试Account类。在测试程序中，
 * 创建一个账号为1110，余额为20000元、年利率为4.5%的Account对象。
 * 假设该账户于1月初在银行开户，在5月底使用withdraw（）方法提款5000元，
 * 在7月底使用deposit（）方法存款3000元，计算在屏幕上显示存款第一年每个月的月利息和账户余额。
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
