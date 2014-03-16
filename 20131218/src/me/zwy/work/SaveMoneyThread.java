package me.zwy.work;

public class SaveMoneyThread extends Thread {
	private Account a = null;
	private int money;
	
	public SaveMoneyThread(Account a,int money){
		this.a = a;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(a){
			System.out.println(this.getName() + "Òª´æ" + money + "Ôª");
			a.saveMoney(money);
		}
	}
}
