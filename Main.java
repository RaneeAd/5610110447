
import java.awt.*;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("TEST");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		frame.getContentPane().setLayout(new BorderLayout());

		
		GamePanel gp = new GamePanel();
		GameEngine ge = new GameEngine(gp);
	

		frame.addKeyListener(ge);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
		ge.start();
		
		
	}
}
