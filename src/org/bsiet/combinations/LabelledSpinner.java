package org.bsiet.combinations;
/**
 * @(#)LabelledSpinner.java
 *
 *
 * @author 
 * @version 1.00 2012/2/23
 */

import javax.swing.*;
import java.text.ParseException;

import javax.swing.event.*;
@SuppressWarnings("serial")
public class LabelledSpinner extends JPanel //implements ChangeListener
{
	JPanel p1;
	GroupLayout gpl;
	JLabel label1;
	JSpinner spinner;
	SpinnerModel spinnerModel;
	public LabelledSpinner()
	{
		label1=new JLabel();
		spinner=new JSpinner();
		add(label1);
		add(spinner);
	}
	public LabelledSpinner(String labelName)
    {
    	label1=new JLabel(labelName);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,false);
    }
    public LabelledSpinner(String labelName,SpinnerModel spinnerModel) 
    {
    	label1=new JLabel(labelName);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,false);
    }
    public LabelledSpinner(Icon imageIcon)
    {
    	label1=new JLabel(imageIcon);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,false);
    }
    public LabelledSpinner(Icon imageIcon,SpinnerModel spinnerModel)
    {
    	label1=new JLabel(imageIcon);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,false);
    }
    public LabelledSpinner(String labelName,boolean isVertical)
    {
    	label1=new JLabel(labelName);
    	spinner=new JSpinner();
    	addComponent(label1,spinner,isVertical);
    }
    public LabelledSpinner(String labelName,SpinnerModel spinnerModel,boolean isVertical)
    {
    	label1=new JLabel(labelName);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,isVertical);
    }
    public LabelledSpinner(Icon imageIcon,SpinnerModel spinnerModel,boolean isVertical)
    {
    	label1=new JLabel(imageIcon);
    	spinner=new JSpinner(spinnerModel);
    	addComponent(label1,spinner,isVertical);
    }
    
    public void addComponent(JComponent comp1,JComponent comp2,boolean isVertical)
    {
    	p1=new JPanel();
    	gpl=new GroupLayout(p1);
    	p1.setLayout(gpl);
    	if(isVertical==true)
    	{
    		gpl.setHorizontalGroup(gpl.createSequentialGroup()
    				
    				.addGroup(gpl.createParallelGroup()
    						
    						.addComponent(comp1).addGap(5)
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
    						.addComponent(comp1).addGap(5)
    						.addComponent(comp1).addGap(5)));
    		
    	}
    }
    
    public void setLabel(String labelName)
    {
    	label1.setText(labelName);
    }
    public String getLabel()
    {
    	return(label1.getText());
    }
	public Icon getIcon()
	{
		Icon imageIcon=label1.getIcon();
		return imageIcon;
	}
	public void setIcon(Icon imageIcon)
	{
		label1.setIcon(imageIcon);
	}
	public void addChangeListener(ChangeListener listener)
	{
		spinner.addChangeListener(listener);
	}
	public void commitEdit() throws ParseException
	{
		spinner.commitEdit();
	}
	public JComponent getEditor()
	{
		return(spinner.getEditor());
	}
	public SpinnerModel getModel()
	{
		return(spinner.getModel());
	}
	public Object getNextValue()
	{
		return(spinner.getNextValue());
	}
	public Object getPreviousValue()
	{
		return(spinner.getPreviousValue());
	}
	public Object getValue()
	{
		return(spinner.getValue());
	}
	public void setEditor(JComponent editor)
	{
		spinner.setEditor(editor);
	}
	public void setModel(SpinnerModel model)
	{
		spinner.setModel(model);
	}
	public void setValue(Object value)
	{
		spinner.setValue(value);
	}
	public void setEnabled(boolean status)
	{
		spinner.setEnabled(status);
		label1.setEnabled(status);
	}
	public boolean isEnabled()
	{
		return(spinner.isEnabled());
	}
	public void setToolTipText(String tipText)
	{
		spinner.setToolTipText(tipText);
	}
	public String getToolTipText()
	{
		return(spinner.getToolTipText());
	}
}