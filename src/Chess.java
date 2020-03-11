import java.awt.Color;
import java.awt.Graphics2D;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.GameListener;
import de.gurkenlabs.litiengine.graphics.TextRenderer;
import de.gurkenlabs.litiengine.gui.screens.GameScreen;
import de.gurkenlabs.litiengine.gui.screens.Resolution;
import de.gurkenlabs.litiengine.resources.Resources;

public class Chess {
	
	public Chess() {
		
	}
	
	public void initilize() {
		Game.addGameListener(new GameListener() {
			
			@Override
			public void initialized(String... args) {
				int width = Integer.parseInt(args[0]);
				int height = Integer.parseInt(args[1]);
				
				setWindowSize(width, height);
				setWindowTitle("Chess - Master Edition I");
			}
			
			@Override
			public void started() {
				Game.screens().add(new GameS());
				Game.screens().display("GAMES");
				
			}

			@Override
			public void terminated() {}	
			
			
		});
		
		Game.init("1280", "720");
	}
	
	public void run() {
		Game.start();
	}
	
	private void setWindowSize(int width, int height) {
		Game.window().setResolution(Resolution.custom(width, height, "WindowSize"));
	}
	
	private void setWindowTitle(String title) {
		Game.window().setTitle(title);
	}
}
 
class GameS extends GameScreen {
	public GameS() {
		super("GAMES");
	}
	
	@Override
	public void render(final Graphics2D g) {
	    super.render(g);
	    
	    g.setColor(Color.RED);
	    TextRenderer.render(g, "Test text", 100, 100);	
	}
}

