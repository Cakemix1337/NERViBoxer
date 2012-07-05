package NERVEDuelArena;


import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;

public class Constants {

	//PAINT
	public static String Status = "";
	
	public static int amount_we_have_won;
	public static int amount_we_have_lost;

	public static int times_won = 0;
	public static int times_lost = 0;
	
	public static int lostInARowRECORD = 0;
	public static int wonInARowRECORD = 0;
	
	
	//GUI
	public static int chosenSpamMessage = 1;
	public static int userChosenAmount = 500000;
	public static int multiply = 2;
	public static int spamSpeedX = 1000;
	public static int spamSpeedY = 3000;

	
	
	public static int startMoney = 0;
	public static int amount_to_stake;
	public static String lastFight;
	public static int lostInARowz;
	public static int winInARowz;

	public static boolean checkedAmount = false;
	public static boolean checkedLost = false;
	public static boolean checkedWin = false;
	public static boolean triedPrevious = false;



	// AREAS

	public static Area DuelArena =  new Area(new Tile[] { new Tile(3362, 3269, 0), new Tile(3370, 3269, 0), new Tile(3370, 3264, 0), 
			new Tile(3362, 3264, 0) });

	public static Area duelArena1 = new Area(new Tile[] {
			new Tile(3358, 3259, 0), new Tile(3358, 3243, 0),
			new Tile(3330, 3243, 0), new Tile(3330, 3259, 0) });

	public static Area duelArena2 = new Area(new Tile[] {
			new Tile(3389, 3259, 0), new Tile(3389, 3243, 0),
			new Tile(3361, 3243, 0), new Tile(3361, 3259, 0) });

	public static Area duelArena3 = new Area(new Tile[] {
			new Tile(3358, 3240, 0), new Tile(3358, 3224, 0),
			new Tile(3330, 3224, 0), new Tile(3330, 3240, 0) });

	public static Area duelArena4 = new Area(new Tile[] {
			new Tile(3389, 3240, 0), new Tile(3389, 3224, 0),
			new Tile(3361, 3224, 0), new Tile(3361, 3240, 0) });

	public static Area duelArena5 = new Area(new Tile[] {
			new Tile(3358, 3221, 0), new Tile(3358, 3205, 0),
			new Tile(3330, 3205, 0), new Tile(3330, 3221, 0) });

	public static Area duelArena6 = new Area(new Tile[] {
			new Tile(3389, 3221, 0), new Tile(3389, 3205, 0),
			new Tile(3361, 3205, 0), new Tile(3361, 3221, 0) });

	// TILES

	public static Tile duelArenaTile1 = new Tile(3368, 3268, 0);
	public static Tile duelArenaTile2 = new Tile(3366, 3267, 0);
	public static Tile duelArenaTile3 = new Tile(3367, 3265, 0);

	public static boolean isInDuelArenaSpot() {
		return isInArea(DuelArena);
	}

	public static boolean isInOneOfAreas() {
		return isInArea(duelArena1) || isInArea(duelArena2)
				|| isInArea(duelArena3) || isInArea(duelArena4)
				|| isInArea(duelArena5) || isInArea(duelArena6);
	}

	public static boolean isInArea(Area a) {
		return a.contains(Players.getLocal().getLocation());
	}

	public static boolean isInSpot(Tile a) {
		return (Calculations.distance(Players.getLocal().getLocation(), a) <= 1);
	}

}
