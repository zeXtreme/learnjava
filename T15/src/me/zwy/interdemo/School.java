package me.zwy.interdemo;

public class School implements IDetail{
	
	String schName;
	private Print p;
	
	public void setPrint(Print printer){
		this.p=printer;
	}
	
	public String detail(){
		return "������"+schName+"ѧԺ";
	}
	
	public void print(IDetail i){
		p.print(i.detail());
	}

}
