package com.kensch.braindrain;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public class ResourceManager {
	// Font
	static FreeTypeFontGenerator generator;
	FreeTypeFontParameter parameter;
	
	public static BitmapFont font56;
	// END Font

	void load() {
		// Font
		generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/Oswald-Regular.ttf"));
		parameter = new FreeTypeFontParameter();

		parameter.size = 56;
		font56 = generator.generateFont(parameter);
		// END Font
	}
}
