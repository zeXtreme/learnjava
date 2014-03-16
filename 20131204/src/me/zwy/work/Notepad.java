package me.zwy.work;

import java.io.*;
import java.util.Scanner;

public class Notepad {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		File file = new File("D:/Temp.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		while (true) {
			String str;
			System.out.print("请输入要保存的内容（输入exit结束）：");
			str = scan.next();
			if (str.equals("exit")) {
				break;
			}
			bw.write(str);
			bw.flush();
		}
		bw.close();
		String fileName;
		System.out.print("请输入要保存的文件路径：");
		fileName = scan.next();
		File newFile = new File(fileName);
		if (file.renameTo(newFile)) {
			System.out.println("文件保存成功！");
		}
		scan.close();

	}

}
