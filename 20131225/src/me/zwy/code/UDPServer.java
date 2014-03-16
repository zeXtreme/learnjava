package me.zwy.code;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket(10086);
		String msg = "Hello";
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getLocalHost(),10010);
		ds.send(dp);
		ds.close();
	}

}
