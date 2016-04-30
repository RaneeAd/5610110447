
import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Toolkit;
import java.awt.Image;
public class SpaceShip extends Sprite{
	
	int step = 8;
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public void draw(Graphics2D g) {
		Image img = Toolkit.getDefaultToolkit().getImage("rocket.gif");
        g.drawImage(img, x, y, 50, 50, null);
		
		
	}
	
	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
	}


}




		