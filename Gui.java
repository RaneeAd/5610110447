import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics2D;
public class Gui {
	public static void main(String[] args){
		Graphics2D big;
		JFrame frame = new JFrame(". : : RaneeGames : : .");
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 700);
		frame.getContentPane().setLayout(new BorderLayout());
		Bg b = new Bg();
		frame.getContentPane().add(b, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}