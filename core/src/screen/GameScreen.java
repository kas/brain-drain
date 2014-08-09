package screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kensch.braindrain.BrainDrain;

import entity.EntityManager;

public class GameScreen extends Screen {
	private OrthographicCamera camera;
	
	private EntityManager entityManager;
	
	@Override
	public void create() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, BrainDrain.WIDTH, BrainDrain.HEIGHT);
	}

	@Override
	public void update() {
//		entityManager.update();
		camera.update();
	}

	@Override
	public void render(SpriteBatch sb) {
		sb.setProjectionMatrix(camera.combined);

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL30.GL_COLOR_BUFFER_BIT);
		
		sb.begin();
//		entityManager.render(sb);
		sb.end();
	}

	@Override
	public void resize(int width, int height) {
	
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}
}