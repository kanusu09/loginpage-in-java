package loginform;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

import lishner.loginlistner;

public class loginform{
	
	public JFrame jf;
	public JButton login,cancel,register;
	public JTextField txt1,txt2;
	public JLabel lb1,lb2;
	loginform(){
	
		jf = new JFrame("login form");
		jf.setBackground(Color.yellow);
		jf.setSize(250,250);
		jf.setResizable(true);
		jf.setVisible(true);
		jf.setBackground(Color.BLUE);
		login =new JButton("login");
		cancel = new JButton("cancel");
		register = new JButton("register");
		login.setBackground(Color.CYAN);
		cancel.setBackground(Color.CYAN);
		register.setBackground(Color.CYAN);
		txt1 = new JTextField(10);
		txt1.setBackground(Color.green);
	
		txt2 = new JTextField(10);
		txt2.setBackground(Color.green);
		lb1 = new JLabel("enter user name");
		lb2 = new JLabel("enter user pass");
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
		jf.add(login);
		jf.add(cancel);
		jf.add(register);
		loginlistner l=new loginlistner(this);
		login.addActionListener(l);
		cancel.addActionListener(l);
		register.addActionListener(l);
				
	}
		
		
	public static void main(String[] args) {
		loginform g = new loginform();
		}
	}

