package me.zwy.chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JTextField password;
	User u = new User();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("\u767B\u9646");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_title = new JLabel("\u7528\u6237\u767B\u5F55");
		label_title.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 30));
		label_title.setBounds(147, 10, 127, 69);
		contentPane.add(label_title);
		
		JLabel label_user = new JLabel("\u7528\u6237\u540D");
		label_user.setHorizontalAlignment(SwingConstants.CENTER);
		label_user.setBounds(38, 77, 90, 33);
		contentPane.add(label_user);
		
		JLabel label_pwd = new JLabel("\u5BC6  \u7801");
		label_pwd.setHorizontalAlignment(SwingConstants.CENTER);
		label_pwd.setBounds(38, 120, 90, 33);
		contentPane.add(label_pwd);
		
		userName = new JTextField();
		userName.setBounds(106, 83, 247, 21);
		contentPane.add(userName);
		userName.setColumns(10);
		
		password = new JTextField();
		password.setBounds(106, 126, 247, 21);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.setUserName("zero");
				u.setPassWord("123456");
				String user = userName.getText();
				String pwd = password.getText();
				if(user.equals(u.getUserName()) && pwd.equals(u.getPassWord())){
					System.out.println("OK");
				}
			}
		});
		btnNewButton.setBounds(90, 194, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6CE8\u518C");
		btnNewButton_1.setBounds(247, 194, 93, 23);
		contentPane.add(btnNewButton_1);
		
	}
}
