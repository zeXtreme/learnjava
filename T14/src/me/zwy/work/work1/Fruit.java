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
		System.out.println("ˮ������ե֭");
	}
	
	public void stripSkin(){
		System.out.println("ˮ����Ƥ��");
	}

}

class Apple extends Fruit{
	
	public void makeJuice(){
		System.out.println("ƻ������ե֭");
	}
	
	public void stripSkin(){
		System.out.println("ƻ����Ƥ��");
	}
	
}

class Orange extends Fruit{
	
	public void makeJuice(){
		System.out.println("��������ե֭");
	}
	
	public void stripSkin(){
		System.out.println("������Ƥ��");
	}
	
}