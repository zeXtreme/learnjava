package me.zwy.work;

public class Account {
	
	private int balance = 0;
	
	public void takeMoney(int money) {
		if(this.balance > money){
			System.out.println("ȡ����" + money + "ԪǮ");
			this.balance = this.balance - money;
			System.out.println("��" + this.balance + "Ԫ");
		}else{
			System.out.println("�˻�����" + money + "Ԫ���޷�ȡ����");
		}
	}
	
	public void saveMoney(int money) {
		System.out.println("������" + money + "ԪǮ");
		this.balance = this.balance + money;
		System.out.println("��" + this.balance + "Ԫ");
	}

}
