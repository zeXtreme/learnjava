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
			System.out.println(Thread.currentThread().getName() + "����һ��Ʊ��Ʊ�ţ�" + ticket);
			ticket++;
		}else{
			System.out.println("Ʊ�Ѿ�������");
		}
	}
}
