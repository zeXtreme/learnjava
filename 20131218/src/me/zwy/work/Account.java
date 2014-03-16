package me.zwy.work;

public class Account {
	
	private int balance = 0;
	
	public void takeMoney(int money) {
		if(this.balance > money){
			System.out.println("取走了" + money + "元钱");
			this.balance = this.balance - money;
			System.out.println("余额：" + this.balance + "元");
		}else{
			System.out.println("账户余额不足" + money + "元！无法取出！");
		}
	}
	
	public void saveMoney(int money) {
		System.out.println("存入了" + money + "元钱");
		this.balance = this.balance + money;
		System.out.println("余额：" + this.balance + "元");
	}

}
