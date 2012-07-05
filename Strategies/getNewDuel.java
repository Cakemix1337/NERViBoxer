package NERVEDuelArena.Strategies;

import static NERVEDuelArena.API.DuelFirstScreenAPI.*;
import static NERVEDuelArena.Methods.Chat.*;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.widget.WidgetChild;

import static NERVEDuelArena.Constants.*;

public class getNewDuel {
	public static void getNewDuels() {
		opponentName = null;
		triedPrevious = false;
		
		if(Widgets.get(1186,1).isOnScreen()){
			Widgets.get(1186,10).click(true);
		}
		
		
		if (Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1) !=null && gotMessage()) {
			System.out.println("Clicking stake");

			clickStakeMessage();
		} else {
			spamMessage();
		}

	}

	public static void spamMessage() {

		switch (chosenSpamMessage) {
		// Box 1m
		// B1M
		// Boxing 1m

		// Box 1m - username
		// B1M - username
		// Boxing 1m - username

		case 1:// Without username

			int randomNumberMessage1 = Random.nextInt(1, 3);
			switch (randomNumberMessage1) {
			case 1:
				System.out.println("Box " + getQuantity(amount_to_add()));
				Keyboard.sendText("Box " + getQuantity(amount_to_add()),
						true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;
			case 2:
				System.out.println("B" + getQuantity(amount_to_add()));
				Keyboard.sendText("B" + getQuantity(amount_to_add()), true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;
			case 3:
				System.out.println("Boxing " +getQuantity(amount_to_add()));
				Keyboard.sendText("Boxing " +getQuantity(amount_to_add()),
						true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;
			}

			break;

		case 2: // With username
			int randomNumberMessage2 = Random.nextInt(1, 3);
			switch (randomNumberMessage2) {
			case 1:
				Keyboard.sendText("Box " + getQuantity(amount_to_add())
						+ " - " + getNickname(), true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;
			case 2:
				Keyboard.sendText("B" + getQuantity(amount_to_add())
						+ " - " + getNickname(), true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;
			case 3:
				Keyboard.sendText("Boxing " + getQuantity(amount_to_add())
						+ " - " + getNickname(), true);
				Time.sleep(Random.nextInt(spamSpeedX, spamSpeedY));
				break;

			}

		}
	}

	



	
	public static String getQuantity(int quantity){
	    String name = String.format("%d", quantity);
	    //1B
	    if(quantity >= 1000000000){
	        name = String.format("%sM", name.substring(0,4));
	    }else if(quantity >= 100000000){
	        name = String.format("%sM", name.substring(0,3));
	    }else if(quantity >= 10000000){
	    	// replace all 00000 with M and if there is third num - add comma

	    	String temp = String.format("%d", quantity);
			String second = String.format("%s", temp.charAt(2));
			int thirdDigit = Integer.parseInt(second);
			
			if (thirdDigit == 0) {
		        name = String.format("%sM", name.substring(0,2));

			} else {
				name = quantity
						/ 1000000 + "." + thirdDigit + "M";
			}
			
	    }else if(quantity >= 1000000){
	    	// replace all 00000 with M and if there is second num - add comma
			String temp = String.format("%d", quantity);
			String second = String.format("%s", temp.charAt(1));
			int secondDigit = Integer.parseInt(second);
			
			if (secondDigit == 0) {
				name = String.format("%sM", name.substring(0,1));

			} else {
				name = quantity
						/ 1000000 + "." + secondDigit + "M";
			}
	        
	    }else if(quantity >= 100000){
	        name = String.format("%sk", name.substring(0,3));
	    }else if(quantity >= 10000){
	        name = String.format("%sk", name.substring(0,2));
	    }else if(quantity >= 1000){
	        name = String.format("%sk", name.substring(0,1));
	    }
	    return name;
	}

}
