package org.bsiet.combinations;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.Document;
public class LabelledTextArea extends JPanel
{
	private JLabel label;
	private JTextArea txtArea;
	private GroupLayout gpl;
	
	public LabelledTextArea(String labelName,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea();
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(String labelName,String text,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(text);
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(String labelName,int rows,int columns,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(rows,columns);
		addComp(label,txtArea,isVertical);
	}
	
	public LabelledTextArea(String labelName,Document doc,boolean isVertical)
	{
		label = new JLabel(labelName);
		txtArea = new JTextArea(doc);
		addComp(label, txtArea, isVertical);
	}
	public LabelledTextArea(String labelName,int rows,int columns,Document doc,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(doc, "", rows, columns);
		addComp(label, txtArea, isVertical);		
	}
	public LabelledTextArea(String labelName,int rows,int columns,String text,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(text,rows,columns);
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(String labelName,int rows,int columns,String text,Document doc,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(doc,"",rows,columns);
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(Icon imageIcon,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea();
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(Icon imageIcon,String text,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(text);
		addComp(label,txtArea, isVertical);
	}
	public LabelledTextArea(Icon imageIcon,Document doc,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(doc);
		addComp(label,txtArea,isVertical);
	}
	public LabelledTextArea(Icon imageIcon,int rows,int columns,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(rows,columns);
		addComp(label, txtArea, isVertical);
	}
	public LabelledTextArea(Icon imageIcon,int rows,int columns,String text,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(text,rows,columns);
		addComp(label,txtArea,true);
	}
	public LabelledTextArea(Icon imageIcon,int rows,int columns,Document doc,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(doc,"",rows,columns);
		addComp(label,txtArea,true);
	}
	public LabelledTextArea(Icon imageIcon,int rows,int columns,Document doc,String text,boolean isVertical)
	{
		label=new JLabel(imageIcon);
		txtArea=new JTextArea(doc,text,rows,columns);
		addComp(label,txtArea,true);
	}
	
	public void makeComp(String labelName, int rows, int columns,boolean isVertical)
	{
		label=new JLabel(labelName);
		txtArea=new JTextArea(rows,columns);
		addComp(label,txtArea,isVertical);
	}
	
	private void makeComp(Icon imageIcon, int rows, int columns,boolean isVertical)
	{
		 label=new JLabel(imageIcon);
		 txtArea=new JTextArea(rows,columns);
		 addComp(label,txtArea,isVertical);
	}
	
	private void makeComp(JLabel label2, String text, boolean isVertical) 
	{
		label=new JLabel();
		txtArea=new JTextArea(text);
		addComp(label,txtArea,isVertical);
	}
	private void addComp(JComponent comp1, JComponent comp2, boolean isVertical) 
	{
		GroupLayout gpl = new GroupLayout(this);
		setLayout(gpl);
		if(isVertical==true)
		{
		gpl.setHorizontalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)
					.addComponent(comp2)));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp1)).addGap(5)
				.addGroup(gpl.createParallelGroup()
					.addComponent(comp2)));
		}
		
			else
			{
				gpl.setHorizontalGroup(gpl.createSequentialGroup()
					.addGroup(gpl.createParallelGroup()
						.addComponent(comp1)).addGap(5)
					.addGroup(gpl.createParallelGroup()
						.addComponent(comp2,GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));

				gpl.setVerticalGroup(gpl.createSequentialGroup()
					.addGroup(gpl.createParallelGroup()
						.addComponent(comp1)
						.addComponent(comp2,GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
			}
	}

	
	public void getLabel(String labelName)
	{
		label=new JLabel(labelName);
		add(label);
	}
	
	public Icon getIcon()
	{
		Icon i=label.getIcon();
		return i;
	}
	
	public void setLabel(String labelName)
	{
		label.setText(labelName);
	}
	
	public void setIcon(Icon imageIcon)
	{
		label.setIcon(imageIcon);
	}
	
	public void append(String text)
	{
		txtArea.append(text);
	}
	
	public int getColumns()
	{
		int columns=txtArea.getColumns();
		return columns;
	}
	
	public int lineCount()
	{
		int lineCount=txtArea.getLineCount();
		return lineCount;
	}
	
	public boolean getLineWrap()
	{
		boolean wrap=txtArea.getLineWrap();
		return wrap;
	}
	
	public int getRows()
	{
		int Rows=txtArea.getRows();
		return Rows;
	}
	
	public void insert(String text,int insertPosition)
	{
		txtArea.insert(text, insertPosition);
	}
	
	public void replaceRange(String text,int startRange,int endRange)
	{
		txtArea.replaceRange(text, startRange, endRange);
		
	}
	
	public void setColumns(int columnsCount)
	{
		txtArea.setColumns(columnsCount);
	}
	
	public void setLabelFont(Font f)
	{
		label.setFont(f);
	}
	
	public void setTextFont(Font newFont)
	{
		txtArea.setFont(newFont);
	}
	
	public void setLineWrap(boolean wrapProperty)
	{
		txtArea.setLineWrap(wrapProperty);
	}
	
	public void setRows(int rowsCount)
	{
		txtArea.setRows(rowsCount);
	}
	
	public void setEnabled(boolean status)
	{
		txtArea.setEnabled(status);
		label.setEnabled(status);
	}
	
	public boolean isEnabled()
	{
		boolean status;
		
		if((txtArea.isEnabled() == true) && (label.isEnabled() == true))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
	}
	
	public void setToolTipText(String TipText)
	{
		txtArea.setToolTipText(TipText);
		label.setToolTipText(TipText);
	}
	
	public String getToolTipText()
	{
		return (txtArea.getToolTipText());
	}
}