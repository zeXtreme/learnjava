package me.zwy.io;

public class sum {

	public static void main(String[] args) {

		jiechen(5);
		System.out.println(s);

	}

	static int s = 1;

	public static void jiechen(int n) {
		if (n == 1) {
			s = s * 1;
		} else {
			s *= n;
			jiechen(n - 1);
		}
	}

}
