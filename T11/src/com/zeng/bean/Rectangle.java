package com.zeng.bean;

/**
 * дһ����ΪRectangle�����ʾ�����Ρ� ������Ϊlength��width��color��Length��width��double���͵ģ�
 * color��String���͵ġ��ٶ����о�����ɫ��ͬ����һ����̬������ʾ��ɫ��
 * Ҫ���ṩ��ȡ�������ͼ�������ܳ���computePerimeter���������� ������������computeArea����������
 * 
 * @author Zeng
 * 
 */

public class Rectangle {

	private double length = 1;
	private double weidth = 1;
	private static String color = "white";

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.weidth = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return weidth;
	}

	public void setWidth(double width) {
		this.weidth = width;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String Color) {
		color = Color;
	}

	public double computePerimeter() {
		return (length + weidth) * 2;
	}

	public double computeArea() {
		return length * weidth;
	}

}