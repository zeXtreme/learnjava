package me.zwy.work;

public class TakeMoneyThread extends Thread {
	private Account a = null;
	private int money;
	
	public TakeMoneyThread(Account a,int money){
		this.a = a;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(a){
			System.out.println(this.getName() + "Ҫȡ" + money + "Ԫ");
			a.takeMoney(money);
		}
	}
}
