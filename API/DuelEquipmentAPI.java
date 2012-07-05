package NERVEDuelArena.API;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;



public class DuelEquipmentAPI{
	
	public static final	int WIDGET_HEAD = 21;
	public static final	int WIDGET_CAPE = 22;
	public static final	int WIDGET_NECK = 23;
	public static final	int WIDGET_WEAPON = 24;
	public static final	int WIDGET_BODY = 25;
	public static final	int WIDGET_SHIELD = 26;
	public static final	int WIDGET_LEGS = 27;
	public static final	int WIDGET_GLOVES = 28;
	public static final	int WIDGET_BOOTS = 29;
	public static final	int WIDGET_RING = 30;
	public static final	int WIDGET_ARROWS = 31;
	
	public static final int WIDGET = 631;
	public static final	int WIDGET_SYMBOL = 2; 
	// False means its enables - can be item equiped
	// true means its  disabled
	
	public static boolean checkHead(){
		return Widgets.get(WIDGET,WIDGET_HEAD).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkCape(){
		return Widgets.get(WIDGET,WIDGET_CAPE).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkNeck(){
		return Widgets.get(WIDGET,WIDGET_NECK).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkWeapon(){
		return Widgets.get(WIDGET,WIDGET_WEAPON).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkBody(){
		return Widgets.get(WIDGET,WIDGET_BODY).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkShield(){
		return Widgets.get(WIDGET,WIDGET_SHIELD).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkLegs(){
		return Widgets.get(WIDGET,WIDGET_LEGS).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkGloves(){
		return Widgets.get(WIDGET,WIDGET_GLOVES).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkBoots(){
		return Widgets.get(WIDGET,WIDGET_BOOTS).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkRing(){
		return Widgets.get(WIDGET,WIDGET_RING).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static boolean checkArrows(){
		return Widgets.get(WIDGET,WIDGET_ARROWS).getChild(WIDGET_SYMBOL).visible();
	}
	
	public static void setEquipment(){
		
		if(checkHead() == false){
			Widgets.get(WIDGET,WIDGET_HEAD).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));
		}
		if(checkCape() == false){
			Widgets.get(WIDGET,WIDGET_CAPE).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkNeck() == false){
			Widgets.get(WIDGET,WIDGET_NECK).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkWeapon() == false){
			Widgets.get(WIDGET,WIDGET_WEAPON).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkBody() == false){
			Widgets.get(WIDGET,WIDGET_BODY).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkShield() == false){
			Widgets.get(WIDGET,WIDGET_SHIELD).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkLegs() == false){
			Widgets.get(WIDGET,WIDGET_LEGS).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkGloves() == false){
			Widgets.get(WIDGET,WIDGET_GLOVES).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkBoots() == false){
			Widgets.get(WIDGET,WIDGET_BOOTS).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkRing() == false){
			Widgets.get(WIDGET,WIDGET_RING).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if(checkArrows() == false){
			Widgets.get(WIDGET,WIDGET_ARROWS).getChild(2).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
	}
	
	public static boolean checkEquipment(){
		return checkHead() == true && 
				checkCape() == true && 
				checkNeck() == true && 
				checkWeapon() == true &&
				checkBody() == true &&
				checkShield() == true &&
				checkLegs() == true && 
				checkGloves() == true &&
				checkBoots() == true &&
				checkRing() == true &&
				checkArrows() == true;
	}
	
	
	
}






    
    

