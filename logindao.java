package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnection.dbinfo;
import javabean.loginbean;
import lishner.loginlistner;

public class logindao {
	public void  userlogin(String name,String pass){
		//System.out.println(loginbean.getUname());
		try {
			Connection con =dbinfo.getConnection();
			PreparedStatement ps=con.prepareStatement("select name,pass from user where name=?");
			
		
		ps.setString(1,name);
		//ps.setString(2,loginbean.getPass());
		ResultSet rs = ps.executeQuery();
		String uname = null,pass1=null;
		String orgname,orgpass;
		
		while(rs.next()) {
			   uname=rs.getString(1);                                             
			   pass1=rs.getString(2);
			   System.out.println(pass1);
			}
	if(pass1.equals(pass)){
	System.out.println("valid");
			
		}
		else  {
			System.out.println("invalid");
			}
			
		
		
	}catch(Exception e) {
		e.printStackTrace();}
	}



}
