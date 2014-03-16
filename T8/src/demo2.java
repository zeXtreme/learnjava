import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入你要输入数字的个数：");
		int num = input.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个数：");
			arr[i] = input.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("输入的最大值为：" + max + "，最小值为：" + min + "。");

	}

}
