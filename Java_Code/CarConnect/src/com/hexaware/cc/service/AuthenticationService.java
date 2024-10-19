package com.hexaware.cc.service;

import com.hexaware.cc.entity.Admin;
import com.hexaware.cc.entity.Customer;


public class AuthenticationService {
    private final IAdmin adminService;
    private final ICustomer customerService;

    public AuthenticationService(IAdmin adminService, ICustomer customerService) {
        this.adminService = adminService;
        this.customerService = customerService;
    }

    public boolean authenticateAdmin(String username, String password) {
        Admin admin = adminService.getAdminByUsername(username);
        return admin != null && admin.authenticate(password);
    }

    public boolean authenticateCustomer(String username, String password) {
        Customer customer = customerService.getCustomerByUsername(username);
        return customer != null && customer.authenticate(password);
    }

    public String getUserRole(String username) {
        Admin admin = adminService.getAdminByUsername(username);
        if (admin != null) {
            return "ADMIN";
        }
        Customer customer = customerService.getCustomerByUsername(username);
        if (customer != null) {
            return "CUSTOMER";
        }
        return null;
    }

    public boolean changePassword(String username, String oldPassword, String newPassword) {
        Admin admin = adminService.getAdminByUsername(username);
        if (admin != null && admin.authenticate(oldPassword)) {
            admin.setPassword(newPassword);
            adminService.updateAdmin(admin);
            return true;
        }
        
        Customer customer = customerService.getCustomerByUsername(username);
        if (customer != null && customer.authenticate(oldPassword)) {
            customer.setPassword(newPassword);
            customerService.updateCustomer(customer);
            return true;
        }
        
        return false;
    }
}