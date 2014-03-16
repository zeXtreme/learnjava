package me.zwy.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class InputThread extends Thread {

	private Vector sockets = null;
	private InputStream is = null;
	
	public InputThread(Vector sockets,InputStream is){
		this.sockets = sockets;
		this.is = is;
	}
	@Override
	public void run() {
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg = null;
			try {
				msg = br.readLine();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			for(int i=0;i<sockets.size();i++){
				try {
					Socket s = (Socket) sockets.get(i);
					OutputStream os = s.getOutputStream();
					PrintWriter pw = new PrintWriter(os,true);
					pw.println(msg);
					pw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
