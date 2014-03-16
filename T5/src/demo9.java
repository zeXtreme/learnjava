public class demo9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 1, num3;

		for (int i = 1; i <= 20; i++) {
			System.out.print(num2 + " ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}

	}

}
