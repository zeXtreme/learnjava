package me.zwy.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {

	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton btnOk = new JButton("OK");
		JButton btnQuit = new JButton("QUIT");
//		f.add(btnOk,BorderLayout.SOUTH);
//		f.add(btnQuit,BorderLayout.WEST);
//		f.setLayout(new FlowLayout());
//		f.add(btnOk);
//		f.add(btnQuit);
		f.setLayout(null);
		btnOk.setBounds(100, 50, 80, 30);
		btnQuit.setBounds(100, 80, 80, 30);
		f.add(btnOk);
		f.add(btnQuit);
		//事件机制
		btnOk.addActionListener(new BottonAction());//添加单击事件(监听)
	}
	
}

class BottonAction implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//事件处理程序
		System.out.println("Hello world!");
	}
	
}