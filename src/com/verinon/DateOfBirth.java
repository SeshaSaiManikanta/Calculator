package com.verinon;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DateOfBirth {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JButton submitButton;
	private JTextField userText;
	public DateOfBirth() {
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Calculate you AGE");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}

		});

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showTextFieldDemo() {
		headerLabel.setText("Welcome To AGE Calculator");

		JLabel namelabel = new JLabel("Enter Your DateOfBirth: ", JLabel.RIGHT);
		  userText = new JTextField("yyyy/MM/dd");
		  userText.setSize(60, 10);
		
		String userenterdata=userText.getText();
		System.out.println(userenterdata);
		final String agee=calculationLogic(userenterdata);
		System.out.println(agee);
		 submitButton = new JButton("submit");
			submitButton.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					String date = "YourAge= "+agee;
					statusLabel.setText(date);
				}
			});
		controlPanel.add(namelabel);
		controlPanel.add(userText);
		controlPanel.add(submitButton);
		mainFrame.setVisible(true);
	}

	private String calculationLogic(String fielddata) {
		System.out.println(fielddata);
		
		
		return fielddata+"some";

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DateOfBirth dateofbirth = new DateOfBirth();
		dateofbirth.showTextFieldDemo();

	}

}
