package SistemaVendaBilhetes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.math.BigInteger;
//import javax.swing.JLabel;
import javax.swing.JTextField;
import java.net.*;
import java.io.*;

public class LoginAction implements ActionListener{
	
	private JTextField loginField;
	private JTextField passwordField;
	
	public LoginAction(JTextField loginField, JTextField passwordField) {
		this.loginField = loginField;
		this.passwordField = passwordField;
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		String login = loginField.getText();
		String password = passwordField.getText();
		
		
			System.out.printf("%s %s\n", login, password);
			
//			try {
//				Socket s = new Socket("localhost", 5000);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		
		
	}
}