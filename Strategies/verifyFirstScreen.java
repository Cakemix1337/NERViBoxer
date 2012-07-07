package NERVEDuelArena.Strategies;
import static NERVEDuelArena.Strategies.setScriptActions.*;
import static NERVEDuelArena.API.DuelFirstScreenAPI.addMoney;
import static NERVEDuelArena.API.DuelFirstScreenAPI.amount_to_add;
import static NERVEDuelArena.API.DuelFirstScreenAPI.getMyStake;
import static NERVEDuelArena.API.DuelFirstScreenAPI.getMyStakeChildId;
import static NERVEDuelArena.API.DuelFirstScreenAPI.getOpponentName;
import static NERVEDuelArena.API.DuelFirstScreenAPI.interactMyStake;
import static NERVEDuelArena.API.DuelFirstScreenAPI.opponentName;
import static NERVEDuelArena.API.DuelFirstScreenAPI.*;
import static NERVEDuelArena.API.DuelEquipmentAPI.*;
import static NERVEDuelArena.API.DuelOptionCheckerAPI.*;

import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.util.Time;

import static NERVEDuelArena.Constants.*;
public class verifyFirstScreen {
	public static void verifyFirstScreenSettings(){
		
		
	
		if (opponentName == null && !isInOneOfAreas() ) {
			getOpponentName();
			System.out.println(opponentName);

		}
		
		if(!triedPrevious){
			System.out.println("Trying previous");

			setPreviousOptions();
			triedPrevious = true;
		}
		// quickchat Closer
		if(Widgets.get(137,4).isOnScreen() && !isInOneOfAreas())
			Widgets.get(137,4).click(true);
		
		//--//--//--//--//--//--//--//--//--//
		
		
		if(getMyStake() == amount_to_add() && 
				getOpponentStake() >= amount_to_add() &&
						Widgets.get(631,49).getChild(0).getChildId() == 995 &&
				checkEquipment() &&
				checkOptions()){
	
			acceptDuel();
			
		}else{	
			if(getOpponentStakeChildId() == 995 && getOpponentStake() < amount_to_add()){
					System.out.println("Decline");
					declineDuel();
			}else if(getOpponentStakeChildId() >= 1 && getOpponentStakeChildId() != 995){
					System.out.println("Decline");
					declineDuel();
			}else if(getMelee() != 1134){
				System.out.println("Decline");
				declineDuel();
			}
			

			if(checkOptions() && checkEquipment() && getMyStake() != amount_to_add()){
				if(getMyStakeChildId() == 995 && getMyStake() != amount_to_add()){
					interactMyStake();
					if(Menu.isOpen()){
						Menu.select("Remove All");
					}
				}else{
					addMoney();
				}
			}
				
			}
			
			if(!checkEquipment())
				setEquipment();
			
			if(!checkOptions())
				setOptions();
			
			
				
			if(getMyStake() == amount_to_add() &&
					checkEquipment() &&
					checkOptions() &&
					Widgets.get(631,49).getChild(0).getChildId() != 995){
				Time.sleep(500);
			}
			
		
		
		
		
		
	}
}
