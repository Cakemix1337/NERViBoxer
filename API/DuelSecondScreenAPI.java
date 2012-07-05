package NERVEDuelArena.API;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class DuelSecondScreenAPI {
	public static final 	int WIDGET_SECOND_SCREEN = 626;
	public static final 	int WIDGET_SECOND_SCREEN_ACCEPT = 42;
	
	public static void secondScreenAccept(){
		Widgets.get(WIDGET_SECOND_SCREEN,WIDGET_SECOND_SCREEN_ACCEPT).click(true);

	}
	
	public static boolean secondScreenActive(){
		return Widgets.get(WIDGET_SECOND_SCREEN,1).isOnScreen();
	}
	
	
	
}
