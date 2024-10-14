package com.hexaware.cc.service;

import com.hexaware.cc.dao.CustomerDaoImp;
import com.hexaware.cc.dao.ICustomerDao;
import com.hexaware.cc.entity.Customer;

public class CustomerServiceImp implements ICustomer{
	
	private ICustomerDao dao;
	
	public CustomerServiceImp() {
		dao = new CustomerDaoImp();
	}

	@Override
	public Customer getCustomerById(int customerId) {
	
		return dao.getCustomerById(customerId);
	}

	@Override
	public Customer getCustomerByUsername(String username) {
		return dao.getCustomerByUsername(username);
	}

	@Override
	public int registerCustomer(Customer customerData) {
		return dao.registerCustomer(customerData);
	}

	@Override
	public int updateCustomer(Customer customerData) {
		return dao.updateCustomer(customerData);
	}

	@Override
	public int deleteCustomer(int customerId) {
		return dao.deleteCustomer(customerId);
	}
	
}