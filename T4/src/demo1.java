import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("请输入第一边长：");
		int b1 = input.nextInt();
		System.out.print("请输入第二边长：");
		int b2 = input.nextInt();
		System.out.print("请输入第三边长：");
		int b3 = input.nextInt();

		if (b1 + b2 > b3 && b1 + b3 > b2 && b2 + b3 > b1) {
			System.out.println("可以组成三角形");
			if (b1 == b2 || b1 == b3 || b2 == b3) {
				if (b1 == b2 && b2 == b3) {
					System.out.println("三角形为等边三角形");
				} else {
					System.out.println("三角形为等腰三角形");
				}
			}
			if (((b1 ^ 2 + b2 ^ 2) == (b3 ^ 2))
					|| (b2 ^ 2 + b3 ^ 2) == (b1 ^ 2)
					|| (b1 ^ 2 + b3 ^ 2) == (b2 ^ 2)) {
				System.out.println("三角形为直角三角形");
			}
		} else {
			System.out.println("无法组成三角形");
		}

	}
}
