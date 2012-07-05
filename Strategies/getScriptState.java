package NERVEDuelArena.Strategies;

import static NERVEDuelArena.Constants.*;
import static NERVEDuelArena.API.DuelFirstScreenAPI.*;
import static NERVEDuelArena.API.DuelSecondScreenAPI.*;
import static NERVEDuelArena.API.DuelRewardScreenAPI.*;
import static NERVEDuelArena.Methods.ChatOptions.*;

public class getScriptState {
	public enum ScriptState {

		LOADING, GET_TO_SPOT, SEND_MESSAGE, VERIFY_SETTINGS, ACCEPT_SECOND, ATTACK, ACCEPT_REWARD;

	}

	public static ScriptState getState() {

		if (!checkChatOptions() || startMoney == 0) {
			Status = "Loading";
			
			return ScriptState.LOADING;
		} else if (!isInDuelArenaSpot() && !isInOneOfAreas()
				&& !rewardScreenActive() && checkChatOptions() &&
				!rewardScreenActive()) {
			Status = "Walking to Spot";
			return ScriptState.GET_TO_SPOT;
			
		} else if (isInDuelArenaSpot() && !firstScreenActive()
				&& !secondScreenActive() && checkChatOptions()) {
			Status = "Spamming";
			return ScriptState.SEND_MESSAGE;
			
		} else if (firstScreenActive()) {
			Status = "Verifying";
			return ScriptState.VERIFY_SETTINGS;
			
		} else if (secondScreenActive()) {
			Status = "Accepting second";
			return ScriptState.ACCEPT_SECOND;
			
		} else if (isInOneOfAreas()) {
			Status = "Fighting";
			return ScriptState.ATTACK;
			
		} else if (rewardScreenActive()) {
			Status = "Claiming reward";
			return ScriptState.ACCEPT_REWARD;
		}
		return null;

	}

}
