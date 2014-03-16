package me.zwy.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 23, 34, 14, 76, 45, 77, 44 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp;
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
