package me.zwy;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setsId("S201203001");
		s.setsName("zs");
		s.setcName("S120901JA");
		
		try{
			if(s.getsId().length()==10
					&&s.getsId().substring(0, 5).equals("S2012")
					&&Integer.parseInt(s.getsId().substring(5, 7))>0
					&&Integer.parseInt(s.getsId().substring(5, 7))<13
					&&Integer.parseInt(s.getsId().substring(7))>0){
				System.out.println("����Ϸ�");
			}
			else{
				System.out.println("���벻�Ϸ�");
			}
		}
		catch(NumberFormatException e){
			System.out.println("���벻�Ϸ�");
		}

	}

}
