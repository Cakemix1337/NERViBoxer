package NERVEDuelArena;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


import org.powerbot.concurrent.Task;
import org.powerbot.concurrent.strategy.Strategy;
import org.powerbot.game.api.ActiveScript;
import org.powerbot.game.api.methods.Game;

/**
 * Abstract strategy class changed in to supporting statuses.
 * 
 * Asked and was allowed to take it.
 * 
 * Created with IntelliJ IDEA. User: Deprecated Date: 5/28/12 Time: 11:37 AM
 */

public abstract class AbstractStrategy extends Strategy implements Task {
	public static ActiveScript context;


	public static void setContext(final ActiveScript context) {
		AbstractStrategy.context = context;
	}

	protected final void error(final String s) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JOptionPane.showMessageDialog(null, s, "Error!", JOptionPane.ERROR_MESSAGE);
			}
		});

		while (Game.isLoggedIn()) {
			Game.logout(true);
		}
		context.stop();
	}

	protected abstract boolean isValid();

	protected abstract void process();

	
}