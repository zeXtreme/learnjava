package me.zwy;

/**
 * 设计一个交通工具类Vehicle，其中的属性包括speed、color，方法包括：设置颜色setColor，
 * 取得颜色getColor，设置速度setSpeed，获得速度getSpeed。再设计一个子类Car，
 * 增加属性passenger表示可容纳的旅客人数，添加方法：设置可容纳旅客人数setPassenger（）和取得
 * 可容纳旅客人数getPassenger（）。创建一个VehicTest测试程序对Vehicle和Car进行测试。
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
