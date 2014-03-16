package me.zwy.code;

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
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			while(true){
				String str = null;
				while((str = br.readLine()) != null){
					System.out.println(str);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
