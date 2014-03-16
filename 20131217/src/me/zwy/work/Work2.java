package me.zwy.work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Work2 {

	public static void main(String[] args) {
		ReadFile1 t1 = new ReadFile1();
		ReadFile2 t2 = new ReadFile2();
		t1.start();
		t2.start();
	}

}

class ReadFile1 extends Thread{
	@Override
	public void run() {
		try {
			FileReader fr = new FileReader("1.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ReadFile2 extends Thread{
	@Override
	public void run() {
		try {
			FileReader fr = new FileReader("2.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
