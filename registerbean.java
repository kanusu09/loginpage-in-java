package javabean;

public class registerbean {
	private String name,pass,confirmpass;
	private int mobile;
	public registerbean(String name,String pass,String confirmpass,int mobile ) {
		this.setName(name);
		this.setPass(pass);
		this.setConfirmpass(confirmpass);
		this.setMobile(mobile);
	}
			

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}

	public String getPass() {
		return pass;
	}

	public  void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
