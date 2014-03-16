package me.zwy.io;

import java.io.File;
import java.util.Date;

public class IOTest {

	public static void main(String[] args) {
		File f = new File("test.txt");
		System.out.println("�ļ��Ƿ���ڣ�" + f.exists());
		System.out.println("�ļ���С��" + f.length());
		System.out.println("�޸�ʱ�䣺" + new Date(f.lastModified()));
		System.out.println("�ļ�����" + f.getName());
		System.out.println("·����" + f.getAbsolutePath());

		System.out.println("===============================================");
		listFileName(new File("D:/Java"));
		findAllFile(new File("D:/Java/�ʼ�"));
	}

	/**
	 * �г���ǰ�ļ����е������ļ����������ļ�������
	 * 
	 * @param file
	 *            Ҫ��ʾ���ļ��ж���
	 * 
	 */
	public static void listFileName(File file) {
		if (file.exists()) {//�ж��ļ����ļ����Ƿ����
			if (file.isDirectory()) {//�ж��Ƿ����ļ���
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].getName().endsWith(".rar")) {
						System.out.println(files[i].getAbsolutePath());
					}
				}
			} else {
				System.out.println("�˶�����Ŀ¼");
			}
		} else {
			System.out.println("�ļ�������");
		}
	}

	/**
	 * �ҳ���ǰ�ļ����������ļ����������ļ����е��ļ�
	 * 
	 * @param file
	 *            ������Ŀ¼
	 */
	public static void findAllFile(File file) {
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()) {//�ж϶����Ƿ����ļ�
						System.out.println(files[i].getAbsolutePath());
					} else {//��������ļ�����ô�����ļ��У���������
						findAllFile(files[i]);
					}
				}
			} else {
				System.out.println("���ļ�����Ŀ¼");
			}
		} else {
			System.out.println("�ļ�������");
		}
	}

}
