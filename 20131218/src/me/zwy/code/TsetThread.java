package me.zwy.code;

public class TsetThread {

	public static void main(String[] args) {
		SubThread1 t1 = new SubThread1();
		SubThread1 t2 = new SubThread1();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

}

class SubThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1;i < 100;i++){
			System.out.println(this.getName() + " " + i);
		}
	}
}
