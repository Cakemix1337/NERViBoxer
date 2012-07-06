package NERVEDuelArena;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;

import org.powerbot.concurrent.Task;
import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.Manifest;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.methods.tab.Skills;
import org.powerbot.game.bot.event.listener.PaintListener;

import static NERVEDuelArena.Strategies.setScriptActions.*;
import static NERVEDuelArena.API.DuelFirstScreenAPI.*;
import static NERVEDuelArena.Constants.*;
import static NERVEDuelArena.Strategies.getNewDuel.*;
import static NERVEDuelArena.Strategies.antiban.*;
@Manifest(authors = "NERVi", name = "NERViBoxer", version = 1.0, description = "Staking - MELEE BOXING")
public class Main extends ActiveScript implements PaintListener {
	
	// if verify screen open for too long - close
	// -------------------FUTURE CRAP---------------------//
	// add user blacklist - if getNickname is in that list then decline
	// BANK PIN - ...
	// cmbMin, cmbMax - for thoose who have low stats
	
	long startTime;

	@Override
	protected void setup() {
			DuelArenaGUI g = new DuelArenaGUI();
		 g.setVisible(true);

		startTime = System.currentTimeMillis();
		provide(new alwaysActive());
	}

	public class alwaysActive extends Strategy implements Task {
		@Override
		public void run() {
			setScriptAction();
		}

		public boolean validate() {
			return true;
		}
	}

	// START: Code generated using Enfilade's Easel
	private Image getImage(String url) {
		try {
			return ImageIO.read(new URL(url));
		} catch (IOException e) {
			return null;
		}
	}

	private final Color color1 = new Color(0, 0, 0);

	private final Font font1 = new Font("Calibri", 1, 12);
	private final Font font2 = new Font("Calibri", 0, 12);

	private final Image img1 = getImage("http://i49.tinypic.com/k7yus.png");

	public void onRepaint(Graphics g1) {

		long runTime = System.currentTimeMillis() - startTime;
		long minutes = 0;
		long hours = 0;
		long seconds = 0;
		seconds = runTime / 1000;

		if (seconds >= 60) {
			minutes = seconds / 60;
			seconds -= (minutes * 60);
		}

		if (minutes >= 60) {
			hours = minutes / 60;
			minutes -= (hours * 60);
		}
	   

		Graphics2D g = (Graphics2D) g1;
		g.drawImage(img1, 10, 346, null);
		g.setFont(font1);
		g.setColor(color1);
		g.drawString("MADE BY NERVi", 403, 364);
		g.setFont(font2);
		g.drawString("STATUS: " + Status, 230, 364);
		g.drawString("TIME RUNNING: " + hours + ":" + minutes + ":" + seconds,
				19, 364);
		
		g.drawString("MULTIPLIER: " + (multiply * 100) + "%", 26, 386);
		g.drawString("BASE STAKE: " + getQuantity(userChosenAmount), 26, 408);
		g.drawString("CURRENT STAKE: " + getQuantity(amount_to_add()), 26, 431);
	
		g.drawString("PROFIT: "
				+ getQuantity(amount_we_have_won - amount_we_have_lost), 188,
				386);	
		g.drawString("PROFIT/HR: " + getQuantity( (int) ((amount_we_have_won - amount_we_have_lost) * 3600000D / (System
				.currentTimeMillis() - startTime))), 188, 408);
		g.drawString("Start Money: " + getQuantity(startMoney), 188, 431);
		
		
		g.drawString("TIMES WON: " + times_won, 332, 386);
		g.drawString("TIMES LOST: " + times_lost, 332, 408);
		g.drawString("K/D: " +  kd(), 334, 431);
        g.drawString("WINS IN A ROW: " + wonInARowRECORD, 200, 455);
        g.drawString("LOOSES IN A ROW: " + lostInARowRECORD, 330, 455);

	}

	// END: Code generated using Enfilade's Easel

	public static double kd() {
		double kd = 0.00;

		if (times_won != 0 && times_lost != 0) {
			kd = times_won / times_lost;
		}
		return kd;
	}

}
