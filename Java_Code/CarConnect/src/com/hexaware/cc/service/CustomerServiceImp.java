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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registerCustomer(Customer customerData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCustomer(Customer customerData) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}