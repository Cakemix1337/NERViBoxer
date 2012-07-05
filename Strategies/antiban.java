package NERVEDuelArena.Strategies;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.tab.Skills;
import org.powerbot.game.api.methods.widget.Camera;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Timer;

public class antiban {
	public static boolean firstMessageSent = false;
	public static boolean secondMessageSent = false;


	
	
	
	public static void fightAntiBan() {

		if (Players.getLocal().getHpPercent() > 80) {

			if (!firstMessageSent) {

				int randomNumber = Random.nextInt(0, 7);

				if (randomNumber == 0) {

					Keyboard.sendText("gl", true);

					firstMessageSent = true;

				} else if (randomNumber == 1) {

					Keyboard.sendText("hello", true);

					firstMessageSent = true;

				} else if (randomNumber == 2) {

					Keyboard.sendText("hi", true);

					firstMessageSent = true;

				} else if (randomNumber == 3) {

					firstMessageSent = true;

				} else if (randomNumber == 4) {
					Keyboard.sendText("Sup", true);

					firstMessageSent = true;

				} else if (randomNumber == 5) {

					firstMessageSent = true;

				} else if (randomNumber == 6) {
					Keyboard.sendText("Wasup", true);

					firstMessageSent = true;

				} else if (randomNumber == 7) {

					firstMessageSent = true;

				}

			}

		}

		if (Integer.parseInt(Widgets.get(748, 8).getText()) * 100
		/ (Skills.getLevel(Skills.CONSTITUTION) * 10) < 30) {

			if (!secondMessageSent) {

				int randomNumber = Random.nextInt(0, 7);

				if (randomNumber == 0) {

					Keyboard.sendText("gf", true);

					secondMessageSent = true;

				} else if (randomNumber == 1) {

					Keyboard.sendText("Cya", true);

					secondMessageSent = true;

				} else if (randomNumber == 2) {

					Keyboard.sendText("gg", true);

					secondMessageSent = true;

				} else if (randomNumber == 3) {

					Keyboard.sendText("O_O", true);
					secondMessageSent = true;

				} else if (randomNumber == 4) {

					Keyboard.sendText("gf", true);

					secondMessageSent = true;

				} else if(randomNumber == 5) {
					Keyboard.sendText(":(", true);
					secondMessageSent = true;

				} else if(randomNumber == 6) {
					Keyboard.sendText("Well thats just my luck", true);
					secondMessageSent = true;

				} else if(randomNumber == 7) {
					secondMessageSent = true;

				}

			}

		}

	}

}
