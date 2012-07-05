package NERVEDuelArena.Methods;

import org.powerbot.game.api.methods.interactive.Players;
import static NERVEDuelArena.Constants.*;

public class AreaChecker {
	public boolean isInDuelArena() {

		if (duelArena1.contains(Players.getLocal().getLocation())
				|| duelArena2.contains(Players.getLocal().getLocation())
				|| duelArena3.contains(Players.getLocal().getLocation())
				|| duelArena4.contains(Players.getLocal().getLocation())
				|| duelArena5.contains(Players.getLocal().getLocation())
				|| duelArena6.contains(Players.getLocal().getLocation())) {

			return true;
		} else {
			return false;
		}
		
	}
}
