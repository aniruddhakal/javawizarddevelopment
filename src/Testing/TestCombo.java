package Testing;

import java.util.Vector;

import javax.swing.JFrame;

import org.bsiet.combinations.*;

class TestCombo extends JFrame
{
	LabelledComboBox l1;
	
	TestCombo()
	{
		Vector<Object> o = new Vector<Object>();
		o.add("Item1");
		o.add(10);
		o.add(10.4f);
		o.add('c');
		l1 = new LabelledComboBox("MyLabel", o, false);
		add(l1);
		
		int count = l1.getItemCount();
		System.out.println("Count is:\t"+count);
	}
	
	public static void main(String[] args)
	{
		TestCombo t = new TestCombo();
		t.setVisible(true);
		t.setSize(400, 400);
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}