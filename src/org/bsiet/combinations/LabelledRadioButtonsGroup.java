package org.bsiet.combinations;
import javax.swing.*;
@SuppressWarnings("serial")
public class LabelledRadioButtonsGroup extends JPanel {

	/**
	 * @param args
	 */
	int len;
	JRadioButton[] buttonsArr;
	JLabel label;
	ButtonGroup bg;
	
	public LabelledRadioButtonsGroup(String labelName, String[] args1)
	{
		initComponent(labelName, args1);
	}
	
	private void initComponent(String labelName, String[] args1)
	{
		bg = new ButtonGroup();
		len = args1.length;
		label = new JLabel(labelName);
		add(label);
		buttonsArr = new JRadioButton[len];
		for(int i=0;i<len;i++)
		{
			buttonsArr[i] = new JRadioButton(args1[i]);
			bg.add(buttonsArr[i]);
			add(buttonsArr[i]);			
		}

	}
	
}
