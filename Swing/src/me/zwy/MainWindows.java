package me.zwy;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainWindows {

	private JFrame frmManage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindows window = new MainWindows();
					window.frmManage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManage = new JFrame();
		frmManage.setTitle("Manage");
		frmManage.setBounds(100, 100, 1280, 720);
		frmManage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManage.getContentPane().setLayout(null);
	}
}
