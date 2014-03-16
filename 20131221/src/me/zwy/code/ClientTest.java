package me.zwy.code;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",10000);
//		System.out.println("ok..");
		InputThread it = new InputThread(s);
		it.start();
		OutputThread ot = new OutputThread(s);
		ot.start();
	}

}
