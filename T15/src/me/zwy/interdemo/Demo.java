package me.zwy.interdemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School s=new School();
		s.schName="µçÄÔ";
		s.setPrint(new Bprinter());
		s.print(s);
		
		Teacher t=new Teacher();
		t.name="ÕÅÈı";
		t.age=20;
		s.setPrint(new Cprinter());
		s.print(t);

	}

}
