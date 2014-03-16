package me.zwy.code;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws Exception{
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(10000);
		while(true){
			Socket s = ss.accept();
//			System.out.println("ok");
			OutputThread ot = new OutputThread(s);
			ot.start();
			InputThread it = new InputThread(s);
			it.start();
		}
	}

}
