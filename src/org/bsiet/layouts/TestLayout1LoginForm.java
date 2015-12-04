package org.bsiet.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestLayout1LoginForm extends JFrame {

	/**
	 * @param args
	 */
	JLabel nameLabel, passwdLabel;
	JPasswordField passwd;
	JTextField userName;
	JButton ok, cancel;
	
	public TestLayout1LoginForm() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init()
	{
		nameLabel = new JLabel("Username");
		passwdLabel = new JLabel("Password");
		passwd = new JPasswordField(10);
		userName = new JTextField(10);
		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		
		Object[] arr1 = {nameLabel, userName};
		Object[] arr2 = {passwdLabel, passwd};
		Object[] arr3 = {ok, cancel};
		
		NawinLayout l1 = new NawinLayout(arr1, false);
		NawinLayout l2 = new NawinLayout(arr2, false);
		NawinLayout l3 = new NawinLayout(arr3, false);
		
		Object[] arr4 = {l1, l2, l3};
		NawinLayout l4 = new NawinLayout(arr4, true);
		add(l4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLayout1LoginForm test = new TestLayout1LoginForm();
		test.setVisible(true);
		test.setSize(200, 200);
		test.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
