package me.zwy.work2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

public class Server {

	public static void main(String[] args) {
		HashSet<OutputStream> hs;
		ServerSocket ss;
		try {
			hs = new HashSet<>();
			ss = new ServerSocket(10086);
			while(true){
				Socket s = ss.accept();
				OutputStream os = s.getOutputStream();
				hs.add(os);
				ServerOutThread sot = new ServerOutThread(hs, s);
				sot.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
