package com.hexaware.cc.test;

import com.hexaware.cc.util.DBConnUtil;
import java.sql.Connection;

public class TestDBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = DBConnUtil.getConnection();
		if(connection != null) {
			System.out.println("Database Connected Successfully");
		}else {
			System.out.println("Failed to connect to database");
		}
	}

}
