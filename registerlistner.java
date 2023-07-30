package lishner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.registerdao;
import javabean.registerbean;
import registerform.registerform;

public class registerlistner implements ActionListener {
	registerform rf;
	public registerlistner(registerform registerform) {
		this.rf=registerform;	
		
	}



	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rf.register) {
			String name =rf.txt1.getText();
			String pass = rf.txt2.getText();
			String confpass =rf.txt3.getText();
			int mobile =rf.txt4.getColumns();
			registerbean l  = new registerbean(name,pass,confpass,mobile);
			registerdao r=new registerdao();
			r.userregister(l);
;		}
		else if(e.getSource()==rf.cancel) {
			rf.txt1.setText("");
			rf.txt2.setText("");
			rf.txt3.setText("");
			rf.txt4.setText("");
		}
		
		// TODO Auto-generated method stub
		
	}

}
