package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.customerDB;
import com.aptech.advertising.entity.Customer;


public class customerService implements IServiceCustomer{

	customerDB customerDAO = new customerDB();
	public List<Customer> allCustomer() throws IOException {
		return customerDAO.findAll();
	}
	public List<Customer> findCustomer(String customerID) throws IOException {
		return customerDAO.findObject(customerID);
	}
	public boolean addCustomer(Customer customer) throws IOException {
		return customerDAO.add(customer);
	}

	public Customer isExistCustomer(String customerID, String customerName) throws IOException {
		Customer cus = customerDAO.checkAccount(customerID, customerName);
		return cus;
	}

	public boolean updateCustomer(Customer customer) throws IOException {
		return customerDAO.update(customer);
	}

	public boolean deleteCustomer(String customerID) throws IOException {
		return customerDAO.delete(customerID);
	}
}
