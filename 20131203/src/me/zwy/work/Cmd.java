package me.zwy.work;

import java.io.File;
import java.util.Scanner;

public class Cmd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入dir 路径");
		String path = scan.next();
		System.out.println(path);
//		dir(path[1]);

		scan.close();
	}
	
	public static void dir(String path){
		File file = new File(path);
		if(file.exists()){
			if(file.isDirectory()){
				File[] files = file.listFiles();
				for(int i=0;i<files.length;i++){
					System.out.println(files[i].getName());
				}
			}else{
				System.out.println("此路径不是目录");
			}
		}else{
			System.out.println("此目录不存在");
		}
	}

}
