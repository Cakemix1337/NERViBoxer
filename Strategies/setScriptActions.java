package NERVEDuelArena.Strategies;


import static NERVEDuelArena.Strategies.getScriptState.*;
import static NERVEDuelArena.Strategies.getToSpot.*;
import static NERVEDuelArena.Strategies.getNewDuel.*;
import static NERVEDuelArena.Strategies.verifyFirstScreen.*;
import static NERVEDuelArena.Strategies.acceptSecond.*;
import static NERVEDuelArena.Strategies.attackOpp.*;
import static NERVEDuelArena.Strategies.acceptRewardstr.*;
import static NERVEDuelArena.Strategies.loadStartup.*;
public class setScriptActions {
	
	
	public static void setScriptAction() {
		switch (getState()) {

		case LOADING:
			System.out.println("LOADING");
			LOADING();
			break;
		case GET_TO_SPOT:

			getToSpots();
			break;
			
		case SEND_MESSAGE:

			getNewDuels();
			break;
			
		case VERIFY_SETTINGS:
			
			verifyFirstScreenSettings();
			break;
			
		case ACCEPT_SECOND:

			acceptSecondScreen();
			break;
			
		case ATTACK:

			attackOpponent();
			break;
			
		case ACCEPT_REWARD:

			acceptReward();
			break;
			
			
			
			
			
			
			
		}
	}
}
