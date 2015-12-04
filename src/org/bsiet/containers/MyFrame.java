package org.bsiet.containers;
import java.awt.FlowLayout;
import javax.swing.*;
public class MyFrame extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int EXIT = EXIT_ON_CLOSE;
	public static final int HIDE = HIDE_ON_CLOSE;
	public static final int NOTHING = DO_NOTHING_ON_CLOSE;
	public static final int DISPOSE = DISPOSE_ON_CLOSE;
	
	public MyFrame()
	{
		init(720,576,true,EXIT);
	}
	
	public MyFrame(String frameName)
	{
		super(frameName);
		init(720,576,true,EXIT);
	}
	
	public MyFrame(String frameName, int sizeX, int sizeY)
	{
		super(frameName);
		init(sizeX,sizeY,true,EXIT);
	}
	
	public MyFrame(String frameName, int sizeX, int sizeY, boolean isVisible)
	{
		super(frameName);
		init(sizeX, sizeY, isVisible,EXIT);
	}
	
	public MyFrame(String frameName, int sizeX, int sizeY, boolean isVisible, int CLOSE_OPERATION)
	{
		super(frameName);
		init(sizeX, sizeY, isVisible, CLOSE_OPERATION);
	}
	
	private void init(int size_X, int size_Y,boolean Visibility, int CLOSE_OPERATION)
	{
		setVisible(Visibility);
		setSize(size_X, size_Y);
		setDefaultCloseOperation(CLOSE_OPERATION);
		setLayout(new FlowLayout());
	}
	
/*	public void setSize(int sizeX, int sizeY)
	{
		setSize(sizeX, sizeY);
	}*/
}