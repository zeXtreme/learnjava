package me.zwy.sync;

public class SyncTest {

	public static void main(String[] args) {
		Saler s = new Saler();
		SaleThread t1 = new SaleThread(s);
		SaleThread t2 = new SaleThread(s);
		SaleThread t3 = new SaleThread(s);
		t1.setName("һ�Ŵ���");
		t2.setName("���Ŵ���");
		t3.setName("���Ŵ���");
		t1.start();
		t2.start();
		t3.start();
	}

}
