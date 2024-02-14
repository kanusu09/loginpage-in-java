package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import databaseconnection.dbinfo;
import javabean.registerbean;

public class registerdao {
	public void  userregister(registerbean rf){
		try {
			Connection con =dbinfo.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
			
		
		ps.setString(1, rf.getName());
		ps.setString(2, rf.getPass());
		ps.setString(3, rf.getConfirmpass());
		ps.setInt(4,rf.getMobile());
		int  i = ps.executeUpdate();
		
		if(i>0) {
			                                                                   
			System.out.println("register successfull");
			}
			else {
				System.out.println("register unsuccessfull");
			}
			
		
		
	}catch(Exception e) {
		e.printStackTrace();}
	}


}
