package me.zwy.code;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OutputThread extends Thread {
	
	private Socket s = null;
	
	public OutputThread(Socket s){
		this.s = s;
	}
	
	@Override
	public void run() {
		try {
			Scanner scan = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			String str;
			while(true){
				System.out.print("«Î ‰»Îœ˚œ¢£∫");
				str = scan.nextLine();
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
