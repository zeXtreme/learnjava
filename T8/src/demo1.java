import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 *            输入数字并按从小到大排序
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int num;

		System.out.print("请输入你要输入数字的个数：");
		num = input.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个数：");
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp;
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}

		System.out.print("按照从小到大排序为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
