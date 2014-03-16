package me.zwy.code;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws Exception{
		URL u = new URL("http://192.168.137.1:8080/20131225/icon.jpg");
		InputStream is = u.openStream();
		FileOutputStream fis = new FileOutputStream("D:/down.jpg");
		while(true){
			int n = is.read();
			if(n == -1){
				break;
			}
			fis.write(n);
		}
		fis.flush();
		fis.close();
		is.close();
		System.out.println("Download Compelete!");
	}

}
