public class demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 100; i < 1000; i++) {
			int num1, num2, num3;
			int sum = 0;

			num1 = i / 100;
			num2 = i % 100 / 10;
			num3 = i % 10;
			sum = num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3;

			if (sum == i) {
				System.out.print(i + " ");
			} else {
				continue;
			}
		}

	}

}
