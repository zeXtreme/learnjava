package me.zwy.io;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) throws Exception {

		// File file = new File("test.txt");
		// FileInputStream fis = new FileInputStream(file);
		// byte[] bytes = new byte[(int) file.length()];
		// for (; (fis.read(bytes)) != -1;) {
		// System.out.println(new String(bytes, "gbk"));
		// }
		// fis.close();

		// Scanner scan = new Scanner(System.in);
		// FileOutputStream fos = new FileOutputStream(file, true);
		// System.out.print("������������ӵ����ݣ�");
		// String msg = scan.next();
		// fos.write(msg.getBytes());
		// fos.flush();
		// fos.close();

		copyFile("test.txt", "d:/zeng.txt");

	}

	/**
	 * �����ļ�
	 * 
	 * @param source
	 *            Դ�ļ�
	 * @param desctition
	 *            Ŀ���ļ�
	 * @throws Exception
	 */
	public static void copyFile(String source, String desctition)
			throws Exception {
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(desctition);
		int n = -1;
		while ((n = fis.read()) != -1) {
			fos.write(n);
		}
		fis.close();
		fos.close();
		System.out.println("�ļ��������");
	}

}
