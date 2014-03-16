package me.zwy.work1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 10050);
			FileOutputStream fos = new FileOutputStream("D:/test.zip",true);
			InputStream is = s.getInputStream();
			while(true){
				int n = is.read();
				if(n == -1){
					break;
				}
				fos.write(n);
				fos.flush();
			}
			is.close();
			fos.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
