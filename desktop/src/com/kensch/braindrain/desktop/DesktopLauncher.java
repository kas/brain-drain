package com.kensch.braindrain.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kensch.braindrain.BrainDrain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = BrainDrain.NAME;
		config.useGL30 = true;
		config.width = (720 / 2);
		config.height = (1280 / 2);
		config.resizable = false;
		
		new LwjglApplication(new BrainDrain(), config);
	}
}
