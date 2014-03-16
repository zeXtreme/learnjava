package me.zwy.chat.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class OutputThread extends Thread{
	private Socket s;
	private String msg;
	public OutputThread(Socket s,String msg){
		this.s = s;
		this.msg = msg;
	}
	@Override
	public void run() {
		try {
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.println(msg);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
