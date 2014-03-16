public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 4, num2 = 2;

		int jiaResult = jia(num1, num2);
		int jianResult = jian(num1, num2);
		int chengResult = cheng(num1, num2);
		int chuResult = chu(num1, num2);

		System.out.println(jiaResult);
		System.out.println(jianResult);
		System.out.println(chengResult);
		System.out.println(chuResult);

	}

	static int jia(int num1, int num2) {
		int result = num1 + num2;

		return result;
	}

	static int jian(int num1, int num2) {
		int result = num1 - num2;

		return result;
	}

	static int cheng(int num1, int num2) {
		int result = num1 * num2;

		return result;
	}

	static int chu(int num1, int num2) {
		int result = num1 / num2;

		return result;
	}

}
