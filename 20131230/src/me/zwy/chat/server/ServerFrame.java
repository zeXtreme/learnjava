package me.zwy.chat.server;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

public class ServerFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerFrame window = new ServerFrame();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServerFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final Thread server = new Server();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("\u670D\u52A1\u5668\u8FD0\u884C\u72B6\u6001");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel labelStatus = new JLabel("\u670D\u52A1\u5668\u5DF2\u505C\u6B62");
		labelStatus.setFont(new Font("宋体", Font.PLAIN, 14));
		labelStatus.setHorizontalAlignment(SwingConstants.CENTER);
		labelStatus.setBounds(112, 32, 211, 44);
		frame.getContentPane().add(labelStatus);
		
		JButton btnStartServer = new JButton("\u5F00\u542F\u670D\u52A1\u5668");
		btnStartServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				server.start();
				labelStatus.setText("服务器已运行");
			}
		});
		btnStartServer.setBounds(39, 120, 169, 80);
		frame.getContentPane().add(btnStartServer);
		
		JButton btnStopServer = new JButton("\u505C\u6B62\u670D\u52A1\u5668");
		btnStopServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnStopServer.setBounds(224, 120, 169, 80);
		frame.getContentPane().add(btnStopServer);
	}
}
