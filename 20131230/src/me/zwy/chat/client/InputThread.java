package me.zwy.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class InputThread extends Thread {
	private Socket s = null;
	private JTextArea textAreaContent = null;
	public InputThread(Socket s,JTextArea textAreaContent){
		this.s = s;
		this.textAreaContent = textAreaContent;
	}
	@Override
	public void run() {
		try {
			InputStream in = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while(true){
				String str = br.readLine();
				textAreaContent.append(str + "\n\r");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
