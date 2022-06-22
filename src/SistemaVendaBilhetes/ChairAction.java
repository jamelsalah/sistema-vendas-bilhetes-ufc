package SistemaVendaBilhetes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChairAction implements ActionListener{
	
	private Chair chair;
	
	public ChairAction(Chair chair) {
		this.chair = chair;
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(chair.state != 2) {
			chair.setBackground(chair.getBackground() == Color.white ? Color.blue : Color.white);
			
			System.out.printf("%s %s\n" , chair.id, chair.state);
		}
	}
}