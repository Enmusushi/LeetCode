package com.fm.test;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Message {
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setTitle("FMtransfer");
		jframe.setSize(400, 500);
		jframe.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		JButton button = new JButton();
		button.setText("服务端");
		panel.add(button);
		jframe.add(panel);
	}
}
