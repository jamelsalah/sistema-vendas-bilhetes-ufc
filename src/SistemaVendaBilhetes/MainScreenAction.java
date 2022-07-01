package SistemaVendaBilhetes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreenAction implements ActionListener{
	
	private MainScreen mainScreen;
	
	public MainScreenAction(MainScreen mainScreen) {
		this.mainScreen = mainScreen;
	}
	
	public int[][] getChairStates() {
		int i = 0;
		int j = 0;
		int[][] dataArray = new int[67][2];
		
		do {
			if(mainScreen.chairsContainer.getComponent(i) instanceof Chair) {
				int[] data = new int[2];   
				Chair chair = (Chair) mainScreen.chairsContainer.getComponent(i);
				
				data[0] = chair.id;
				data[1] = chair.state;
				
				dataArray[j] =  data;
				j++;
			}
			i++;
		}while(i < mainScreen.chairsContainer.getComponentCount());

		return dataArray;
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		int [][] data = getChairStates();
		
		for(int[] chairData : data) {
			if(chairData[1] == 1) {
				System.out.printf("%s %s \n", chairData[0], chairData[1]);
			}
		}
		
	}
}