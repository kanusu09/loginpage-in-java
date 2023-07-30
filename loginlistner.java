package lishner;

import java.awt.event.ActionListener;

import dao.logindao;
import javabean.loginbean;

import java.awt.event.ActionEvent;
import loginform.loginform;
import registerform.registerform;

public class loginlistner implements ActionListener {
	loginform loginform;
	public loginlistner(loginform loginform) {
		this.loginform=loginform;
	}
	public void  actionPerformed(ActionEvent e) {
		if(e.getSource()==loginform.login) {
			String name = loginform.txt1.getText();
			String pass = loginform.txt1.getText();
			loginbean l = new loginbean(name,pass);
			logindao ld = new logindao();
			ld.userlogin(name,pass);
			
			
		}
		else if(e.getSource()==loginform.cancel) {
			loginform.txt1.setText("");
			loginform.txt2.setText("");
		}
		else if(e.getSource()==loginform.register) {
			new registerform();
		}
	}
	
	

}
