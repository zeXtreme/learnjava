package me.zwy;

/**
 * ����Car����������passenger��ʾ�����ɵ��ÿ�������
 * ��ӷ��������ÿ������ÿ�����setPassenger������ȡ�ÿ������ÿ�����getPassenger������
 * 
 * @author Zeng
 * 
 */

public class Car extends Vehicle {

	private int passenger;

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getPassenger() {
		return passenger;
	}

}
