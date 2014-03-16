package me.zwy.chat.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.Font;
import java.net.Socket;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatFrame extends JFrame {

	private JPanel contentPane;
	private Socket s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					ChatFrame frame = new ChatFrame();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatFrame(Socket s) {
		this.s = s;
		
		ChatFrame.this.setVisible(true);
		setTitle("\u804A\u5929\u7A97\u53E3");
		ChatFrame.this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPaneContent = new JScrollPane();
		scrollPaneContent.setBounds(10, 10, 500, 400);
		contentPane.add(scrollPaneContent);
		
		JTextArea textAreaContent = new JTextArea();
		textAreaContent.setEditable(false);
		scrollPaneContent.setViewportView(textAreaContent);
		textAreaContent.setLineWrap(true);
		
		JScrollPane scrollPaneUserList = new JScrollPane();
		scrollPaneUserList.setBounds(540, 10, 234, 400);
		contentPane.add(scrollPaneUserList);
		
		JList listUserList = new JList();
		scrollPaneUserList.setViewportView(listUserList);
		
		JScrollPane scrollPaneMsg = new JScrollPane();
		scrollPaneMsg.setBounds(10, 455, 500, 64);
		contentPane.add(scrollPaneMsg);
		
		final JTextArea textAreaMsg = new JTextArea();
		textAreaMsg.setText("\u8BF7\u8F93\u5165\u8981\u53D1\u9001\u7684\u6D88\u606F");
		scrollPaneMsg.setViewportView(textAreaMsg);
		textAreaMsg.setLineWrap(true);
		
		JButton buttonSendMsg = new JButton("\u53D1\u9001\u6D88\u606F");
		buttonSendMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = textAreaMsg.getText();
				new OutputThread(ChatFrame.this.s, msg).start();
			}
		});
		buttonSendMsg.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		buttonSendMsg.setBounds(583, 466, 150, 53);
		contentPane.add(buttonSendMsg);
		
		new InputThread(s, textAreaContent).start();
	}
}
