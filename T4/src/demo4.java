import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入今天是星期几（1-7）：");
		int week = input.nextInt();

		switch (week) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("工作日快乐");
				break;
			case 6:
			case 7:
				System.out.println("周末愉快");
				break;
			default:
				System.out.println("输入有误");
				break;
		}

	}

}
