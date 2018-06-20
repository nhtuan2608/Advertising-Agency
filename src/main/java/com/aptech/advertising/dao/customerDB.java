package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aptech.advertising.entity.Customer;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class customerDB implements IDB<Customer, Boolean, String, Integer> {

	public Boolean add(Customer customer) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("customerID", customer.getCustomerID());
		paramMap.put("customerName", customer.getCustomerName());
		paramMap.put("customerPhone", customer.getCustomerPhone());
		paramMap.put("customerEmail", customer.getCustomerEmail());
		paramMap.put("customerAddress", customer.getCustomerAddress());
		paramMap.put("customerStatus", customer.getCustomerStatus());
		try {
			smc.insert("Users.addUser", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean delete(String customerID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Boolean ret = true;
		try {
			smc.delete("Users.deleteUser", customerID);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Boolean update(Customer customer) throws IOException {
		Boolean ret = true;
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("customerId", customer.getCustomerID());
		paramMap.put("customerName", customer.getCustomerName());
		paramMap.put("customerPhone", customer.getCustomerPhone());
		paramMap.put("customerEmail", customer.getCustomerEmail());
		paramMap.put("customerAddress", customer.getCustomerAddress());
		paramMap.put("customerStatus", customer.getCustomerStatus());
		try {
			smc.update("Users.updateUser", paramMap);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Customer find(String customerName) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Customer customer = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("customerName", customerName);
		try {
			customer = (Customer) smc.queryForObject("Users.findUser", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	public Customer checkAccount(String customerID, String customerName) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Customer customer = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("customerID", customerID);
		paramMap.put("customerName", customerName);
		try {
			customer = (Customer) smc.queryForObject("Customer.findCustomer", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Customer> customerList = null;
		try {
			customerList = (List<Customer>) smc.queryForList("Customer.getALLCustomer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findObject(String customerID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Customer> customerList = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("customerID", customerID);
		try {
			customerList = (List<Customer>) smc.queryForList("Customer.getCustomerById", paramMap);
			System.out.println(customerList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}

	public Customer check(String k, Integer i, String m) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
