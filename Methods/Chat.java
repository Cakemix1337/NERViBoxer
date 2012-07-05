package NERVEDuelArena.Methods;


import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class Chat {

	public static final int WIDGET_CHATBOX = 137;
	public static final int WIDGET_CHATBOX_NICKNAME = 53;
	public static final int WIDGET_CHATBOX_MESSAGEBOX = 57;
	public static final int WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1 = 0;
	public static final int WIDGET_CHATBOX_MESSAGEBOX_MESSAGE2 = 1;
	public static final int MONEY_POUCH = 159; // 548,159 // 196

	public static String getNickname() {
		return Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_NICKNAME).getText().split("<")[0];
	}

	public static boolean gotMessage() {
		return Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText()
				.contains("wishes to duel with you (stake)");
	}

	public static void clickStakeMessage(){
		Mouse.click(42,450,true);
		//Widgets.get(WIDGET_CHATBOX,WIDGET_CHATBOX_MESSAGEBOX).getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).click(true);
		Time.sleep(Random.nextInt(1000, 2000));
	}
	public static void checkPouchAmount(){
		if(!Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText().contains("Your money pouch currently contains")){
			Widgets.get(548,MONEY_POUCH).click(false);
			Time.sleep(Random.nextInt(200, 500));
			if(Menu.isOpen()){
				Menu.select("Examine money pouch");
				Time.sleep(Random.nextInt(1000, 1500));
			}
		}
	}
	public static int pouchAmount(){
		if(!Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText().contains("Your money pouch currently contains")){
			Widgets.get(548,MONEY_POUCH).click(false);
			if(Menu.isOpen()){
				Menu.select("Examine money pouch");
				Time.sleep(Random.nextInt(500, 1000));
			}
		}
		 return Integer.parseInt(pouchAmountString().replaceAll(",", ""));
	}
	
	public static String pouchAmountString(){
		return Widgets.get(WIDGET_CHATBOX, WIDGET_CHATBOX_MESSAGEBOX)
				.getChild(WIDGET_CHATBOX_MESSAGEBOX_MESSAGE1).getText().
				split("contains ")[1].split(" coins")[0];
		
	}
	

}
