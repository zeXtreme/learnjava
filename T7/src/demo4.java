import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] score = new int[5];
		int sum = 0;
		int max = 0;
		int min = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
			score[i] = input.nextInt();
			sum += score[i];
			if (i == 0) {
				max = score[i];
				min = score[i];
			} else {
				if (score[i] > max) {
					max = score[i];
				} else if (score[i] < min) {
					min = score[i];
				}
			}
		}
		System.out.println("这五个学生的总分为：" + sum);
		System.out.println("这五个学生的平均分为：" + (sum / 5));
		System.out.println("其中最高分为：" + max);
		System.out.println("其中最低分为：" + min);

	}

}
