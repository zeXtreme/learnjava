import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("请输入员工基本工资：");
		int j = input.nextInt();

		System.out.println("员工实际工资为：" + (j + (j * 0.4 + j * 0.2)));

	}

}
