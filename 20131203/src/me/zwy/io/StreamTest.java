package me.zwy.io;

import java.io.File;
import java.io.FileInputStream;

public class StreamTest {

	public static void main(String[] args) throws Exception {
		File file = new File("test.txt");
		FileInputStream fis = new FileInputStream(file);

		while (true) {
			int n = fis.read();
			if (n != -1) {
				System.out.print((char) n);
			} else {
				break;
			}
		}
		fis.close();

	}

}
