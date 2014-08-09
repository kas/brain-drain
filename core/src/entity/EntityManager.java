package entity;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kensch.braindrain.BrainDrain;
import com.kensch.braindrain.ResourceManager;

public class EntityManager {
	Random rand = new Random();

	int repCount = 0;
	int color, colorName;
	Color colorCode;
	String colorNameCode;

	public EntityManager() {
		generate();
	}

	public void update() {
		if (Gdx.input.isTouched() || repCount == 0) {
			repCount++;
			
			System.out.println("Rep: " + repCount);
			
			if (gameOver())
				System.out.println("GAME OVER");
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			generate();
		}
	}

	public void render(SpriteBatch sb) {
		ResourceManager.font56.setColor(colorCode);
		ResourceManager.font56.draw(sb, colorNameCode, ((BrainDrain.WIDTH / 2) - (ResourceManager.font56.getBounds(colorNameCode).width / 2)), (float) (0.75 * BrainDrain.HEIGHT));
	}

	private void generate() {
		color = rand.nextInt(7) + 1;
		colorName = rand.nextInt(7) + 1;

		if (color == colorName)
			System.out.println("color == colorName");
		else {
			switch (color) {
			case 1:
				colorCode = Color.GREEN;
				break;
			case 2:
				colorCode = Color.RED;
				break;
			case 3:
				colorCode = Color.BLUE;
				break;
			case 4:
				colorCode = Color.YELLOW;
				break;
			case 5:
				colorCode = Color.BLACK;
				break;
			case 6:
				colorCode = Color.MAROON;
				break;
			case 7:
				colorCode = Color.PURPLE;
				break;
			}

			switch (colorName) {
			case 1:
				colorNameCode = "Green";
				break;
			case 2:
				colorNameCode = "Red";
				break;
			case 3:
				colorNameCode = "Blue";
				break;
			case 4:
				colorNameCode = "Yellow";
				break;
			case 5:
				colorNameCode = "Black";
				break;
			case 6:
				colorNameCode = "Maroon/Brown";
				break;
			case 7:
				colorNameCode = "Purple";
				break;
			}
		}
	}

	public boolean gameOver() {
		return repCount >= 25;
	}
}