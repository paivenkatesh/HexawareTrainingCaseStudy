package com.hexaware.cc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import com.hexaware.cc.entity.Admin;
import com.hexaware.cc.util.DBConnUtil;
import com.hexaware.cc.util.DBUtil;

public class AdminDaoImp implements IAdminDao {
    private Connection conn;
    
    public AdminDaoImp() {
    	conn = DBConnUtil.getConnection();
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
                admin.setFirstName(rs.getString("FirstName"));
                admin.setLastName(rs.getString("LastName"));
                admin.setEmail(rs.getString("Email"));
                admin.setPhoneNumber(rs.getString("PhoneNumber"));
                admin.setUsername(rs.getString("Username"));
                admin.setPassword(rs.getString("Password"));
                admin.setRole(rs.getString("Role"));
                admin.setJoinDate(rs.getDate("JoinDate"));
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
                admin.setFirstName(rs.getString("FirstName"));
                admin.setLastName(rs.getString("LastName"));
                admin.setEmail(rs.getString("Email"));
                admin.setPhoneNumber(rs.getString("PhoneNumber"));
                admin.setUsername(rs.getString("Username"));
                admin.setPassword(rs.getString("Password"));
                admin.setRole(rs.getString("Role"));
                admin.setJoinDate(rs.getDate("JoinDate"));
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
            String query = "INSERT INTO Admin (FirstName, LastName, Email, PhoneNumber, " +
                          "Username, Password, Role, JoinDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, adminData.getFirstName());
            pstmt.setString(2, adminData.getLastName());
            pstmt.setString(3, adminData.getEmail());
            pstmt.setString(4, adminData.getPhoneNumber());
            pstmt.setString(5, adminData.getUsername());
            pstmt.setString(6, adminData.getPassword());
            pstmt.setString(7, adminData.getRole());
            pstmt.setDate(8, adminData.getJoinDate());
            
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
            String query = "UPDATE Admin SET FirstName = ?, LastName = ?, Email = ?, " +
                          "PhoneNumber = ?, Username = ?, Password = ?, Role = ?, " +
                          "JoinDate = ? WHERE AdminID = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, adminData.getFirstName());
            pstmt.setString(2, adminData.getLastName());
            pstmt.setString(3, adminData.getEmail());
            pstmt.setString(4, adminData.getPhoneNumber());
            pstmt.setString(5, adminData.getUsername());
            pstmt.setString(6, adminData.getPassword());
            pstmt.setString(7, adminData.getRole());
            pstmt.setDate(8, adminData.getJoinDate());
            pstmt.setInt(9, adminData.getAdminID());
            
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