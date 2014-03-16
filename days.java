public class days{
	public static void main(String[] args){
		int days = 46;
		int week = days / 7;
		int leftDay = days % 7;
		
		System.out.println("周数="+week);
		System.out.println("剩余的天数="+leftDay);
	}
}