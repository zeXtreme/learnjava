package me.zwy.code;

import java.util.Arrays;

public class CollectionTest {

	public static void main(String[] args) {
		int[] n = { 22, 43, 21, 7, 343, 32 };
//		for (int i = 0; i < n.length - 1; i++) {
//			for (int j = 0; j < n.length - 1 - i; j++) {
//				if (n[j] > n[j + 1]) {
//					int tmp = n[j];
//					n[j] = n[j + 1];
//					n[j + 1] = tmp;
//				}
//			}
//		}
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println("\n"+Arrays.binarySearch(n, 22));
	}

}
