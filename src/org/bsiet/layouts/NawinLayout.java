package org.bsiet.layouts;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
public class NawinLayout extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2650041343783515589L;

	public NawinLayout(Object[] arr, boolean isVertical)
	{
		int len = arr.length;
		
		if(len == 1)
		{
			alignOne(arr);
		}
		else if(len == 2)
		{
			alignTwo(arr, isVertical);			
		}
		else if(len == 3)
		{
			alignThree(arr, isVertical);
		}
		else if(len == 4)
		{
			alignFour(arr, isVertical);
		}
		else if(len == 5)
		{
			alignFive(arr, isVertical);
		}
		else if(len == 6)
		{
			alignSix(arr, isVertical);
		}
		else if(len == 7)
		{
			alignSeven(arr, isVertical);
		}
		else if(len == 8)
		{
			alignEight(arr, isVertical);
		}
		else if(len == 9)
		{
			alignNine(arr, isVertical);
		}
		else if(len == 10)
		{
			alignTen(arr, isVertical);
		}
		else if(len == 11)
		{
			alignEleven(arr, isVertical);
		}
		else if(len == 12)
		{
			alignTwelve(arr, isVertical);
		}
		else if(len == 13)
		{
			alignThirteen(arr, isVertical);
		}
		else if(len == 14)
		{
			alignFourteen(arr, isVertical);
		}
		else if(len == 15)
		{
			alignFifteen(arr, isVertical);
		}
	}
	
	//alignment private methods from here
	
	private void alignOne(Object[] arr)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
	}
	
	private void alignTwo(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent((JComponent)arr[1], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(5)
							.addComponent((JComponent)arr[1], GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		}
	}
	
	private void alignThree(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2])).addGap(10));
		}
	}
	
	private void alignFour(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3])).addGap(10));
		}
	}
	
	private void alignFive(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3]).addGap(5)
							.addComponent((JComponent)arr[4])).addGap(10));
		}
	}
	
	private void alignSix(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3]).addGap(5)
							.addComponent((JComponent)arr[4]).addGap(5)
							.addComponent((JComponent)arr[5])).addGap(10));
		}
	}
	
	private void alignSeven(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3]).addGap(5)
							.addComponent((JComponent)arr[4]).addGap(5)
							.addComponent((JComponent)arr[5]).addGap(5)
							.addComponent((JComponent)arr[6])).addGap(10));
		}
	}
	
	private void alignEight(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(10));
		}
		
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3]).addGap(5)
							.addComponent((JComponent)arr[4]).addGap(5)
							.addComponent((JComponent)arr[5]).addGap(5)
							.addComponent((JComponent)arr[6]).addGap(5)
							.addComponent((JComponent)arr[7])).addGap(10));
		}
	}
	
	private void alignNine(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0]).addGap(5)
							.addComponent((JComponent)arr[1]).addGap(5)
							.addComponent((JComponent)arr[2]).addGap(5)
							.addComponent((JComponent)arr[3]).addGap(5)
							.addComponent((JComponent)arr[4]).addGap(5)
							.addComponent((JComponent)arr[5]).addGap(5)
							.addComponent((JComponent)arr[6]).addGap(5)
							.addComponent((JComponent)arr[7]).addGap(5)
							.addComponent((JComponent)arr[8]).addGap(10)));
		}
	}
	
	private void alignTen(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(10));
			
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])).addGap(10));
		}
	}
	
	private void alignEleven(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])).addGap(10));
		}
	}
	
	private void alignTwelve(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])).addGap(10));
		}
	}
	
	private void alignThirteen(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])).addGap(10));
		}
	}
	
	private void alignFourteen(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])
							.addComponent((JComponent)arr[13])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[13])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[13])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])
							.addComponent((JComponent)arr[13])).addGap(10));
		}
	}
	
	private void alignFifteen(Object[] arr, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])
							.addComponent((JComponent)arr[13])
							.addComponent((JComponent)arr[14])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[13])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[14])).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[1])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[2])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[3])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[4])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[5])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[6])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[7])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[8])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[9])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[10])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[11])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[12])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[13])).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[14])).addGap(10));
			
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(10)
					.addGroup(gpl1.createParallelGroup()
							.addComponent((JComponent)arr[0])
							.addComponent((JComponent)arr[1])
							.addComponent((JComponent)arr[2])
							.addComponent((JComponent)arr[3])
							.addComponent((JComponent)arr[4])
							.addComponent((JComponent)arr[5])
							.addComponent((JComponent)arr[6])
							.addComponent((JComponent)arr[7])
							.addComponent((JComponent)arr[8])
							.addComponent((JComponent)arr[9])
							.addComponent((JComponent)arr[10])
							.addComponent((JComponent)arr[11])
							.addComponent((JComponent)arr[12])
							.addComponent((JComponent)arr[13])
							.addComponent((JComponent)arr[14])).addGap(10));
		}
	}
}