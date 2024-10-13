package com.hexaware.cc.dao;

import com.hexaware.cc.entity.Admin;

public interface IAdminDao {

	    Admin getAdminById(int adminId);
	    
	    Admin getAdminByUsername(String username);
	    
	    int registerAdmin(Admin adminData);
	    
	    int updateAdmin(Admin adminData);
	    
	    int deleteAdmin(int adminId);
	
}
