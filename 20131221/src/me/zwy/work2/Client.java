package me.zwy.work2;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 10086);
			OutputThread ot = new OutputThread(s);
			InputThread it = new InputThread(s);
			ot.start();
			it.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
