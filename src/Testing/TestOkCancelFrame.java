package Testing;

import javax.swing.JOptionPane;

import org.bsiet.containers.OkCancelFrame;


@SuppressWarnings("serial")
class TestOkCancelFrame extends OkCancelFrame
{

	public TestOkCancelFrame() {
		// TODO Auto-generated constructor stub
		super("TestOkCancel", "OkClick", "CancelClick", true, true, EXIT);
		init();
	}
	
	private void init() {
		/*setVisible(true);
		setSize(400, 400);*/
	}
	
	@Override
	public void okButton() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "OkClicked");
	}

	@Override
	public void cancelButton() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "CancelClicked");
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		TestOkCancelFrame t = new TestOkCancelFrame();
		
	}
	
	
	
}