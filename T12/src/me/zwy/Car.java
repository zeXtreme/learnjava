package me.zwy;

/**
 * 子类Car，增加属性passenger表示可容纳的旅客人数，
 * 添加方法：设置可容纳旅客人数setPassenger（）和取得可容纳旅客人数getPassenger（）。
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
