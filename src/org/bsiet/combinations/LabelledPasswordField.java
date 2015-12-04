package org.bsiet.combinations;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class LabelledPasswordField extends JPanel
{
	JPasswordField passField1;
	JLabel label1;
	
	public static final int MIN_LENGTH = 6;
	public static final int MAX_LENGTH = 18;
	
	//constructor 1
	public LabelledPasswordField(String labelName)
	{
		construct(labelName, "", 10, false);
	}
	
	//constructor 2
	public LabelledPasswordField(String labelName, int columns)
	{
		construct(labelName, "", columns, false);
	}
	
	//constructor 3
	public LabelledPasswordField(String labelName, String passwordText)
	{
		construct(labelName, passwordText, 10, false);
	}
	
	//constructor 4
	public LabelledPasswordField(String labelName, String passwordText, int columns)
	{
		construct(labelName, passwordText, columns, false);
	}
	
	//constructor 5
	public LabelledPasswordField(Icon imageIcon)
	{
		construct(imageIcon, "", 10, false);
	}
	
	//constructor 6
	public LabelledPasswordField(Icon imageIcon, int columns)
	{
		construct(imageIcon, "", columns, false);
	}
	
	//constructor 7
	public LabelledPasswordField(Icon imageIcon, String passwordText)
	{
		construct(imageIcon, passwordText, 10, false);
	}
	
	//constructor 8
	public LabelledPasswordField(Icon imageIcon, String passwordText, int columns)
	{
		construct(imageIcon, passwordText, columns, false);
	}
	/*
	*	isVertical Constructors
	*/
	//constructor 9
	public LabelledPasswordField(String labelName, boolean isVertical)
	{
		construct(labelName, "", 10, isVertical);
	}
	
	
	//constructor 10
	public LabelledPasswordField(String labelName, int columns, boolean isVertical)
	{
		construct(labelName, "", columns, isVertical);
	}
	
	//constructor 11
	public LabelledPasswordField(String labelName, String passwordText, boolean isVertical)
	{
		construct(labelName, passwordText, 10, isVertical);
	}
	
	//constructor 12
	public LabelledPasswordField(String labelName, String passwordText, int columns, boolean isVertical)
	{
		construct(labelName, passwordText, columns, isVertical);
	}
	
	//constructor 13
	public LabelledPasswordField(Icon imageIcon, boolean isVertical)
	{
		construct(imageIcon, "", 10, isVertical);
	}
	
	//constructor 14
	public LabelledPasswordField(Icon imageIcon, int columns, boolean isVertical)
	{
		construct(imageIcon, "", columns, isVertical);
	}
	
	//constructor 15
	public LabelledPasswordField(Icon imageIcon, String passwordText, boolean isVertical)
	{
		construct(imageIcon, passwordText, 10, isVertical);
	}
	
	//constructor 16
	public LabelledPasswordField(Icon imageIcon, String passwordText, int columns, boolean isVertical)
	{
		construct(imageIcon, passwordText, columns, isVertical);
	}	
	/*
	* all constructors ends here
	*/
	
	private void construct(String labelName, String passwordText, int columns, boolean isVertical)
	{
		passField1 = new JPasswordField(passwordText, columns);
		label1 = new JLabel(labelName);
		addComponent(isVertical);
	}
	
	private void construct(Icon imageIcon, String passwordText, int columns, boolean isVertical)
	{
		passField1 = new JPasswordField(passwordText, columns);
		label1 = new JLabel(imageIcon);
		addComponent(isVertical);
	}
	
	private void addComponent(boolean isVertical)
	{
		if(isVertical == true)
		{
			GroupLayout gpl1 = new GroupLayout(this);
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup().addGap(5)
							.addComponent(label1)
							.addComponent(passField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup()
							.addComponent(label1)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(passField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			setLayout(gpl1);
		}
		else
		{
			GroupLayout gpl1 = new GroupLayout(this);
			gpl1.setHorizontalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup()
							.addComponent(label1)).addGap(5)
					.addGroup(gpl1.createParallelGroup()
							.addComponent(passField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(5));
			gpl1.setVerticalGroup(gpl1.createSequentialGroup()
					.addGroup(gpl1.createParallelGroup()
							.addComponent(label1)
							.addComponent(passField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
			setLayout(gpl1);
		}
	}
	
	
	//methods from here
	
	//method 1
	public String getLabel()
	{
		String labelNm = label1.getText();
		return labelNm;
	}
	
	//method 2
	public char getEchoChar()
	{
		char Char = passField1.getEchoChar();
		return Char;
	}
	
	//method 3
	public char[] getPassword()
	{
		char pass[] = passField1.getPassword();
		return pass;
	}
	
	//method 4
	public Icon getIcon()
	{
		Icon image = label1.getIcon();
		return image;
	}
	
	//method 9
	public void setEchoChar(char echoChar)
	{
		passField1.setEchoChar(echoChar);
	}
	
	//method 10
	public void setIcon(Icon iconImage)
	{
		label1.setIcon(iconImage);
	}
	
	//method 11
	public void setLabel(String labelName)
	{
		label1.setText(labelName);
	}
	
	//method 12
	public void setEnabled(boolean status)
	{
		label1.setEnabled(status);
		passField1.setEnabled(status);
	}
	
	//method 13
	public boolean isEnabled()
	{
		boolean status;
		if((label1.isEnabled() == true) && (passField1.isEnabled() == true))
			status = true;
		else
			status = false;
		
		return status;
	}
	
	//method 14
	public void setToolTipText(String tipText)
	{
		setToolTipText(tipText);
	}
	
	//method 15
	public String getToolTipText()
	{
		String text = getToolTipText();
		return text;
	}
	
	//method 16
	public void addActionListener(ActionListener listener)
	{
		passField1.addActionListener(listener);
	}
	
	//method 17
	public void setActionCommand(String command)
	{
		passField1.setActionCommand(command);
	}
	
	//method 18
	public void setPassword(String passwordText)
	{
		passField1.setText(passwordText);
	}
}