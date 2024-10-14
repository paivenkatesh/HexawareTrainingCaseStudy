package com.hexaware.cc.service;

import com.hexaware.cc.dao.AdminDaoImp;
import com.hexaware.cc.dao.IAdminDao;
import com.hexaware.cc.entity.Admin;


public class AdminServiceImp implements IAdmin {
	private IAdminDao adminDao;
	
	public AdminServiceImp()
	{
		this.adminDao = new AdminDaoImp();
	}

	
	@Override
	public Admin getAdminById(int adminId) {
		return adminDao.getAdminById(adminId);
	}

	@Override
	public Admin getAdminByUsername(String username) {
		return adminDao.getAdminByUsername(username);
	}

	@Override
	public int registerAdmin(Admin adminData) {
		return adminDao.registerAdmin(adminData);
	}

	@Override
	public int updateAdmin(Admin adminData) {
		return adminDao.updateAdmin(adminData);
	}

	@Override
	public int deleteAdmin(int adminId) {
		return adminDao.deleteAdmin(adminId);
	}

}
