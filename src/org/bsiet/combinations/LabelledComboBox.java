package org.bsiet.combinations;
import javax.swing.*;
import java.util.Vector;
import java.awt.event.*;
@SuppressWarnings("serial")
public class LabelledComboBox extends JPanel
 {
	private JLabel label1;
 	private JComboBox<Object> combobox1;
	//private GroupLayout gpl;
	
	protected boolean isEditable = false;
	protected int maximumRowCount = 8;

	public LabelledComboBox(String labelName)
	{
		Object[] arr = {};
		makeComp(labelName, false, arr);
	}
    
	public LabelledComboBox(String labelName, Object[] items)
	{
		makeComp(labelName, false, items);
	}
	
	public LabelledComboBox(String labelName, Vector<Object> itemsVector)
	{
		makeComp(labelName, itemsVector, false);
	}
	
	public LabelledComboBox(Icon iconImage) 
	{
		Object[] arr = {};
		makeComp(iconImage, false, arr);
	}
    
	public LabelledComboBox(Icon iconImage, Object[] items)
	{
		makeComp(iconImage, false, items);
	}
	
	public LabelledComboBox(Icon iconImage, Vector<Object> itemsVector)
	{
		makeComp(iconImage, itemsVector, false);
	}

	
	//isVertical methods from here
	public LabelledComboBox(String labelName, boolean isVertical) 
	{
		Object[] arr = {};
		makeComp(labelName, isVertical, arr);
	}
    
	public LabelledComboBox(String labelName, Object[] items, boolean isVertical)
	{
		makeComp(labelName, isVertical, items);
	}
	
	public LabelledComboBox(String labelName, Vector<Object> itemsVector, boolean isVertical)
	{
		makeComp(labelName, itemsVector, isVertical);
	}
	
	public LabelledComboBox(Icon iconImage, boolean isVertical)
	{
		Object[] arr = {};
		makeComp(iconImage, isVertical, arr);
	}
    
	public LabelledComboBox(Icon iconImage, Object[] items, boolean isVertical)
	{
		makeComp(iconImage, isVertical, items);
	}
	
	public LabelledComboBox(Icon iconImage, Vector<Object> itemsVector, boolean isVertical)
	{
		makeComp(iconImage, itemsVector, isVertical);
	}
	
	//reusable internal methods here
	private void makeComp(String labelName,  boolean isVertical, Object[] items)
	{
		label1=new JLabel(labelName);
 	   	combobox1=new JComboBox<Object>(items);
    		addComp(label1, combobox1, isVertical);	
	}
	
	private void makeComp(Icon imageIcon, boolean isVertical, Object[] items)
	{
		label1=new JLabel(imageIcon);
    		combobox1=new JComboBox<Object>(items);
    		addComp(label1, combobox1, isVertical);		
	}
	
	private void makeComp(String labelName, Vector<Object> itemsVector, boolean isVertical)
	{
		label1=new JLabel(labelName);
	    	combobox1=new JComboBox<Object>(itemsVector);
    		addComp(label1, combobox1, isVertical);
	}
	
	private void makeComp(Icon imageIcon, Vector<Object> itemsVector, boolean isVertical)
	{
		label1=new JLabel(imageIcon);
    		combobox1=new JComboBox<Object>(itemsVector);
    		addComp(label1, combobox1, isVertical);
	}
    	
    	 
    private void addComp(JComponent comp1, JComponent comp2, boolean isVertical)
	{
		GroupLayout gpl = new GroupLayout(this);
		setLayout(gpl);
		if(isVertical == true)
		{
			gpl.setHorizontalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(comp1)
				.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
			.addGroup(gpl.createParallelGroup()
				.addComponent(comp1)).addGap(5)
			.addGroup(gpl.createParallelGroup()
				.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5));	
		}
		else
		{
			gpl.setHorizontalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5));

			gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)
					.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5));
		}
	}

	//methods from here
	public void addActionListener(ActionListener l)
	{
		combobox1.addActionListener(l);
	}
	
	public void addItemListener(ItemListener aListener)
	{
		combobox1.addItemListener(aListener);	
	}

	public void addItem(Object item)
	{
		combobox1.addItem(item);
	}
	
	public Action getAction()
	{
		Action ac = combobox1.getAction();
		return ac;
	}
	public String getActionCommand()
	{
		String action = combobox1.getActionCommand();
		return action;		
	}

	public Object getItemAt(int index)
	{
		Object element = combobox1.getItemAt(index);
		return element;	
	}
	
	public int getItemCount()
	{
		int count = combobox1.getItemCount();
		return count;
	}

	 public int getMaximumRowCount()
	{
		 int max = combobox1.getMaximumRowCount();
		return max;
	}
		 
	public int getSelectedIndex()
	{
		int index = combobox1.getSelectedIndex();
		return index;
	}

	public Object getSelectedItem()
	{
		Object obj = combobox1.getSelectedItem();
		return obj;
	}

	public Object[] getSelectedObjects()
	{
		Object[] objar = combobox1.getSelectedObjects();
		return objar;
	}
	
	public void insertElementAt(Object item, int index)
	{
		combobox1.insertItemAt(item, index);
	}

	public boolean isEditable()
	{
		boolean edit = combobox1.isEditable();
		return edit;
	}

	public void removeAllItems()
	{
		combobox1.removeAllItems();
	}

	public void removeItem(Object anObject)
	{		
		combobox1.removeItem(anObject);
	}

	public void removeItemAt(int anIndex)
	{
		combobox1.removeItemAt(anIndex);
	}

	public void setAction(Action a)
	{
		combobox1.setAction(a);
	}
	
	public void setActionCommand(String aCommand)
	{	
		combobox1.setActionCommand(aCommand);
	}
	
	public void setEditable(boolean aFlag)
	{	
		combobox1.setEditable(aFlag);
		
	}

	public void setEnabled(boolean b)
	{
		label1.setEnabled(b);
		combobox1.setEnabled(b);
	}

	public void setMaximumRowCount(int count)
	{
		combobox1.setMaximumRowCount(count);
	}

	public void setSelectedIndex(int anIndex)
	{
		combobox1.setSelectedIndex(anIndex);
	}

	public void setSelectedItem(Object anObject)
	{
		combobox1.setSelectedItem(anObject);
	}
	
	public void setToolTipText(String tipText)
	{
		label1.setToolTipText(tipText);
	}
	
	public String getToolTipText()
	{
		String tipText = label1.getToolTipText();
		return tipText;
	}
	
	public boolean isEnabled()
	{
		boolean status;
		if((label1.isEnabled() == true) && (combobox1.isEnabled() == true))
			status = true;
		else
			status = false;
		
		return status;
	}
}