package me.zwy.sync;

public class SaleThread extends Thread {
	
	Saler s = null;
	
	public SaleThread(Saler s){
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + "��ʼ��Ʊ");
		for(int i = 1;i <= 10;i++){
			s.saleTicket();
		}
	}
}
