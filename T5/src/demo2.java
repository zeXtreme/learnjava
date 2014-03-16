public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int i = 1;
		// int sum=0;

		// while(i <= 100){
		// sum += i;
		// i += 2;
		// }

		// do{
		// sum +=i;
		// i += 2;
		// }while(i <= 100);

		int sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}

		System.out.println(sum);

	}

}
