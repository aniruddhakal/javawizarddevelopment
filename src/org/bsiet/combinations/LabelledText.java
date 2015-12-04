package org.bsiet.combinations;
import javax.swing.*;
import javax.swing.text.Document;
import java.awt.Font;
import java.awt.event.*;
public class LabelledText extends JPanel
{
	/**
	 * 
	 */
	/*
	*Fields goes here
	*/
	public static final int LEFT = JTextField.LEFT;
	public static final int CENTER = JTextField.CENTER;
	public static final int RIGHT = JTextField.RIGHT;
	public static final int LEADING = JTextField.LEADING;
	public static final int TRAILING = JTextField.TRAILING;
	
	/*
	* Private data declarations goes here
	*/
	static final long serialVersionUID = 1L;
	JLabel label;
	public static JTextField textField;
	
	public String sampleText=null;
	
	//constructor 1
	public LabelledText()
	{
		label = new JLabel();
		textField = new JTextField();
		textField.setColumns(10);
		addComponents(label, textField, false);
	}
	
	//constructor 1
	public LabelledText(String labelName)
	{
		makeComponent(labelName, "", 10, false);
	}
	
	//constructor 2
	public LabelledText(String labelName, int columns)
	{
		makeComponent(labelName, "", 10, false);
	}
	
	//constructor 3
	public LabelledText(String labelName, String text)
	{
		makeComponent(labelName, text, 10, false);
	}
	
	//constructor 4
	public LabelledText(String labelName, String text, int columns)
	{
		makeComponent(labelName, text, columns, false);
	}
	
	//constructor 5
	public LabelledText(Icon iconImage)
	{
		makeComponent(iconImage, "", 10, false);
	}
	
	//constructor 6
	public LabelledText(Icon iconImage, int columns)
	{
		makeComponent(iconImage, "", columns, false);
	}
	
	//constructor 7
	public LabelledText(Icon iconImage, String text)
	{
		makeComponent(iconImage, text, 10, false);
	}
	
	//constructor 8
	public LabelledText(Icon iconImage, String text, int columns)
	{
		makeComponent(iconImage, text, columns, false);
	}
	
	
	/*
	* Is Vertical Constructors from here...
*/	
	//constructor 9
	public LabelledText(String labelName, boolean isVertical)
	{
		makeComponent(labelName, "", 10, isVertical);
	}
	
	//constructor 10
	public LabelledText(String labelName, int columns, boolean isVertical)
	{
		makeComponent(labelName, "", 10, isVertical);
	}
	
	//constructor 11
	public LabelledText(String labelName, String text, boolean isVertical)
	{
		makeComponent(labelName, text, 10, isVertical);
	}
	
	//constructor 12
	public LabelledText(String labelName, String text, int columns, boolean isVertical)
	{
		makeComponent(labelName, text, columns, isVertical);
	}
	
	//constructor 13
	public LabelledText(Icon iconImage, boolean isVertical)
	{
		makeComponent(iconImage, "", 10, isVertical);
	}
	
	//constructor 14
	public LabelledText(Icon iconImage, int columns, boolean isVertical)
	{
		makeComponent(iconImage, "", columns, isVertical);
	}
	
	//constructor 15
	public LabelledText(Icon iconImage, String text, boolean isVertical)
	{
		makeComponent(iconImage, text, 10, isVertical);
	}
	
	//constructor 16
	public LabelledText(Icon iconImage, String text, int columns, boolean isVertical)
	{
		makeComponent(iconImage, text, columns, isVertical);
	}
	
	/*Is Vertical Constructors Ends Here
	 * 
	 * */
	
	//makeComponent method for labelName's constructor overloading
	private void makeComponent(String labelName, String text, int columns, boolean isVertical)
	{
		label = new JLabel(labelName);
		textField = new JTextField(text, columns);
		addComponents(label, textField, isVertical);
	}
	
	
	//makeComponent method for labelIcon's constructor overloading
	private void makeComponent(Icon iconImage, String text, int columns, boolean isVertical)
	{
		label = new JLabel(iconImage);
		textField = new JTextField(text, columns);
		addComponents(label, textField, isVertical);
	}
	
	
	//addComponents method will add components in GroupLayout giving output in this panel 
	private void addComponents(JComponent comp1, JComponent comp2, boolean isVertical)
	{
		GroupLayout gpl1 = new GroupLayout(this);
		setLayout(gpl1);
		if(isVertical == true)
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp1)
							.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp1)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		}
		else
		{
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp1)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup().addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(comp1)
							.addComponent(comp2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));			
		}
	}
	
	/*
	*Actual methods for public goes here
	*/
	
	//method 1
	public String getLabel()
	{
		String labelName = label.getText();
		return labelName;
	}
	
	//method 2
	public void setLabel(String labelName)
	{
		label.setText(labelName);
	}
	
	//method 3
	public Icon getIcon()
	{
		Icon iconImage = label.getIcon();
		return iconImage;
	}
	
	//method 4
	public void setIcon(Icon iconImage)
	{
		label.setIcon(iconImage);
	}
	
	//method 5
	public void addActionListener(ActionListener listener)
	{		
		textField.addActionListener(listener);
	}
	
	//method 6
	public int getColumns()
	{
		int totalColumns = textField.getColumns();
		return totalColumns;
	}
	
	//method 7
	public int getScrollOffset()
	{
		int offset = textField.getScrollOffset();
		return offset;
	}
	
	//method 8
	public void setActionCommand(String command)
	{
		textField.setActionCommand(command);
	}
	/*sets the action command*/
	
	//method 9
	public void setColumns(int columns)
	{
		textField.setColumns(columns);
	}
	
	//method 10
	public void setDocument(Document doc)
	{
		textField.setDocument(doc);
	}

	//method 11
	public void setTextFont(Font fon)
	{
		textField.setFont(fon);
	}
	
	
	public void setFont(Font fon)
	{
		if(textField == null)
			textField = new JTextField();
		textField.setFont(fon);
	}
	//method 12
	public int getHorizontalAlignment()
	{
		int alignment = textField.getHorizontalAlignment();
		return alignment;
	}
	
	//method 13
	public void setHorizontalAlignment(int alignment)
	{
		textField.setHorizontalAlignment(alignment);
	}
	
	//method 14
	public void setScrollOffset(int offset)
	{
		textField.setScrollOffset(offset);
	}
	
	//method 15
	public void setSampleText(String text)
	{
		sampleText = text;
		textField.setText(sampleText);
		textField.addFocusListener(new FocusAdapter() {		
			public void focusGained(FocusEvent e) {
				Object source = e.getSource();
				if(source.equals(textField)){
					if(textField.getText().equals(sampleText)){
						textField.setText("");
					}
				}
			}

			public void focusLost(FocusEvent e) {
				if((textField.getText() != sampleText) && (textField.getText().equals("")))		
					textField.setText(sampleText);
			}
		});
	}
	
	//method 16
	public String getSampleText()
	{
		return sampleText;
	}
	
	//method 17
	public String getText()
	{
		String text = textField.getText();
		return text;
	}
	
	//method 18
	public void setText(String text)
	{
		textField.setText(text);
	}
}