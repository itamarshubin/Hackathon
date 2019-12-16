import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tryyy {
	
	public static void main(String[] args)
	{
		
		
		JFrame frame = new JFrame("Title");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon im = new ImageIcon(tryyy.class.getResource("/giphy.gif"));
		Image img = im.getImage();  
	    im = new ImageIcon(img.getScaledInstance(-150, 50,  java.awt.Image.SCALE_SMOOTH)); 
		//JSprite k = new JSprite(im);
		//k.setLocation(50, 50);
		//k.setBound(50, 50, 100, 100);
	    
	    
	    JLabel l = new JLabel(im);
	    l.setText("HEY");
	    l.setBounds(100, 100,100,100);
		frame.add(l);
		
		frame.setVisible(true);
		
		
		/*JFrame frame;
		JButton button;
		frame = new JFrame("Hi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(100, 300);
		//frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		JSprite k = new JSprite();
		k.setLayout(new BorderLayout());
		frame.add(k, BorderLayout.CENTER);
		button = new JButton("Click");
		//button.setBorderPainted(false);
		//button.setContentAreaFilled(false);
		
		//button.setIcon(im);//resizeIcon(im, -50,50));
		button.setFocusPainted(false);
		//button.addActionListener(new ActionListener() {@Override public void actionPerformed(ActionEvent e) {try {outToServer.writeUTF("HI");} catch (IOException e1) {}}});
		button.setBounds(100, 100, 150, 50);
		//frame.add(button);

		System.out.println("here");
		//frame.repaint();
		//System.out.println(tryyy.class.getResource());
		
	*/
	}
}
