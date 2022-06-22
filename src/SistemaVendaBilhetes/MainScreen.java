package SistemaVendaBilhetes;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;

public class MainScreen extends JFrame {
	public int chairSelected = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//PANELS
	JPanel mainScreen = new JPanel();
	JPanel chairsContainer = new JPanel();
	JPanel chairsContainer1 = new JPanel();
	JPanel titleContainer = new JPanel();
	JPanel optionsContainer = new JPanel();
	
	//BUTTONS
	JButton buyButton = new JButton("Comprar");
	
	//LABELS 
	JLabel title = new JLabel("Venda de Bilhetes UFC");
	JLabel option1 = new JLabel("N/A");
	JLabel option2 = new JLabel("Selecionado");
	JLabel option3 = new JLabel("Ocupado");
	
	//FONTS
	Font f1 = new Font("Calibri", Font.BOLD, 35);
	Font f2 = new Font("Calibri", Font.PLAIN, 25);
	
	public MainScreen(int salve) {
		super("Venda de Bilhetes");

		
        setSize(1200, 800);
        setLocation(150, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        title.setFont(f1);
        title.setForeground(Color.white);
        
        titleContainer.add(title);
        titleContainer.setMaximumSize(new Dimension(1000, 100));
        titleContainer.setBackground(Color.black);
        
        chairsContainer.setLayout(new FlowLayout());
        //chairsContainer.setBorder(BorderFactory.createLineBorder(Color.white));
        chairsContainer.setBackground(Color.black);
        chairsContainer.setMinimumSize(new Dimension(460, 300));
        chairsContainer.setPreferredSize(new Dimension(460, 300));
        chairsContainer.setSize(new Dimension(460, 300));
        for(int i = 1; i <= 66; ++i) {
        	Chair chair = new Chair(0, i, salve);
        	chair.addActionListener(new ChairAction(chair));
        	
        	chairsContainer.add(chair);
        	chairsContainer.add(Box.createRigidArea(new Dimension(5, 5)));
        }
        
        option1.setFont(f2);
        option1.setForeground(Color.white);
        option2.setFont(f2);
        option2.setForeground(Color.white);
        option3.setFont(f2);
        option3.setForeground(Color.white);
        
        //optionsContainer.setBorder(BorderFactory.createLineBorder(Color.white));
        optionsContainer.setSize(new Dimension(460, 100));
        optionsContainer.setPreferredSize(new Dimension(460, 100));
        optionsContainer.setMinimumSize(new Dimension(460, 100));
        optionsContainer.setBackground(Color.black);
        optionsContainer.add(new Chair(0, 0, salve));
        optionsContainer.add(option1);
        optionsContainer.add(Box.createRigidArea(new Dimension(17, 10)));
        optionsContainer.add(new Chair(1, 0, salve));
        optionsContainer.add(option2);
        optionsContainer.add(Box.createRigidArea(new Dimension(17, 10)));
        optionsContainer.add(new Chair(2, 0, salve));
        optionsContainer.add(option3);
        optionsContainer.add(Box.createRigidArea(new Dimension(17, 10)));
        
        chairsContainer1.add(chairsContainer);
        chairsContainer1.setBackground(Color.BLACK);
        
        mainScreen.setLayout(new BoxLayout(mainScreen, BoxLayout.PAGE_AXIS));
        mainScreen.add(titleContainer);
        mainScreen.add(optionsContainer);
        mainScreen.add(chairsContainer1);
        mainScreen.add(buyButton);
        mainScreen.add(Box.createRigidArea(new Dimension(17, 200)));
        mainScreen.setBackground(Color.black);
        //mainScreen.setBorder(BorderFactory.createLineBorder(Color.black));   
        
        add(mainScreen);
	}
}