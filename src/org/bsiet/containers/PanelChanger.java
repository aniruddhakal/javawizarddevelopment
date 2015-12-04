package org.bsiet.containers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.*;
@SuppressWarnings("serial")
public abstract class PanelChanger extends MyFrame implements ActionListener
{
	
	static public JButton backButton, nextButton, cancelButton;
	public JPanel mainPanel, permanentPanel, changerPanel;
	JSeparator panelSeparator;
	Vector<JPanel> panelsVector;
	static int posi=1, vectSize;
	int conf;
	
	public static final int EXIT = EXIT_ON_CLOSE;
	public static final int HIDE = HIDE_ON_CLOSE;
	public static final int NOTHING = DO_NOTHING_ON_CLOSE;
	public static final int DISPOSE = DISPOSE_ON_CLOSE;
	
	public PanelChanger(){};
	
	public PanelChanger(String frameName, Vector<JPanel> panelsVector)
	{
		super(frameName, 640, 480,true, EXIT);
		this.panelsVector = panelsVector;
		windowClosing();
		init();
	}
	
	public PanelChanger(String frameName, Vector<JPanel> panelsVector, int sizeX, int sizeY)
	{
		super(frameName, sizeX, sizeY, true, EXIT);
		this.panelsVector = panelsVector;
		windowClosing();
		init();
	}
	
	public PanelChanger(String frameName, Vector<JPanel> panelsVector, int sizeX, int sizeY, boolean visibility)
	{
		super(frameName, sizeX, sizeY, visibility, EXIT);
		this.panelsVector = panelsVector;
		windowClosing();
		init();
	}
	
	public PanelChanger(String frameName, Vector<JPanel> panelsVector, int sizeX, int sizeY, boolean visibility, int CLOSE_OPERATION)
	{
		super(frameName, sizeX, sizeY, visibility, CLOSE_OPERATION);
		this.panelsVector = panelsVector;
		windowClosing();
		init();
	}
	
	public void set(String frameName, Vector<JPanel> panelsVector, int sizeX, int sizeY, boolean visibility, int CLOSE_OPERATION)
	{
		setTitle(frameName);
		setSize(sizeX, sizeY);
		setVisible(visibility);
		setDefaultCloseOperation(CLOSE_OPERATION);
		this.panelsVector = panelsVector;
		windowClosing();
		init();
	}
	
	/*
	 * this method will ask for closing confirmation YES or NO, when pressed on exit icon or pressed alt+F4
	*/
	private void windowClosing()
	{
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				closeOperation();
			}
		});
	}
	
	private void init()
	{
		panelSeparator = new JSeparator(JSeparator.HORIZONTAL);
		
		backButton = new JButton("<< Back");
		nextButton = new JButton("Next >>");
		cancelButton = new JButton("Cancel");
		backButton.addActionListener(this);
		nextButton.addActionListener(this);
		nextButton.setActionCommand("Next");
		cancelButton.addActionListener(this);
		
		mainPanel = new JPanel();
		permanentPanel = new JPanel();
		GroupLayout gplPermanent = new GroupLayout(permanentPanel);
		permanentPanel.setLayout(gplPermanent);		
		gplPermanent.setHorizontalGroup(gplPermanent.createSequentialGroup().addGap(10)
				.addGroup(gplPermanent.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(backButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10)
				.addGroup(gplPermanent.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(nextButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10)
				.addGroup(gplPermanent.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(cancelButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		gplPermanent.setVerticalGroup(gplPermanent.createSequentialGroup().addGap(10)
				.addGroup(gplPermanent.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(backButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)				
						.addComponent(nextButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)				
						.addComponent(cancelButton, GroupLayout.Alignment.CENTER, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(10));
		
		changerPanel = new JPanel();
		GroupLayout gpl1 = new GroupLayout(changerPanel);
		changerPanel.setLayout(gpl1);
		add(changerPanel);
		gpl1.setHorizontalGroup(gpl1.createSequentialGroup()
				.addGroup(
					gpl1.createParallelGroup(GroupLayout.Alignment.LEADING, true)
						.addComponent(mainPanel)
						.addComponent(panelSeparator, GroupLayout.Alignment.TRAILING)
						.addComponent(permanentPanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		gpl1.setVerticalGroup(gpl1.createSequentialGroup()
				.addGroup(gpl1.createParallelGroup(GroupLayout.Alignment.CENTER, true)
						.addComponent(mainPanel))
				.addGroup(
					gpl1.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(panelSeparator, GroupLayout.Alignment.TRAILING))
				.addGroup(
					gpl1.createParallelGroup(GroupLayout.Alignment.TRAILING, true)
						.addComponent(permanentPanel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)));
		mainPanel.add(panelsVector.elementAt(0));
	
	}
	
	
	private void shiftNextPanel()
	{
		vectSize = panelsVector.size();
		repaint();
		if(posi == vectSize)
		{			
			nextButton.setActionCommand("Finish");
			nextButton.setText("Finish");
			repaint();
		}
		else{
			mainPanel.remove(panelsVector.elementAt(posi-1));
			mainPanel.add(panelsVector.elementAt(posi));
			mainPanel.setVisible(false);
			mainPanel.setVisible(true);
			
			posi++;
			if(posi == vectSize)
			{
				nextButton.setActionCommand("Finish");
				nextButton.setText("Finish");
				repaint();
			}
			repaint();
			
		}
	}
	
	private void shiftBackPanel()
	{
		vectSize = panelsVector.size();
		if(posi == 1)
		{
			repaint();
		}
		else if(posi > 0)
		{
			mainPanel.remove(panelsVector.elementAt(posi-1));
			mainPanel.add(panelsVector.elementAt(posi - 2));
			posi--;
		}
		
		if(posi < (vectSize))
		{
			nextButton.setText("Next >>");
			nextButton.setActionCommand("Next >>");
			repaint();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if(source.equals(nextButton))
		{
			shiftNextPanel();
			repaint();
		}
		else if(source.equals(backButton))
		{
			shiftBackPanel();
			repaint();
		}
		else if(source.equals(cancelButton))
		{
			/*
			* here will be cancel button code overridden by user, if user don't override, following code will execute
			* to do this, put this code in overridable method
			*/
			cancelButton();
		}
		
		if(source.equals(nextButton) && (e.getActionCommand().equalsIgnoreCase("Finish")))
		{
			finishButton();
		}
		

	}
	
	public abstract void finishButton();
	public abstract void cancelButton();
	
	public void setWizardSize(int sizeX, int sizeY)
	{
		super.setSize(sizeX, sizeY);
	}
	
	private void closeOperation()
	{
		conf = JOptionPane.showConfirmDialog(this, "Close this Wizard???", "Wait...!", JOptionPane.YES_NO_OPTION);
		if(conf == JOptionPane.YES_OPTION)
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else
		{
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

}