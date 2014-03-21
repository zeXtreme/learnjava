package me.zwy.code;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(print("1111"));
	}
	
	public static int gcd(int x,int y)
	{
	 if(x<y)
	 {
	  int tmp = x;
	  x = y;
	  y = tmp;
	 }
	 if(x%y==0)
	 {
	  return y;
	 }else
	 {
	  return gcd(y,x%y);
	 }
	}
	
	public static String print(String str){
		return str;
	}

}
