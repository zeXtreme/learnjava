package me.zwy.code;

public class SubThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1;i < 100000;i++){
			System.out.println("s2  .. " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
