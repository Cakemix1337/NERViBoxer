package NERVEDuelArena.Strategies;

import static NERVEDuelArena.Methods.Chat.pouchAmount;
import static NERVEDuelArena.Methods.ChatOptions.setAllTab;
import static NERVEDuelArena.Methods.ChatOptions.setChatOptions;
import static NERVEDuelArena.Methods.ChatOptions.*;
import static NERVEDuelArena.Constants.*;
import static NERVEDuelArena.AbstractStrategy.*;
import static NERVEDuelArena.Methods.Chat.*;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class loadStartup {
	public static void LOADING() {

		//if in lobby - login
		if(Widgets.get(906,185).isOnScreen()){
			Widgets.get(906,185).click(true);
		}
		
		Widgets.get(548, MONEY_POUCH).click(false);
		if (Menu.isOpen()) {
			Menu.select("Examine money pouch");
			Time.sleep(Random.nextInt(300,1500));
		}

		if (!checkChatOptions()) {
			setChatOptions();
			setAllTab();
		}
		if (startMoney == 0) {
			checkPouchAmount();
			startMoney = pouchAmount();

		}
		if (startMoney < userChosenAmount) {
			System.out.println("Out of money");
			context.stop();
		}

	}
}
