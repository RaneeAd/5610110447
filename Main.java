
import java.awt.*;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame(". : : RaneeGames : : .");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		frame.getContentPane().setLayout(new BorderLayout());

		SpaceShip s = new SpaceShip(180, 500, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine ge = new GameEngine(gp, s);
	

		frame.addKeyListener(ge);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
		ge.start();
		
		
	}
}
