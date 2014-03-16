package me.zwy.work;

public class Work1 {

	public static void main(String[] args) {
		SubThread s = new SubThread();
		Thread t = new Thread(s);
		t.start();
	}

}

class SubThread implements Runnable{

	@Override
	public void run() {
		for(char i = 'A';i <= 'Z';i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
