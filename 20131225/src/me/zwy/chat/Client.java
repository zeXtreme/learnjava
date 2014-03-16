package me.zwy.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 10086);
			InputStream is = s.getInputStream();
			ClientInput ci = new ClientInput(is);
			ci.start();
			PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			while(true){
				System.out.print("请输入要发送的消息：");
				pw.println(new Scanner(System.in).nextLine());
				pw.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
