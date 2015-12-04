package org.bsiet.combinations;
/**
 * @(#)LabelledIcon.java
 *
 *
 * @author nikk
 * @version 1.00 2012/2/21
 */

import javax.swing.*;
import java.awt.*;
public class LabelledIcon extends JPanel
{
	public JLabel label,label2;
	public Icon i;
	JPanel p1;
	GroupLayout gpl;
	public boolean isVertical;
   
    public LabelledIcon() //Constructor 1
    {
    	Icon imageIcon=new ImageIcon();
    	label=new JLabel(imageIcon);
    	add(label);    	
    }
    public LabelledIcon(String labelName)//Constructor 2 //
    {
    	construct(labelName);
    }
    public LabelledIcon(String labelName,Icon imageIcon)//Constructor 3//
    {
    	construct(labelName,imageIcon);
    }
    public LabelledIcon(Icon labelIcon)//Constructor 4//
    {
    	construct("",labelIcon);
    }
	public LabelledIcon(Icon labelIcon,Icon imageIcon)//Constructor 5//
	{
		construct(labelIcon,imageIcon);
	}
	
	//isVertical constructor starts
    
    public LabelledIcon(String labelName,Icon imageIcon,boolean isVertical)//Constructor 6//
    {
    	construct(labelName,imageIcon,isVertical);//
    }
	public LabelledIcon(Icon labelIcon,Icon imageIcon,boolean isVertical)//Constructor 7//
	{
		construct(labelIcon,imageIcon,isVertical);
	}

	//construct method definations
	
	public void construct(String labelName)
	{
		label=new JLabel(labelName,JLabel.CENTER);
		
		p1=new JPanel();
		gpl=new GroupLayout(p1);
		gpl.setHorizontalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(label)).addGap(5));
			
		gpl.setVerticalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(label)).addGap(5));
	
	}			
		public void construct(String labelName,Icon imageIcon)
	{	
		label=new JLabel(imageIcon);
		label2=new JLabel(labelName);
		p1=new JPanel();
		gpl=new GroupLayout(p1);
		
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

				.addGroup(gpl.createParallelGroup()
					.addComponent(label2)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(label)).addGap(5));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
				
				.addGroup(gpl.createParallelGroup()
					.addComponent(label2)
					.addComponent(label)).addGap(5));


			
	}
	
	public void  construct(Icon labelIcon,Icon imageIcon)
	{
		label=new JLabel(labelIcon);
		label2=new JLabel(imageIcon);
		
		p1=new JPanel();
		gpl=new GroupLayout(p1);
		
			gpl.setHorizontalGroup(gpl.createSequentialGroup()

			.addGroup(gpl.createParallelGroup()
				.addComponent(label)).addGap(5)
				.addGroup(gpl.createParallelGroup()
				.addComponent(label2)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
				.addComponent(label)
				.addComponent(label2)).addGap(5));
		
	}
	//construct methods with isVertical
	public void construct(String labelName,Icon imageIcon,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		label2=new JLabel(labelName);
		p1=new JPanel();
		gpl=new GroupLayout(p1);
		if(isVertical==true)
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

			.addGroup(gpl.createParallelGroup()
				.addComponent(label2)
				.addComponent(label)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(label2)).addGap(5)
			.addGroup(gpl.createParallelGroup()
				.addComponent(label)).addGap(5));
			}
			else
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

				.addGroup(gpl.createParallelGroup()
					.addComponent(label2)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(label)).addGap(5));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(label2)
					.addComponent(label)).addGap(5));


			}
	}	
	public void construct(Icon labelIcon,Icon imageIcon,boolean isVertical)
	{
		label=new JLabel(labelIcon);
		label2=new JLabel(imageIcon);
		
		p1=new JPanel();
		gpl=new GroupLayout(p1);
		if(isVertical==true)
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

			.addGroup(gpl.createParallelGroup()
				.addComponent(label)
				.addComponent(label2)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(label)).addGap(5)
			.addGroup(gpl.createParallelGroup()
				.addComponent(label2)).addGap(5));
			}
			else
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

				.addGroup(gpl.createParallelGroup()
					.addComponent(label)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(label2)).addGap(5));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(label)
					.addComponent(label2)).addGap(5));
	}
}
	
	public String getLabel()
	{
		String labelName=label.getText();
		return labelName;
	}
	public void setLabel(String labelName)
	{
		label.setText(labelName);
	}
	public Icon getIcon()
	{
		Icon imageIcon=label.getIcon();
		return imageIcon;
	}
	public void setIcon(Icon imageIcon)
	{
		label.setIcon(imageIcon);
	}
	/*public void paintLabel(JComponent c,Graphics g,int x,int y)
	{
		paintIcon(c,g,x,y);
	}*/
	
}