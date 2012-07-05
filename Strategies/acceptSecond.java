package NERVEDuelArena.Strategies;
import static NERVEDuelArena.API.DuelSecondScreenAPI.*;

public class acceptSecond {
	public static void acceptSecondScreen(){
		if(secondScreenActive()){
			secondScreenAccept();
		}
	}
}
