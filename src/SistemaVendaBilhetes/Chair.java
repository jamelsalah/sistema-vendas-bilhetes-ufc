package SistemaVendaBilhetes;

import java.awt.Color;
import java.awt.Dimension;

import  javax.swing.JButton;

public class Chair extends JButton {
	public int state = 0;
	public int id = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Chair(int state, int id, int salve) {
		this.id = id;
		this.state = state;
		
		setPreferredSize(new Dimension( 30, 30 ));
		setMaximumSize(new Dimension( 20, 20 ));
		if(state == 0) {
			setBackground(Color.white );
		} else if(state == 1) {
			setBackground(Color.blue);
		} else if(state == 2) {
			setBackground(Color.red);
		}
		
		System.out.printf("%s\n", salve);
		
	}
}