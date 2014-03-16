import java.util.Scanner;

public class demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("请输入一个整数：");
		int num = input.nextInt();

		int i = 1;
		int sum = 0;
		// while(i <= num){
		// sum += i;
		// i++;
		// }

		// do{
		// sum += i;
		// i++;
		// }while(i <= num);

		for (i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("sum:" + sum);
	}

}
