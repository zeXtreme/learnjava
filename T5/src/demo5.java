import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choose;
		do {
			System.out.print("请输入一个数字：");
			int num = input.nextInt();
			System.out.println("你输入的是：" + num);
			System.out.print("是否需要继续输入？（y/n）");
			choose = input.next();
		} while (choose.equals("y"));
		System.out.println("结束运行");

	}

}
