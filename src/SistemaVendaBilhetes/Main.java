package SistemaVendaBilhetes;

public class Main {
	
	static public int salve = 1;

    public static void main(String args[]) {
    	MainScreen mainScreen = new MainScreen(salve);
    	
    	//new LoginScreen();
    	
    	System.out.printf("%s\n", mainScreen.chairsContainer);
    }

}