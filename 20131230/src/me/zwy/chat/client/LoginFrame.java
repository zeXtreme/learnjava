package me.zwy.chat.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textNickName;
	private JTextField textServerAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("\u7528\u6237\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNickName = new JLabel("\u6635\u79F0\uFF1A");
		labelNickName.setFont(new Font("ËÎÌו", Font.PLAIN, 15));
		labelNickName.setHorizontalAlignment(SwingConstants.CENTER);
		labelNickName.setBounds(68, 57, 87, 40);
		contentPane.add(labelNickName);
		
		JLabel labelServerAdd = new JLabel("\u670D\u52A1\u5668\u5730\u5740\uFF1A");
		labelServerAdd.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		labelServerAdd.setHorizontalAlignment(SwingConstants.CENTER);
		labelServerAdd.setBounds(68, 118, 87, 40);
		contentPane.add(labelServerAdd);
		
		textNickName = new JTextField();
		textNickName.setBounds(180, 67, 171, 21);
		contentPane.add(textNickName);
		textNickName.setColumns(10);
		
		textServerAdd = new JTextField();
		textServerAdd.setBounds(180, 128, 171, 21);
		contentPane.add(textServerAdd);
		textServerAdd.setColumns(10);
		
		JButton buttonLogin = new JButton("\u767B\u5F55");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Socket s = new Socket(textServerAdd.getText(),10010);
					if(s.isConnected()){
						new ChatFrame(s);
						LoginFrame.this.dispose();
					}
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonLogin.setFont(new Font("ËÎÌו", Font.PLAIN, 15));
		buttonLogin.setBounds(151, 182, 131, 47);
		contentPane.add(buttonLogin);
	}
}
