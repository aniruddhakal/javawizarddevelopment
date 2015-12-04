package Testing;
import javax.swing.JFrame;

import org.bsiet.combinations.LabelledRadioButtonsGroup;


@SuppressWarnings("serial")
class TestRadio extends JFrame
{
	LabelledRadioButtonsGroup lb;
	
	TestRadio()
	{
		String[] str = new String[]{"Button1", "Button2", "Button3", "Button4"};
		lb = new LabelledRadioButtonsGroup("Radio Buttons", str);
		add(lb);
	}
	
	public static void main(String[] args)
	{
		TestRadio t = new TestRadio();
		t.setVisible(true);
		t.setSize(640, 480);
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}