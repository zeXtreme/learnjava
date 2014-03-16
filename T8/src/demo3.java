import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("输入三角形的长：");
		int c = input.nextInt();
		System.out.print("输入三角形的宽：");
		int k = input.nextInt();

		double s = S(c, k);

		System.out.println("三角形的面积为：" + s);

	}

	static double S(int c, int k) {
		int s = c * k / 2;

		return s;
	}

}
