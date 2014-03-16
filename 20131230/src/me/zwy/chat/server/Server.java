package me.zwy.chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server extends Thread{
	@Override
	public void run() {
		ServerSocket ss = null;
		Thread thread = null;
		try {
			while(true){
				Vector<Socket> v = new Vector<Socket>();
				ss = new ServerSocket(10010);
				Socket s = ss.accept();
				v.add(s);
				thread = new ServerThread(v, s);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Server().start();
	}
}
