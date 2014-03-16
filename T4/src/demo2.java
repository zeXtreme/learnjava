import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("请输入你的婚姻状况（y为已婚，n为未婚）:");
		String marry = input.next();
		System.out.print("请输入你的性别（m为男性，f为女性）：");
		String sex = input.next();
		System.out.print("请输入你的年龄：");
		int age = input.nextInt();

		if (marry.equals("y")) {
			System.out.println("你已投保");
		} else if (age > 30 && sex.equals("m")) {
			System.out.println("你已投保");
		} else if (age > 25 && sex.equals("f")) {
			System.out.println("你已投保");
		} else {
			System.out.println("你未投保");
		}

	}

}
