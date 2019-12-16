
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Panel;
import java.awt.RenderingHints;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;

public class JSprite extends JComponent {

	private ImageIcon imageIcon;
	Image img;
	int x=0,y=0;
	
	public JSprite() {
		this(null,0,0);
	}
	
	public JSprite(ImageIcon imageIcon)
	{
		this(imageIcon, 0, 0);
	}
	
	public JSprite(ImageIcon imageIcon,int x,int y) {
		super();
		this.imageIcon = imageIcon;
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void setLocation(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setBound(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		
	}


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		imageIcon.paintIcon(this,g,x,y);
	}

}
