package me.zwy.code;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket(10010);
		byte[] b = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		System.out.println(new String(b));
		ds.close();
	}

}
