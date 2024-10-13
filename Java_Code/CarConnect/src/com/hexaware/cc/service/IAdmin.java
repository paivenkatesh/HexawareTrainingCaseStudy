package com.hexaware.cc.service;


import com.hexaware.cc.entity.Admin;

public interface IAdmin {
    
    Admin getAdminById(int adminId);
    
    Admin getAdminByUsername(String username);
    
    int registerAdmin(Admin adminData);
    
    int updateAdmin(Admin adminData);
    
    int deleteAdmin(int adminId);
}