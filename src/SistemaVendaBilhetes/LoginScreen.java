package SistemaVendaBilhetes;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;

public class LoginScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//PANELS
	JPanel loginScreen = new JPanel();
	JPanel mainContainer = new JPanel();
	JPanel labelsContainer = new JPanel();
	JPanel fieldsContainer = new JPanel();
	JPanel buttonsContainer = new JPanel();
	JPanel titleContainer = new JPanel();
	
	//BUTTONS
	JButton loginButton = new JButton("Login");
	JButton registerButton = new JButton("Register");
	
	//LABELS 
	JLabel title = new JLabel("Login");
	JLabel placeholder1 = new JLabel("Login:");
	JLabel placeholder2 = new JLabel("Password:");
	
	//BUTTONS
	
	//TEXT FIELDS
	JTextField loginField = new RoundJTextField(10);
	JTextField passwordField = new RoundJPasswordField(10);
	
	//FONTS
	Font f1 = new Font("Calibri", Font.PLAIN, 35);
	
	public LoginScreen() {
		super("Login Screen");
		
        setSize(300, 220);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        loginScreen.setLayout(new BoxLayout(loginScreen, BoxLayout.PAGE_AXIS));
        loginScreen.setBackground(Color.white);
        
        titleContainer.add(title);
        titleContainer.setBackground(Color.white);
        
        title.setFont(f1);
        title.setForeground(Color.black);
        //title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        labelsContainer.setLayout(new BoxLayout(labelsContainer, BoxLayout.PAGE_AXIS));
        labelsContainer.setBackground(Color.white);
        
        fieldsContainer.setLayout(new BoxLayout(fieldsContainer, BoxLayout.PAGE_AXIS));
        fieldsContainer.setBackground(Color.white);
        fieldsContainer.setPreferredSize( new Dimension( 200, 80 ) );
        //fieldsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginField.setMaximumSize(new Dimension(200, 30));
        passwordField.setMaximumSize(new Dimension(200, 30));
        
        labelsContainer.add(Box.createRigidArea(new Dimension(5, 7)));
        labelsContainer.add(placeholder1);
        labelsContainer.add(Box.createRigidArea(new Dimension(5, 20)));
        labelsContainer.add(placeholder2);
        labelsContainer.setPreferredSize( new Dimension( 70, 80 ) );
        //labelsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        
        fieldsContainer.add(loginField);
        fieldsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
        fieldsContainer.add(passwordField);
        
        mainContainer.add(labelsContainer);
        fieldsContainer.add(Box.createRigidArea(new Dimension(17, 10)));
        mainContainer.add(fieldsContainer);
        mainContainer.setSize( new Dimension( 150, 100 ) );
        mainContainer.setBackground(Color.white);
        //mainContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        
        buttonsContainer.setLayout(new BoxLayout(buttonsContainer, BoxLayout.LINE_AXIS));
        buttonsContainer.add(loginButton);
        buttonsContainer.add(registerButton);
        buttonsContainer.setBackground(Color.white);
        //buttonsContainer.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginButton.addActionListener(new LoginAction(loginField, passwordField));
        
        loginScreen.add(titleContainer);
        loginScreen.add(mainContainer);
        loginScreen.add(buttonsContainer);
        add(loginScreen);
	}
}