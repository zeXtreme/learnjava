package me.zwy.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClientInput extends Thread{

	private InputStream is = null;
	
	public ClientInput(InputStream is){
		this.is = is;
	}
	@Override
	public void run() {
		while(true){
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String msg = br.readLine();
				System.out.println("\n·þÎñÆ÷£º" + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
