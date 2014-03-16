import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入矩形的长：");
		int c = input.nextInt();
		System.out.println("请输入矩形的宽：");
		int k = input.nextInt();

		System.out.println("矩形的周长为：" + ((c + k) * 2));
		System.out.println("矩形的面积为：" + (c * k));

	}

}
