import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入一个数字：");
		int num = input.nextInt();

		System.out.println(num + "*1=" + (num * 1) + "       " + num + "*2="
				+ (num * 2));
		System.out.println(num + "*3=" + (num * 3) + "       " + num + "*4="
				+ (num * 4));
		System.out.println(num + "*5=" + (num * 5) + "       " + num + "*6="
				+ (num * 6));
		System.out.println(num + "*7=" + (num * 7) + "       " + num + "*8="
				+ (num * 8));
		System.out.println(num + "*9=" + (num * 9) + "       " + num + "*10="
				+ (num * 10));

	}

}
