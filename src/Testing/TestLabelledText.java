package Testing;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.bsiet.combinations.*;

class TestLabelledText extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	LabelledText lt;
	JTextField b;
	
	TestLabelledText()
	{
		super("Test LabelledText");
		init();
	}
	
	private void init()
	{
		lt = new LabelledText("Label1",false);
		lt.setSampleText("This is SAMPLE TEXT");
		add(lt);
		b = new JTextField("Ok",10);
		add(b);
		b.addActionListener(this);
		setLayout(new FlowLayout());
		
		
		System.out.println("Sample Text:\t"+lt.getSampleText());
		System.out.println("Label:\t"+lt.getLabel());
		lt.setColumns(40);
		lt.setLabel("MyLabel");
		System.out.println("Columns\t"+lt.getColumns());
		System.out.println("Offset\t"+lt.getScrollOffset());
		System.out.println("Alignment\t"+lt.getHorizontalAlignment());
		lt.setHorizontalAlignment(LabelledText.CENTER);
		
		lt.addActionListener(this);
		lt.setText("my new text");
		lt.setLabel(lt.getText());
		//JTextField t1 = new JTextField(30);
		//t1.setText("sdgdfhdf");
		//t1.setFont(new Font("Arial", Font.BOLD, 14));
		//add(t1);
		lt.setTextFont(new Font("Arial", Font.BOLD, 14));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = ((JComponent)e.getSource()).getParent();
		if(source.equals(lt))
		{
			lt.setLabel(lt.getText());
		}
		
		if(source.equals(b))
		{
			lt.setText(b.getText());
		}
	}
	
	public static void main(String[] args)
	{
		TestLabelledText tx = new TestLabelledText();
		tx.setVisible(true);
		tx.setSize(460, 340);
		tx.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}