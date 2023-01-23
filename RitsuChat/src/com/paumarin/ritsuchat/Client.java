package com.paumarin.ritsuchat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class Client extends JFrame {

	private JPanel contentPane;

	private String name, address;
	private int port;

	public Client(String name, String address, int port) {
		setTitle("RitsuChat Client");
		this.name = name;
		this.address = address;
		this.port = port;

		createWindow();
	}

	private void createWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(880, 550);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
	}

}
