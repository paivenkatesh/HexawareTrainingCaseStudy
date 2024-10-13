package com.hexaware.cc.dao;

import java.sql.Connection;
import java.sql.*;

import com.hexaware.cc.entity.Customer;

public class CustomerDaoImp implements ICustomerDao {
	private Connection conn;
	
	public CustomerDaoImp () {
		conn = DBUtil.getDBConnection();
	}

	 @Override
	    public Customer getCustomerById(int customerId) {
	        try {
	            String query = "SELECT * FROM Customer WHERE CustomerID = ?";
	            PreparedStatement pstmt = conn.prepareStatement(query);
	            pstmt.setLong(1, customerId);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                Customer customer = new Customer();
	                customer.setCustomerID((int) rs.getLong("CustomerID"));
	                customer.setFirstName(rs.getString("FirstName"));
	                customer.setLastName(rs.getString("LastName"));
	                customer.setEmail(rs.getString("Email"));
	                customer.setPhoneNumber(rs.getString("PhoneNumber"));
	                customer.setAddress(rs.getString("Address"));
	                customer.setUsername(rs.getString("Username"));
	                customer.setPassword(rs.getString("Password"));
	                customer.setRegistrationDate(rs.getDate("RegistrationDate"));
	                return customer;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	@Override
	public Customer getCustomerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerCustomer(Customer customerData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Customer customerData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}