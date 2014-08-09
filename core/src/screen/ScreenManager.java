package screen;

public class ScreenManager {
	private static Screen currentScreen;

	public static void setScreen(Screen screen) {
		// We can only dispose if currentScreen has screen contents
		if (currentScreen != null)
			// Disposes the previous currentScreen screen contents
			currentScreen.dispose();
		currentScreen = screen;
		// Creates currentScreen with contents of screen
		currentScreen.create();
	}

	public static Screen getCurrentScreen() {
		return currentScreen;
	}
}