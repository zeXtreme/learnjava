import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("������һ��������");
		int num = input.nextInt();

		// int i=num-1;
		int sum = num;
		// while(i>0){
		// sum *= i;
		// i--;
		// }

		// do{
		// sum *= i;
		// i--;
		// }while(i>0);

		for (int i = num - 1; i > 0; i--) {
			sum *= i;
		}
		System.out.println(num + "�Ľ׳�Ϊ��" + sum);

	}

}
