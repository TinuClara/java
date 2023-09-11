import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class house extends Applet implements MouseListener

{
	Color doorcolor;
	public void init()
	{
		doorcolor=Color.BLUE;
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawLine(100,100,400,100);
		g.drawLine(100,100,250,40);
		g.drawLine(250,40,400,100);
		g.drawRect(100,100,300,200);
		g.setColor(doorcolor);
		g.fillRect(200,250,50,50);
		
	}
	public void mouseClicked(MouseEvent e)
	{
		doorcolor=Color.RED;
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		doorcolor=Color.BLUE;
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		
	}
	public void mouseReleased(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	
}