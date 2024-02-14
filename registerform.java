package registerform;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lishner.registerlistner;

public class registerform {
		public JFrame jf;
		public JButton register,cancel;
		public JTextField txt1,txt2,txt3,txt4;
		public JLabel lb1,lb2,lb3,lb4;
		public registerform(){
		
			jf = new JFrame("register form");
			jf.setResizable(false);
			jf.setBackground(Color.yellow);
			jf.setSize(300,300);
			jf.setResizable(true);
			jf.setVisible(true);
			jf.setBackground(Color.BLUE);
			register=new JButton("register");
			cancel = new JButton("cancel");
			register.setBackground(Color.CYAN);
			cancel.setBackground(Color.CYAN);
			txt1 = new JTextField(10);
			txt1.setBackground(Color.green);
		
			txt2 = new JTextField(10);
			txt3 = new JTextField(10);
			txt4=new JTextField(10);
			
			txt2.setBackground(Color.green);
			txt3.setBackground(Color.green);
			txt4.setBackground(Color.green);
			lb1 = new JLabel("enter user name");
			lb2 = new JLabel("enter user pass");
			lb3 = new JLabel("confirm pass");
			lb4 = new JLabel("mobile number");
			jf.setLocation(500,300);
			jf.setLayout(new FlowLayout());
			lb1.setBackground(Color.RED);
			//jf.setUndecorated(true);
			jf.setExtendedState(300);
			//jf.setBackground(Color.red );
			jf.add(lb1);
			jf.add(txt1);
			jf.add(lb2);
			jf.add(txt2);
			jf.add(lb3);
			jf.add(txt3);
			jf.add(lb4);
			jf.add(txt4);
			jf.add(register);
			jf.add(cancel);
			registerlistner r = new registerlistner(this);
			register.addActionListener(r);
			cancel.addActionListener(r);
				}
			
}
