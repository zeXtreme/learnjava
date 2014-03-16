package me.zwy.interdemo;

public class School implements IDetail{
	
	String schName;
	private Print p;
	
	public void setPrint(Print printer){
		this.p=printer;
	}
	
	public String detail(){
		return "这里是"+schName+"学院";
	}
	
	public void print(IDetail i){
		p.print(i.detail());
	}

}
