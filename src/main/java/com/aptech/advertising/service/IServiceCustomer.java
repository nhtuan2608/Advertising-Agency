package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;
import com.aptech.advertising.entity.Customer;

public interface IServiceCustomer {
	List<Customer> allCustomer() throws IOException;
	List<Customer> findCustomer(String customer) throws IOException;
	boolean addCustomer(Customer customer) throws IOException;
	Customer isExistCustomer(String customerID, String customerName) throws IOException;
    boolean updateCustomer (Customer customer) throws IOException;
    boolean deleteCustomer (String customerID) throws IOException;
}
