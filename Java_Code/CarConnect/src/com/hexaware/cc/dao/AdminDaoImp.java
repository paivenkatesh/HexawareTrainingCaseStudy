package com.hexaware.cc.dao;

import java.sql.Connection;

import com.hexaware.cc.entity.Admin;

public class AdminDaoImp implements IAdminDao {
	private Connection conn;
	
	public AdminDaoImp () {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerAdmin(Admin adminData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmin(Admin adminData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
