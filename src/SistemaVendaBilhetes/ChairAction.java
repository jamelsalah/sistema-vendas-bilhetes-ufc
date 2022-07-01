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
			chair.state = chair.state == 0 ? 1 : 0;
			chair.setBackground(chair.state == 0 ? Color.white : Color.blue);
			
			//System.out.printf("%s %s\n" , chair.id, chair.state);
		}
	}
}