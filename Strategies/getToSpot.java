package NERVEDuelArena.Strategies;

import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.util.Random;

import static NERVEDuelArena.API.DuelFirstScreenAPI.amount_to_add;
import static NERVEDuelArena.Constants.*;
import static NERVEDuelArena.Methods.Chat.*;

public class getToSpot {

	public static int randomNumber;

	public static void getToSpots() {
		if (Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText()
				.contains("Well done! You have defeated")
				|| Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
						.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE2).getText()
						.contains("Well done! You have defeated")) {
				
			if(checkedWin == false){
				winInARowz += 1;
				if(winInARowz > wonInARowRECORD){
					wonInARowRECORD = winInARowz;
				}
			
				// profit
				amount_we_have_won += amount_to_add();
				lostInARowz = 0;
				
				lastFight = "Win";
				
				// paint
				times_won += 1;
				
				checkedWin = true;	
			}
				
		} else if (Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText()
				.contains("Oh dear, you are dead!")) {
				
			if (checkedLost == false) {
				// profit
				amount_we_have_lost += amount_to_add();		
				lastFight = "Lost";
				lostInARowz += 1;
				winInARowz = 0;
				if(lostInARowz > lostInARowRECORD){
					lostInARowRECORD = lostInARowz;
				}
			
				
				// paint
				times_lost += 1;
				
				
				checkedLost = true;
				
			}

		}

		if (amount_to_add() <= 400000) {
			if (!Players.getLocal().isMoving() && !isInDuelArenaSpot()) {
				Walking.walk(duelArenaTile1);
			}
		} else if (amount_to_add() >= 400000 && amount_to_add() <= 10000000) {
			if (!Players.getLocal().isMoving() && !isInDuelArenaSpot()) {
				Walking.walk(duelArenaTile2);
			}
		} else if (amount_to_add() >= 10000000) {
			if (!Players.getLocal().isMoving() && !isInDuelArenaSpot()) {
				Walking.walk(duelArenaTile3);
			}

		}

	}
}
