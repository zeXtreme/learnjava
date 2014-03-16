package me.zwy.io;

import java.io.File;
import java.util.Date;

public class IOTest {

	public static void main(String[] args) {
		File f = new File("test.txt");
		System.out.println("文件是否存在：" + f.exists());
		System.out.println("文件大小：" + f.length());
		System.out.println("修改时间：" + new Date(f.lastModified()));
		System.out.println("文件名：" + f.getName());
		System.out.println("路径：" + f.getAbsolutePath());

		System.out.println("===============================================");
		listFileName(new File("D:/Java"));
		findAllFile(new File("D:/Java/笔记"));
	}

	/**
	 * 列出当前文件夹中的所有文件名（包括文件夹名）
	 * 
	 * @param file
	 *            要显示的文件夹对象
	 * 
	 */
	public static void listFileName(File file) {
		if (file.exists()) {//判断文件或文件夹是否存在
			if (file.isDirectory()) {//判断是否是文件夹
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].getName().endsWith(".rar")) {
						System.out.println(files[i].getAbsolutePath());
					}
				}
			} else {
				System.out.println("此对象不是目录");
			}
		} else {
			System.out.println("文件不存在");
		}
	}

	/**
	 * 找出当前文件夹中所有文件，包括子文件夹中的文件
	 * 
	 * @param file
	 *            给定的目录
	 */
	public static void findAllFile(File file) {
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()) {//判断对象是否是文件
						System.out.println(files[i].getAbsolutePath());
					} else {//如果不是文件，那么就是文件夹，调用自身
						findAllFile(files[i]);
					}
				}
			} else {
				System.out.println("此文件不是目录");
			}
		} else {
			System.out.println("文件不存在");
		}
	}

}
