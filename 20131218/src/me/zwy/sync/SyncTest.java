package me.zwy.sync;

public class SyncTest {

	public static void main(String[] args) {
		Saler s = new Saler();
		SaleThread t1 = new SaleThread(s);
		SaleThread t2 = new SaleThread(s);
		SaleThread t3 = new SaleThread(s);
		t1.setName("一号窗口");
		t2.setName("二号窗口");
		t3.setName("三号窗口");
		t1.start();
		t2.start();
		t3.start();
	}

}
