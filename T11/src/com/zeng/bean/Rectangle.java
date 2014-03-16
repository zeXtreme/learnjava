package com.zeng.bean;

/**
 * 写一个名为Rectangle的类表示长方形。 数据域为length、width和color。Length和width是double类型的，
 * color是String类型的。假定所有矩形颜色相同，用一个静态变量表示颜色。
 * 要求提供获取器方法和计算矩形周长的computePerimeter（）方法和 计算矩形面积的computeArea（）方法。
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
