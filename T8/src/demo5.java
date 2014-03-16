import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		int result = sum(x, y, z);

		System.out.println(result);

	}

	static int sum(int x, int y, int z) {
		int sum = x * x * x + y * y * y + z * z * z;

		return sum;
	}

}
