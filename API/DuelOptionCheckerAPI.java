package NERVEDuelArena.API;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.util.Time;

public class DuelOptionCheckerAPI {

	public static final int WIDGET_NO_RANGE = 56;
	public static final int WIDGET_NO_MELEE = 57;
	public static final int WIDGET_NO_MAGIC = 58;
	public static final int WIDGET_FUN_WEAPONS = 59;
	public static final int WIDGET_NO_FORFEIT = 60;
	public static final int WIDGET_NO_DRINKS = 61;
	public static final int WIDGET_NO_FOOD = 62;
	public static final int WIDGET_NO_PRAYER = 63;
	public static final int WIDGET_NO_MOVEMENT = 64;
	public static final int WIDGET_OBSTACLES = 65;
	public static final int WIDGET_ENABLED_SUMMONING = 66;
	public static final int WIDGET_NO_SPECIAL_ATTACK = 67;

	public static final int WIDGET_SYMBOL = 1;
	public static final int WIDGET = 631;

	// 1135 - red mark
	// 1134 - no red mark

	public static int getSpecialAttack() {
		return Widgets.get(WIDGET, WIDGET_NO_SPECIAL_ATTACK)
				.getChild(WIDGET_SYMBOL).getTextureId();
	}

	public static int getSummoning() {
		return Widgets.get(WIDGET, WIDGET_ENABLED_SUMMONING)
				.getChild(WIDGET_SYMBOL).getTextureId();
	}

	public static int getRange() {
		return Widgets.get(WIDGET, WIDGET_NO_RANGE).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getMelee() {
		return Widgets.get(WIDGET, WIDGET_NO_MELEE).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getMagic() {
		return Widgets.get(WIDGET, WIDGET_NO_MAGIC).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getFunWeapons() {
		return Widgets.get(WIDGET, WIDGET_FUN_WEAPONS).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getForfeit() {
		return Widgets.get(WIDGET, WIDGET_NO_FORFEIT).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getDrinks() {
		return Widgets.get(WIDGET, WIDGET_NO_DRINKS).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getFood() {
		return Widgets.get(WIDGET, WIDGET_NO_FOOD).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getPrayer() {
		return Widgets.get(WIDGET, WIDGET_NO_PRAYER).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getMovement() {
		return Widgets.get(WIDGET, WIDGET_NO_MOVEMENT).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static int getObstacles() {
		return Widgets.get(WIDGET, WIDGET_OBSTACLES).getChild(WIDGET_SYMBOL)
				.getTextureId();
	}

	public static void setOptions() {
		if (getRange() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_RANGE).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getMelee() != 1134) {
			Widgets.get(WIDGET, WIDGET_NO_MELEE).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getMagic() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_MAGIC).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getFunWeapons() != 1134) {
			Widgets.get(WIDGET, WIDGET_FUN_WEAPONS).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getForfeit() != 1134) {
			Widgets.get(WIDGET, WIDGET_NO_FORFEIT).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getDrinks() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_DRINKS).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getFood() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_FOOD).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getPrayer() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_PRAYER).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getMovement() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_MOVEMENT).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getObstacles() != 1134) {
			Widgets.get(WIDGET, WIDGET_OBSTACLES).getChild(WIDGET_SYMBOL)
					.click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getSummoning() != 1134) {
			Widgets.get(WIDGET, WIDGET_ENABLED_SUMMONING)
					.getChild(WIDGET_SYMBOL).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
		if (getSpecialAttack() != 1135) {
			Widgets.get(WIDGET, WIDGET_NO_SPECIAL_ATTACK)
					.getChild(WIDGET_SYMBOL).click(true);
			Time.sleep(Random.nextInt(100,200));

		}
	}

	public static boolean checkOptions() {
		return getRange() == 1135 && getMelee() == 1134 && getMagic() == 1135
				&& getFunWeapons() == 1134 && getForfeit() == 1134
				&& getDrinks() == 1135 && getFood() == 1135
				&& getPrayer() == 1135 && getMovement() == 1135
				&& getObstacles() == 1134 
				
				&& getSummoning() == 1134
				&& getSpecialAttack() == 1135;
	}

}
