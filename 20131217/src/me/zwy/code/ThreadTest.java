package me.zwy.code;

public class ThreadTest {

	public static void main(String[] args) {
		SubThread t1 = new SubThread();
		t1.start();

		SubThread2 s2 = new SubThread2();
		Thread t2 = new Thread(s2);
		t2.start();
	}

}
