import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String choose;
		int count = 0;
		int sum = 0;
		do {
			System.out.print("请输入一个数字：");
			int num = input.nextInt();
			if (num % 2 == 0) {
				count++;
				sum += num;
			}
			System.out.print("是否还要输入（y/n）：");
			choose = input.next();
		} while (choose.equals("y"));
		System.out.println("一共输入了" + count + "个偶数，他们的和是" + sum);

	}

}
