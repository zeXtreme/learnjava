package me.zwy.work;

import java.io.*;

public class TwoFile {

	public static void main(String[] args) throws Exception {

		twoText("d:/ADSL.txt", "d:/WIN8.txt", "d:/new.txt");

	}

	/**
	 * �ϲ������ļ�
	 * 
	 * @param path1
	 *            ��һ���ļ���·��
	 * @param path2
	 *            �ڶ����ļ���·��
	 * @param dest
	 *            Ŀ���ļ���·��
	 * @throws Exception
	 */
	public static void twoFile(String path1, String path2, String dest)
			throws Exception {
		FileInputStream fis1 = new FileInputStream(path1);
		FileInputStream fis2 = new FileInputStream(path2);
		FileOutputStream fos = new FileOutputStream(dest, true);
		byte[] bytes1 = new byte[1024];
		fis1.read(bytes1);
		fos.write(bytes1);
		fos.flush();
		fis1.close();
		byte[] bytes2 = new byte[1024];
		fis2.read(bytes2);
		fos.write(bytes2);
		fos.flush();
		fis2.close();
		fos.close();
		System.out.println("�ļ��ϲ����");
	}

	/**
	 * �ϲ������ı��ļ�
	 * 
	 * @param path1
	 *            ��һ���ļ�·��
	 * @param path2
	 *            �ڶ����ļ�·��
	 * @param dest
	 *            Ŀ���ļ�·��
	 * @throws Exception
	 */
	public static void twoText(String path1, String path2, String dest) throws Exception {
		FileReader fr1 = new FileReader(path1);
		FileReader fr2 = new FileReader(path2);
		FileWriter fw = new FileWriter(dest);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedWriter bw = new BufferedWriter(fw);
		while (true) {
			String str = br1.readLine();
			if (str == null) {
				break;
			}
			bw.write(str);
		}
		br1.close();
		bw.newLine();
		while (true) {
			String str = br2.readLine();
			if (str == null) {
				break;
			}
			bw.write(str);
		}
		bw.flush();
		br2.close();
		bw.close();
		System.out.println("�ı��ϲ����");
	}

}
