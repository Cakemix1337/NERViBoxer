package NERVEDuelArena.Strategies;

import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.interactive.Player;
import static NERVEDuelArena.API.DuelFirstScreenAPI.*;
import static NERVEDuelArena.Constants.*;
import static NERVEDuelArena.Strategies.antiban.*;

public class attackOpp {
	public static void attackOpponent() {

		if (opponentName == null && !isInOneOfAreas()) {
			getOpponentName();

		} else {
			checkedLost = false;
			checkedAmount = false;
			checkedWin = false;
			if (!Players.getLocal().isInCombat() && isInOneOfAreas()) {

				Player[] players = Players.getLoaded();

				if (Players.getLocal().getAnimation() != -1) {
					fightAntiBan();
					Time.sleep(Random.nextInt(2000, 3500));
					
				}
				for (int i = 0; i < players.length; i++) {

					if (players[i].getName().equals(opponentName)) {
					
						players[i].interact("Fight");
						
						
					}
				}

			}

		}
		
		
		
		

	}

}
