package me.zwy;

/**
 * ���һ����ͨ������Vehicle�����е����԰���speed��color������������������ɫsetColor��
 * ȡ����ɫgetColor�������ٶ�setSpeed������ٶ�getSpeed�������һ������Car��
 * ��������passenger��ʾ�����ɵ��ÿ���������ӷ��������ÿ������ÿ�����setPassenger������ȡ��
 * �������ÿ�����getPassenger����������һ��VehicTest���Գ����Vehicle��Car���в��ԡ�
 * 
 * @author Zeng
 * 
 */

public class Vehicle {

	private int speed;
	private String color;


	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

}
