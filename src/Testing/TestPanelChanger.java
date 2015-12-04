package Testing;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.bsiet.containers.*;
@SuppressWarnings("serial")
class TestPanelChanger extends PanelChanger 
{
	
	JButton b1,b2,b3,b4;
	JPanel p1, p2, p3, p4;
	static Vector<JPanel> vect;
	
	TestPanelChanger()
	{
		init();
	}
	
	private void init()
	{
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);
		p4.add(b4);
		vect = new Vector<JPanel>();
		
		vect.add(p1);
		vect.add(p2);
		vect.add(p3);
		vect.add(p4);
		set("MyApp", vect, 640, 480, true, PanelChanger.EXIT);
		setSize(300, 200);
	}
	
	public void finishButton()
	{
		JOptionPane.showMessageDialog(this, "closing");
		System.exit(0);
	}
	
	public void cancelButton()
	{
		JOptionPane.showMessageDialog(this,"ClickedCancel");
	}
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		TestPanelChanger t = new TestPanelChanger();
	}
}