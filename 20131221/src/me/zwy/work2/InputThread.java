package me.zwy.work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputThread extends Thread {

	private Socket s = null;
	
	public InputThread(Socket s){
		this.s = s;
	}
	@Override
	public void run() {
		try {
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			while(true){
				String str;
				while(true){
					str = br.readLine();
					if(str == null){
						break;
					}
					System.out.println(s.getInetAddress() + "��" + str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
