package me.zwy.chat;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10086);
			Vector sockets = new Vector();
			while(true){
				Socket s = ss.accept();
				sockets.add(s);
				InputStream is = s.getInputStream();
				InputThread it = new InputThread(sockets, is);
				it.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
