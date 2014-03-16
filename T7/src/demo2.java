import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个数:");
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i + 1) + "个数是：" + arr[i]);
		}

	}

}
