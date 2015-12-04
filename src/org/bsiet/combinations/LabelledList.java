package org.bsiet.combinations;
import javax.swing.*;
import java.util.*;
import javax.swing.event.*;
@SuppressWarnings("serial")
public class LabelledList extends JPanel implements ListSelectionListener
{
	JLabel label;
	JList<Object> list;
	Vector<Object> dataListVector; 
	JPanel p1;
	GroupLayout gpl;
	Boolean isVertical;
	public static final int H_WRAP=JList.HORIZONTAL_WRAP;
	public static final int V=JList.VERTICAL;
	public static final int V_WRAP=JList.VERTICAL_WRAP;
	//here vertical
	public LabelledList(String labelName,Boolean isVertical)
	{
		label=new JLabel(labelName);
		list=new JList<Object>();
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	
	}	
	public LabelledList(String labelName,Object[] dataListArray,Boolean isVertical)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListArray);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	}	
	public LabelledList(String labelName,Object[] dataListArray,int visibleRowCount,Boolean isVertical)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListArray);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	}
	public LabelledList(String labelName,Vector<Object> dataListVector,Boolean isVertical)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListVector);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
		}
	public LabelledList(String labelName,Vector<Object> dataListVector,int visibleRowCount,Boolean isVertical)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListVector);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
		}
	public LabelledList(Icon imageIcon,Boolean isVertical)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>();
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	}	
	public LabelledList(Icon imageIcon,Object[] dataListArray,Boolean isVertical)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListArray);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
		
	}
	public LabelledList(Icon imageIcon,Object[] dataListArray,int visibleRowCount,Boolean isVertical)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListArray);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
		
	}
	public LabelledList(Icon imageIcon,Vector<Object> dataListVector,Boolean isVertical)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListVector);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	}
	public LabelledList(Icon imageIcon,Vector<Object> dataListVector,int visibleRowCount,Boolean isVertical)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListVector);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane,isVertical);
	}
	//here horizontal
	public LabelledList(String labelName)
	{
		label=new JLabel(labelName);
		list=new JList<Object>();
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	
	}	
	public LabelledList(String labelName,Object[] dataListArray)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListArray);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	}	
	public LabelledList(String labelName,Object[] dataListArray,int visibleRowCount)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListArray);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	}
	public LabelledList(String labelName,Vector<Object> dataListVector)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListVector);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
		}
	public LabelledList(String labelName,Vector<Object> dataListVector,int visibleRowCount)
	{
		label=new JLabel(labelName);
		list=new JList<Object>(dataListVector);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
		}
	public LabelledList(Icon imageIcon)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>();
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	}	
	public LabelledList(Icon imageIcon,Object[] dataListArray)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListArray);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
		
	}
	public LabelledList(Icon imageIcon,Object[] dataListArray,int visibleRowCount)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListArray);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
		
	}
	public LabelledList(Icon imageIcon,Vector<Object> dataListVector)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListVector);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	}
	public LabelledList(Icon imageIcon,Vector<Object> dataListVector,int visibleRowCount)
	{
		label=new JLabel(imageIcon);
		list=new JList<Object>(dataListVector);
		list.setVisibleRowCount(visibleRowCount);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		construct(label,scrollPane);
	}
	//construct method defination for reusibility
	public void construct(JComponent comp1,JComponent comp2,boolean isVertical)
	{
		p1 = new JPanel();
		gpl = new GroupLayout(p1);
		p1.setLayout(gpl);
			if(isVertical==true)
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

			.addGroup(gpl.createParallelGroup()
				.addComponent(comp1)
				.addComponent(comp2)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(comp1)).addGap(5)
			.addGroup(gpl.createParallelGroup()
				.addComponent(comp2)).addGap(5));
			}
			else
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()

				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp2)).addGap(5));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)
					.addComponent(comp2)).addGap(5));


			}
	}
	public void construct(JComponent comp1,JComponent comp2)
	{
		p1 = new JPanel();
		gpl = new GroupLayout(p1);
		p1.setLayout(gpl);
			gpl.setHorizontalGroup(gpl.createSequentialGroup()

				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp2)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)
					.addComponent(comp2)).addGap(5));
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
	public void addListSelectionListener(ListSelectionListener listener)
	{
		list.addListSelectionListener(listener);
	}
	public void  addSelectionInterval(int anchor,int lead)
	{
		list.addSelectionInterval(anchor,lead);
	}
	public void valueChanged(ListSelectionEvent l)
	{
		System.out.println ("Event occured");
	}
}