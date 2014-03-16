package me.zwy.sync;

public class WaitTest {

	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		t1.start();
		for(int i = 0;i < 100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main.." + i);
			if(i == 50){
				synchronized(t1){
					t1.notifyAll();
				}
			}
		}
	}

}

class ThreadOne extends Thread{
	@Override
	public void run() {
		for(int i = 0;i < 100;i++){
			try {
				sleep(100);
				if(i == 20){
					synchronized(this){
						wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t1.." + i);
		}
	}
}