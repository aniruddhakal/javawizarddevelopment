package org.bsiet.containers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class OkCancelFrame extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public static final int EXIT = JFrame.EXIT_ON_CLOSE;
	public static final int DISPOSE = JFrame.DISPOSE_ON_CLOSE;
	public static final int HIDE = JFrame.HIDE_ON_CLOSE;
	public static final int NOTHING = JFrame.DO_NOTHING_ON_CLOSE;
	
	public static JButton okButton, cancelButton;
	
	/*
	*
	*constructors from here
	*/
	
	//constructor 1
	public OkCancelFrame()
	{
		make("MyForm", "Ok", "Cancel", true, true, DISPOSE);
	}
	
	//constructor 2
	public OkCancelFrame(String title)
	{
		make(title, "Ok", "Cancel", true, true, DISPOSE);
	}
	
	//constructor 3
	public OkCancelFrame(String button1Name, String button2Name)
	{
		make("MyForm", button1Name, button2Name, true, true, DISPOSE);
	}
	
	//constructor 4
	public OkCancelFrame(String title, String button1Name, String button2Name)
	{
		make(title, button1Name, button2Name, true, true, DISPOSE);
	}
	
	//constructor 5
	public OkCancelFrame(String title, boolean isOkEnabled, boolean isCancelEnabled)
	{
		make(title, "Ok", "Cancel", isOkEnabled, isCancelEnabled, DISPOSE);
	}
	
	//constructor 6
	public OkCancelFrame(String title, String button1Name, String button2Name, boolean isOkEnabled, boolean isCancelEnabled)
	{
		make(title, button1Name, button2Name, isOkEnabled, isCancelEnabled, DISPOSE);
	}
	
	//constructor 7
	public OkCancelFrame(String title, String button1Name, String button2Name, boolean isOkEnabled, boolean isCancelEnabled, int CLOSE_OPERATION)
	{
		make(title, button1Name, button2Name, isOkEnabled, isCancelEnabled, CLOSE_OPERATION);
	}
	
	private void make(String title, String button1Name, String button2Name, boolean isOkEnabled, boolean isCancelEnabled, int CLOSE_OPERATION)
	{
		setVisible(true);
		setSize(640, 480);
		setTitle(title);
		okButton = new JButton(button1Name);
		okButton.addActionListener(this);
		cancelButton = new JButton(button2Name);
		cancelButton.addActionListener(this);
		
		JPanel defPan = new JPanel();
		GroupLayout gpl1 = new GroupLayout(defPan);
		gpl1.setHorizontalGroup(gpl1.createSequentialGroup().addGap(20)
				.addGroup(gpl1.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(okButton,GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(20)
				.addGroup(gpl1.createParallelGroup()
						.addComponent(cancelButton,GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		gpl1.setVerticalGroup(gpl1.createSequentialGroup()
				.addGroup(gpl1.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(okButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cancelButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		defPan.setLayout(gpl1);
		
		add(defPan, BorderLayout.SOUTH);
		okButton.setEnabled(isOkEnabled);
		cancelButton.setEnabled(isCancelEnabled);
		setDefaultCloseOperation(CLOSE_OPERATION);
	}
	
	public abstract void okButton();
	public abstract void cancelButton();
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(okButton)) {
			okButton();
		}
		
		if (e.getSource().equals(cancelButton)) {
			cancelButton();
		}
	}
}