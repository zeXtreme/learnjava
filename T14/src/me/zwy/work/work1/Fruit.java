package me.zwy.work.work1;

public class Fruit {
	
	private String color;
	
	public Fruit(){
	}

	public Fruit(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void makeJuice(){
		System.out.println("水果正在榨汁");
	}
	
	public void stripSkin(){
		System.out.println("水果削皮中");
	}

}

class Apple extends Fruit{
	
	public void makeJuice(){
		System.out.println("苹果正在榨汁");
	}
	
	public void stripSkin(){
		System.out.println("苹果削皮中");
	}
	
}

class Orange extends Fruit{
	
	public void makeJuice(){
		System.out.println("桔子正在榨汁");
	}
	
	public void stripSkin(){
		System.out.println("桔子削皮中");
	}
	
}