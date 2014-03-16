package me.zwy.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UFile {

	public static void main(String[] args) throws Exception {

		String[] files = {"D:/ADSL.txt","D:/WIN8.txt"};
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:/new.txt",true));
		
		for(int i=0;i<files.length;i++){
			BufferedReader br = new BufferedReader(new FileReader(files[i]));
			String line = null;
			while((line = br.readLine())!=null){
				bw.write(line);
			}
			br.close();
		}
		bw.close();
		System.out.println("文件合并完成");
	}

}
