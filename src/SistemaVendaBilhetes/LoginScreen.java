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
	JPanel mainPanel = new JPanel();
	JPanel panelForLabels = new JPanel();
	JPanel panelForFields = new JPanel();
	JPanel panelForButtons = new JPanel();
	JPanel panelForTitle = new JPanel();
	
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
        
        panelForTitle.add(title);
        panelForTitle.setBackground(Color.white);
        
        title.setFont(f1);
        title.setForeground(Color.black);
        //title.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panelForLabels.setLayout(new BoxLayout(panelForLabels, BoxLayout.PAGE_AXIS));
        panelForLabels.setBackground(Color.white);
        
        panelForFields.setLayout(new BoxLayout(panelForFields, BoxLayout.PAGE_AXIS));
        panelForFields.setBackground(Color.white);
        panelForFields.setPreferredSize( new Dimension( 200, 80 ) );
        //panelForFields.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginField.setMaximumSize(new Dimension(200, 30));
        passwordField.setMaximumSize(new Dimension(200, 30));
        
        panelForLabels.add(Box.createRigidArea(new Dimension(5, 7)));
        panelForLabels.add(placeholder1);
        panelForLabels.add(Box.createRigidArea(new Dimension(5, 20)));
        panelForLabels.add(placeholder2);
        panelForLabels.setPreferredSize( new Dimension( 70, 80 ) );
        //panelForLabels.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panelForFields.add(loginField);
        panelForFields.add(Box.createRigidArea(new Dimension(5, 10)));
        panelForFields.add(passwordField);
        
        mainPanel.add(panelForLabels);
        panelForFields.add(Box.createRigidArea(new Dimension(17, 10)));
        mainPanel.add(panelForFields);
        mainPanel.setSize( new Dimension( 150, 100 ) );
        mainPanel.setBackground(Color.white);
        //mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panelForButtons.setLayout(new BoxLayout(panelForButtons, BoxLayout.LINE_AXIS));
        panelForButtons.add(loginButton);
        panelForButtons.add(registerButton);
        panelForButtons.setBackground(Color.white);
        //panelForButtons.setBorder(BorderFactory.createLineBorder(Color.black));
        
        loginButton.addActionListener(new LoginAction(loginField, passwordField));
        
        loginScreen.add(panelForTitle);
        loginScreen.add(mainPanel);
        loginScreen.add(panelForButtons);
        add(loginScreen);
	}
}