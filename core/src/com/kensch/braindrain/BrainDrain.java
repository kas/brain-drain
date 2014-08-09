package com.kensch.braindrain;

import screen.ScreenManager;
import screen.SplashScreen;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BrainDrain implements ApplicationListener {
	public static String NAME = "Brain Drain";

	public static int WIDTH;
	public static int HEIGHT;

	SpriteBatch batch;

	private ResourceManager resourceManager;

	@Override
	public void create() {
		if (Gdx.app.getType().equals(ApplicationType.Android)) {
			WIDTH = Gdx.graphics.getWidth();
			HEIGHT = Gdx.graphics.getHeight();
		} else if (Gdx.app.getType().equals(ApplicationType.Desktop)) {
			WIDTH = (720 / 2);
			HEIGHT = (1280 / 2);
		}

		batch = new SpriteBatch();

		resourceManager = new ResourceManager();
		resourceManager.load();

		ScreenManager.setScreen(new SplashScreen());
	}

	@Override
	public void render() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().update();

		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().render(batch);
	}

	@Override
	public void resize(int width, int height) {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resize(width, height);
	}

	@Override
	public void pause() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().pause();
	}

	@Override
	public void resume() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().resume();
	}

	@Override
	public void dispose() {
		if (ScreenManager.getCurrentScreen() != null)
			ScreenManager.getCurrentScreen().dispose();
		ResourceManager.generator.dispose();

		batch.dispose();
	}
}
