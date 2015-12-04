package Testing;
import javax.swing.*;

import org.bsiet.combinations.LabelledList;

import java.awt.*;
public class TestLabelledList extends JFrame {
	LabelledList labelledList;
	JPanel p1;
	//public Object[]={"a",2,"dfv"};
    public TestLabelledList() 
    {
    	p1=new JPanel();
    	labelledList=new LabelledList("list");
    	p1.add(labelledList);
    	p1.setLayout(new FlowLayout());
    }
 	public static void main (String[] args) 
 	{
 		TestLabelledList t=new TestLabelledList();
 		t.setVisible(true);
 		t.setSize(200,200);
 	}    
    
}