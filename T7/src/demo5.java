import java.util.Scanner;

public class demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("������һ������");
		int num = input.nextInt();
		int sum = 0;

		// for(int i=0;i<=num;i++){
		// if(i%2==0){
		// sum+=i;
		// }
		// }

		int i = 0;
		while (true) {
			if (i % 2 == 0) {
				sum += i;
			} else if (i > num) {
				break;
			}
			i++;
		}
		System.out.println("0��������ֵ�ż���ĺ�Ϊ��" + sum);

	}

}
