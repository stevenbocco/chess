import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.GameListener;
import de.gurkenlabs.litiengine.gui.screens.Resolution;

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
			public void started() {}

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
