package com.hexaware.cc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import com.hexaware.cc.entity.Admin;

public class AdminDaoImp implements IAdminDao {
	private Connection conn;
	
	public AdminDaoImp () {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public Admin getAdminById(int adminId) {
		 Admin admin = null;
	        try {
	            String query = "SELECT * FROM Admin WHERE AdminID = ?";
	            PreparedStatement pstmt = conn.prepareStatement(query);
	            pstmt.setInt(1, adminId);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                admin = new Admin();
	                admin.setAdminID(rs.getInt("AdminID"));
	                admin.setUsername(rs.getString("Username"));
	                admin.setPassword(rs.getString("Password"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return admin;
	}

	@Override
	public Admin getAdminByUsername(String username) {
		Admin admin = null;
        try {
            String query = "SELECT * FROM Admin WHERE Username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                admin = new Admin();
                admin.setAdminID(rs.getInt("AdminID"));
                admin.setUsername(rs.getString("Username"));
                admin.setPassword(rs.getString("Password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
	}

	@Override
	public int registerAdmin(Admin adminData) {
		int rowsAffected = 0;
        try {
            String query = "INSERT INTO Admin (Username, Password) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, adminData.getUsername());
            pstmt.setString(2, adminData.getPassword());
            rowsAffected = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
	}

	@Override
	public int updateAdmin(Admin adminData) {
		int rowsAffected = 0;
        try {
            String query = "UPDATE Admin SET Username = ?, Password = ? WHERE AdminID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, adminData.getUsername());
            pstmt.setString(2, adminData.getPassword());
            pstmt.setInt(3, adminData.getAdminID());
            rowsAffected = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
	}

	@Override
	public int deleteAdmin(int adminId) {
		int rowsAffected = 0;
        try {
            String query = "DELETE FROM Admin WHERE AdminID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, adminId);
            rowsAffected = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowsAffected;
	}


	
}
