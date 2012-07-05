package NERVEDuelArena.API;


import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class DuelRewardScreenAPI {
	public static final 	int WIDGET_REWARD_SCREEN = 634;
	public static final 	int WIDGET_REWARD_BUTTON = 17;
	
	public static void getReward(){
		
		Widgets.get(WIDGET_REWARD_SCREEN,WIDGET_REWARD_BUTTON).click(true);
		Time.sleep(Random.nextInt(1000, 2000));
	}
	public static boolean rewardScreenActive(){
		
		
		return Widgets.get(WIDGET_REWARD_SCREEN,1).isOnScreen();
	}
	
}
