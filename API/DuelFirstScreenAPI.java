package NERVEDuelArena.API;

import static NERVEDuelArena.Constants.*;

import java.text.DecimalFormat;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class DuelFirstScreenAPI {

	public static int WIDGET = 631;
	public static int WIDGET_ACCEPT = 46;
	public static int WIDGET_DECLINE = 55;
	public static int WIDGET_MY_STAKE = 47;
	public static int WIDGET_MY_STAKE_SLOT1 = 0;
	public static int WIDGET_OPPONENT_STAKE = 49;
	public static int WIDGET_OPPONENT_STAKE_SLOT1 = 0;
	public static int WIDGET_PREVIOUS_OPTIONS = 69;
	public static int WIDGET_MONEY_POUCH = 53;
	public static int WIDGET_OPPONENT_NAME = 38;
	public static String opponentName;


	// Start OF Duel First Screen Widgets

	public static boolean firstScreenActive() {
		return Widgets.get(WIDGET, 1).isOnScreen();
	}

	public static void acceptDuel() {
		Widgets.get(WIDGET, WIDGET_ACCEPT).click(true);
		triedPrevious = false;
		Time.sleep(Random.nextInt(1000, 2000));
	}

	public static void declineDuel() {
		Widgets.get(WIDGET, WIDGET_DECLINE).click(true);
		triedPrevious = false;
		Time.sleep(Random.nextInt(1000, 2000));
	}

	public static int getMyStake() {
		return Widgets.get(WIDGET, WIDGET_MY_STAKE)
				.getChild(WIDGET_MY_STAKE_SLOT1).getChildStackSize();
	}

	public static int getMyStakeChildId() {
		return Widgets.get(WIDGET, WIDGET_MY_STAKE)
				.getChild(WIDGET_MY_STAKE_SLOT1).getChildId();
	}

	public static void interactMyStake() {
		Widgets.get(WIDGET, WIDGET_MY_STAKE).getChild(WIDGET_MY_STAKE_SLOT1)
				.click(false);
		Time.sleep(Random.nextInt(1000, 2000));

	}

	public static int getOpponentStake() {
		return Widgets.get(WIDGET, WIDGET_OPPONENT_STAKE)
				.getChild(WIDGET_OPPONENT_STAKE_SLOT1).getChildStackSize();
	}
	
	public static int getOpponentStakeChildId() {
		return Widgets.get(WIDGET, WIDGET_OPPONENT_STAKE)
				.getChild(WIDGET_OPPONENT_STAKE_SLOT1).getChildId();
	}

	public static void setPreviousOptions() {
		Widgets.get(WIDGET, WIDGET_PREVIOUS_OPTIONS).click(true);
		Time.sleep(Random.nextInt(1000, 2000));
	}

	public static void addMoney() {

		if (!Widgets.get(752, 4).isOnScreen()) {
			Widgets.get(631, 53).click(true);
			Time.sleep(Random.nextInt(1000, 2000));
		} else {
			if (amount_to_add() == 100000) {
				Keyboard.sendText("100k", true);
			}else if (amount_to_add() == 10000) {
				Keyboard.sendText("10k", true);
			} else if (amount_to_add() == 200000) {
				Keyboard.sendText("200k", true);
			} else if (amount_to_add() == 300000) {
				Keyboard.sendText("300k", true);
			} else if (amount_to_add() == 400000) {
				Keyboard.sendText("400k", true);
			} else if (amount_to_add() == 500000) {
				Keyboard.sendText("500k", true);
			} else if (amount_to_add() == 600000) {
				Keyboard.sendText("600k", true);
			} else if (amount_to_add() == 700000) {
				Keyboard.sendText("700k", true);
			} else if (amount_to_add() == 800000) {
				Keyboard.sendText("800k", true);
			} else if (amount_to_add() == 900000) {
				Keyboard.sendText("900k", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("1m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("2m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("3m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("4m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("5m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("6m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("7m", true);
			} else if (amount_to_add() == 1000000) {
				Keyboard.sendText("8m", true);
			} else if (amount_to_add() == 10000000) {
				Keyboard.sendText("9m", true);
			} else if (amount_to_add() == 100000000) {
				Keyboard.sendText("100m", true);
			} else {
				Keyboard.sendText(Integer.toString(amount_to_add()), true);
			}

			System.out.println(amount_to_stake);
			Time.sleep(Random.nextInt(1000, 2000));
		}

	}

	public static int amount_to_add() {

		if (lastFight == "Win") {
			amount_to_stake = userChosenAmount;
		} else if (lastFight == "Lost") {

			if (checkedAmount == false && !isInOneOfAreas() && checkedLost == true) {
				System.out.println("Lost in a row: " + lostInARowz);

				amount_to_stake = (int) (userChosenAmount
						* Math.pow(multiply, lostInARowz));
				System.out.println("Last fight: " + lastFight);
				System.out.println("Amount to stake: " + amount_to_stake);
				
				checkedAmount = true;
			}

		} else {
			amount_to_stake = userChosenAmount;
		}

		return amount_to_stake;

	}

	public static void getOpponentName() {
		opponentName = Widgets.get(WIDGET, WIDGET_OPPONENT_NAME).getText();
	}

	// END OF Duel First Screen Widgets

}
