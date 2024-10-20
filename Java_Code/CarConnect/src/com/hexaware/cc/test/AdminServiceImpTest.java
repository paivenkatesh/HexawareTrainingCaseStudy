package com.hexaware.cc.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.hexaware.cc.service.*;

import com.hexaware.cc.entity.Admin;
import com.hexaware.cc.service.AdminServiceImp;
import com.hexaware.cc.service.IAdmin;

class AdminServiceImpTest {
	
	static IAdmin service;
	
	@BeforeAll
	public static void beforeAll() {
		service = new AdminServiceImp();
	}
	

	@Test
	void testGetAdminById() {
		int adminId = 1;
		
		Admin admin = service.getAdminById(adminId);
		
		assertNotNull(admin, "Admin should not be null");
		assertEquals(adminId, admin.getAdminID(), "Admin ID should match.");
		
	}
	
	@Test
	void testAdminServiceImp() {
		
	}

	

	@Test
	void testGetAdminByUsername() {
		String username = "newAdmin";
		
		Admin admin = service.getAdminByUsername(username);
		
		assertNotNull(admin, "Admin should not be null.");
		assertEquals(username, admin.getUsername(), "Username should match");
	}

	@Test
	void testRegisterAdmin() {
		Admin admin = new Admin();
		admin.setUsername("newAdmin");
	
		
		int result = service.registerAdmin(admin);
		
		assertTrue(result > 0 , "Admin should be registered successfully");
		
	}

	@Test
	void testUpdateAdmin() {
		Admin admin = new Admin();
		admin.setAdminID(1);
		admin.setUsername("updatedAdmin");
		
		int result = service.updateAdmin(admin);
		
		assertEquals(1, result, "Admin shoudl be updated Successfully");
	}

	@Test
	void testDeleteAdmin() {
		int adminId = 2;
		
		int result = service.deleteAdmin(adminId);
		
		assertEquals(1, result, "Admin should be deleted successfully");
	}

}
