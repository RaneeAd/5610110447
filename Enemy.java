import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;


public class Enemy extends Sprite{
	public static final int Y_TO_FADE = 400;
	public static final int Y_TO_DIE = 600;
	
	private int step = 15;
	private boolean alive = true;
	private boolean clashable = true;

	
	public Enemy(int position_x, int position_y, int size_x, int size_y) {
		super(position_x, position_y, size_x, size_y);
		
	}

	@Override
	public void draw(Graphics2D g) {
		if(y < Y_TO_FADE)
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
		else{
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 
					(float)(Y_TO_DIE - y)/(Y_TO_DIE - Y_TO_FADE)));
		}
		Image img = Toolkit.getDefaultToolkit().getImage("fireball.png");
		
		if(width == 2)
			g.drawImage(img, x, y, 40, 30, null);
		else
			g.drawImage(img, x, y, 20, 30, null);
		
	}

	public void proceed(){
		y += step;
		if(y > Y_TO_DIE){
			alive = false;
		}
	}
	
	public boolean isAlive(){
		return alive;
	}

	public boolean getClashable(){
		return clashable;
	}

	public void setClashable(boolean set){
		clashable = set;
	}
}