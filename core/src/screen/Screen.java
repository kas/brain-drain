package screen;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// Abstract so different classes can extend this
// Classes can implements these abstract methods if they extend this class
public abstract class Screen {
	public abstract void create();

	public abstract void update();

	// So we don't have to create multiple SpriteBatches
	public abstract void render(SpriteBatch sb);

	public abstract void resize(int width, int height);

	public abstract void dispose();

	public abstract void pause();

	public abstract void resume();
}