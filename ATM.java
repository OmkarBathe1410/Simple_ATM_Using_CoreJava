package corejava.project.atm;

import java.io.IOException;

/*Entry point to out system*/
public class ATM extends OptionMenu {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		
		optionMenu.getLogin();
	}

}
