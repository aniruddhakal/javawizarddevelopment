package Testing;
import org.bsiet.combinations.*;
import org.bsiet.containers.*;

@SuppressWarnings("serial")
class TestLabelledPasswordField extends MyFrame
{
	LabelledPasswordField pass1, pass2, pass3, pass4, pass5, pass6, pass7, pass8, pass9, pass10, pass11, pass12, pass13, pass14, pass15, pass16;
	
	public TestLabelledPasswordField() {
		super("Test LabelledPasswordField", 640, 480, true, EXIT);
		init();
	}
	
	private void init()
	{
		allConstructorsTest();
	}
	
	private void allConstructorsTest()
	{
		//constructor 1 - passed
		pass1 = new LabelledPasswordField("Password:");
		add(pass1);
		
		//constructor 2 - passed
		pass2 = new LabelledPasswordField("Password:", 2);
		add(pass2);
		
		//constructor 3 - passed
		pass3 = new LabelledPasswordField("Password:", "password");
		add(pass3);
		
		//constructor 3 - passed
		pass4 = new LabelledPasswordField("Password", "password", 2);
		add(pass4);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		TestLabelledPasswordField t = new TestLabelledPasswordField();
	}
}