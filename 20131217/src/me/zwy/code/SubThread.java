package me.zwy.code;

public class SubThread extends Thread{

	@Override
	public void run() {
		int i = 1;
		while(i<100000){
			System.out.println("helllo world" + i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
