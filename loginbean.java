package javabean;
import lishner.*;

public class loginbean {
	private String uname,pass;

	public loginbean(String name, String pass) {
		this.setUname(name);
		this.setPass(pass);
		// TODO Auto-generated constructor stub
	}

 

	public String getUname() {
		return uname;
	}

	public void setUname(String name) {
		this.uname = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
