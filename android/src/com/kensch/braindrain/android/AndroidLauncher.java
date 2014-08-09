package com.kensch.braindrain.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.kensch.braindrain.BrainDrain;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		config.useAccelerometer = false;
		config.useCompass = false;
		// config.useGLSurfaceView20API18 = true;

		initialize(new BrainDrain(), config);
	}
}
