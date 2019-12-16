
import java.awt.*;
import javax.swing.*;

public class tr extends JComponent {
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawString("hello",Font.BOLD,20);
	}

	public static void main(String[] args) {
		tr smiley = new tr();
		JFrame app = new JFrame("Smiley App");
		app.add(smiley, BorderLayout.CENTER);
		app.setSize(300, 300);
		app.setLocationRelativeTo(null);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
}
