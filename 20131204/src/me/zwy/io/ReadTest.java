package me.zwy.io;

import java.io.*;

public class ReadTest {

	public static void main(String[] args) throws Exception {
		File file = new File("test.txt");
//		FileReader rd = new FileReader(file);
//		int n = rd.read();
//		while(n != -1){
//			System.out.print((char)n);
//			n = rd.read();
//		}
		
		bufferedReaader(file);

	}
	
	public static void bufferedReaader(File file) throws Exception{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
