package me.zwy.work1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10050);
			Socket s = ss.accept();
			FileInputStream fis = new FileInputStream("D:/20131219.zip");
			OutputStream os = s.getOutputStream();
			while(true){
				int n = fis.read();
				if(n == -1){
					break;
				}
				os.write(n);
				os.flush();
			}
			os.close();
			fis.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
