package NERVEDuelArena.Strategies;
import static NERVEDuelArena.API.DuelRewardScreenAPI.*;

public class acceptRewardstr {
	public static void acceptReward(){
		
		if(rewardScreenActive()){
			getReward();
			
		}
		
	}
}
