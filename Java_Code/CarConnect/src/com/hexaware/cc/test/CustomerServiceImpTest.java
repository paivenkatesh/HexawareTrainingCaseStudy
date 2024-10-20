package com.hexaware.cc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.hexaware.cc.entity.*;
import com.hexaware.cc.dao.ICustomerDao;
import com.hexaware.cc.service.CustomerServiceImp;
import com.hexaware.cc.service.ICustomer;

class CustomerServiceImpTest {
	
	static ICustomer service;
	
	@BeforeAll
	public static void beforeAll() {
		service = new CustomerServiceImp();
	}
	
	
	@Test
	void testCustomerServiceImp() {
		
	}

	@Test
	void testGetCustomerById() {
		
	}

	@Test
	void testGetCustomerByUsername() {
		Customer customer = service.getCustomerByUsername("Venky");
	}

	@Test
	void testRegisterCustomer() {
	
	}

	@Test
	void testUpdateCustomer() {
		
	}

	@Test
	void testDeleteCustomer() {
		
	}

}
