package Testing;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.bsiet.combinations.*;
import org.bsiet.containers.*;

@SuppressWarnings("serial")
class PassTest extends MyFrame
{
	public PassTest() {
		super("jasdkf", 600, 400, true, EXIT);
		init();
	}
	
	private void init()
	{
		Icon i = new ImageIcon("Resources\\icn.png");
		LabelledText l = new LabelledText(i);
		add(l);
	}
	
	public static void main(String []args){
		@SuppressWarnings("unused")
		PassTest t = new PassTest();
	}
}