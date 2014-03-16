import java.util.Scanner;

public class demo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入一个数：");
		int num = input.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println(i + "+" + (num - i) + "=" + num);
		}

	}

}
