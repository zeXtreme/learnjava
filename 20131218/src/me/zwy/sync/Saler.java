package me.zwy.sync;

public class Saler{
	int ticket = 1;
	
	public synchronized void saleTicket(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(ticket <= 10){
			System.out.println(Thread.currentThread().getName() + "卖出一张票，票号：" + ticket);
			ticket++;
		}else{
			System.out.println("票已经卖完了");
		}
	}
}
