package org.bsiet.layouts;

import javax.swing.*;

public class TestNawinLayout extends JFrame {

	/**
	 * @param args
	 */
	NawinLayout n1, n2, n3;
	public TestNawinLayout() {
		// TODO Auto-generated constructor stub
		super("TestLayout");
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");
		b5 = new JButton("Button5");
		b6 = new JButton("Button6");
		b7 = new JButton("Button7");
		b8 = new JButton("Button8");
		b9 = new JButton("Button9");
		b10 = new JButton("Button10");
		b11 = new JButton("Button11");
		b12 = new JButton("Button12");
		b13 = new JButton("Button13");
		b14 = new JButton("Button14");
		b15 = new JButton("Button15");
		
		JTextField t1 = new JTextField("Mazi",10);
		
		Object[] arr2 = {b5, b6, b7, b8};
		
		Object[] arr = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15};
		n1 = new NawinLayout(arr, false);
		
		
		/*n2 = new NawinLayout(arr2, false);*/
		
/*		Object[] arr3 = {n1, n2};
		NawinLayout n3 = new NawinLayout(arr3, true);*/
		add(n1);
	}
	
	
	public static void main(String[] args) {
		TestNawinLayout tnl = new TestNawinLayout();
		tnl.setVisible(true);
		tnl.setSize(640, 480);
		tnl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
