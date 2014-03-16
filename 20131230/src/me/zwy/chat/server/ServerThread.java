package me.zwy.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class ServerThread extends Thread {
	private Vector<Socket> v = null;
	private Socket s = null;
	public ServerThread(Vector<Socket> v,Socket s){
		this.v = v;
		this.s = s;
	}
	@Override
	public void run() {
		try {
			InputStream in = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while(true){
				String msg = br.readLine();
				for(Socket sout : v){
					OutputStream os = sout.getOutputStream();
					PrintWriter pw = new PrintWriter(os);
					pw.println(s.getInetAddress().getHostAddress() + ":" + msg);
					pw.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
