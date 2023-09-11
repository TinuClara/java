import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class choice extends Applet implements ItemListener
{
	Choice c;
	int n;
	public void init()
	{
		c=new Choice();
		c.add("select");
		c.add("circle");
		c.add("rectangle");
		c.add("square");
		c.add("triangle");
		c.addItemListener(this);
		add(c);
	}
	public void paint(Graphics g)
	{
		if(n==0)
		{}
	if(n==1)
		{g.drawOval(100,100,200,100);}
	if(n==2)
		{
			g.drawRect(100,100,200,100);
		}
		if(n==3)
		{
			g.drawRect(100,100,200,200);
		}
		if(n==4)
		{
			g.drawLine(100,100,400,100);
			g.drawLine(100,100,250,40);
			g.drawLine(250,40,400,100);
			g.drawRect(100,100,300,200);
			g.drawRect(250,200,50,100);
			
		}
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		n=c.getSelectedIndex();
		repaint();
	}
	
}