public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 1; i <= 4; i++) {
			for (int k = 1; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = i - 1; i >= 1; i--) {
			for (int k = 1; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
