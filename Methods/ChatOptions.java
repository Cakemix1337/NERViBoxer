package NERVEDuelArena.Methods;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.node.Menu;

public class ChatOptions {

	public static final int WIDGET_CHAT = 751;
	public static final int WIDGET_GAME = 34;
	public static final int WIDGET_PUBLIC = 31;
	public static final int WIDGET_PRIVATE = 28;
	public static final int WIDGET_FRIENDS = 2;
	public static final int WIDGET_CLAN = 25;
	public static final int WIDGET_TRADE = 22;
	public static final int WIDGET_ASSIST = 19;

	public static void setAllTab() {
		Widgets.get(751, 36).click(true);
	}

	public static void setChatOptions() {
		if(!Widgets.get(WIDGET_CHAT,WIDGET_GAME).getText().contains("All")){
			Widgets.get(WIDGET_CHAT,WIDGET_GAME).click(false);               
			if (Menu.isOpen()) {
                Menu.select("All");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_PUBLIC).getText().contains("Hide")){
			Widgets.get(WIDGET_CHAT,WIDGET_PUBLIC).click(false);               
			if (Menu.isOpen()) {
                Menu.select("Hide");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_PRIVATE).getText().contains("Off")){
			Widgets.get(WIDGET_CHAT,WIDGET_PRIVATE).click(false);               
			if (Menu.isOpen()) {
                Menu.select("Off");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_FRIENDS).getText().contains("Off")){
			Widgets.get(WIDGET_CHAT,WIDGET_FRIENDS).click(false);               
			if (Menu.isOpen()) {
                Menu.select("Off");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_CLAN).getText().contains("Off")){
			Widgets.get(WIDGET_CHAT,WIDGET_CLAN).click(false);               
			if (Menu.isOpen()) {
                Menu.select("Off");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_TRADE).getText().contains("On")){
			Widgets.get(WIDGET_CHAT,WIDGET_TRADE).click(false);               
			if (Menu.isOpen()) {
                Menu.select("On");
            }
		}
		
		if(!Widgets.get(WIDGET_CHAT,WIDGET_ASSIST).getText().contains("Off")){
			Widgets.get(WIDGET_CHAT,WIDGET_ASSIST).click(false);               
			if (Menu.isOpen()) {
                Menu.select("Off");
            }
		}
		
		
		
		
		
	}
	
	public static boolean checkChatOptions(){
		return Widgets.get(WIDGET_CHAT,WIDGET_GAME).getText().contains("All") &&
				Widgets.get(WIDGET_CHAT,WIDGET_PUBLIC).getText().contains("Hide") &&
						Widgets.get(WIDGET_CHAT,WIDGET_PRIVATE).getText().contains("Off") &&
								Widgets.get(WIDGET_CHAT,WIDGET_FRIENDS).getText().contains("Off") &&
										Widgets.get(WIDGET_CHAT,WIDGET_CLAN).getText().contains("Off") &&
												Widgets.get(WIDGET_CHAT,WIDGET_TRADE).getText().contains("On") &&
														Widgets.get(WIDGET_CHAT,WIDGET_ASSIST).getText().contains("Off");
	}
}
