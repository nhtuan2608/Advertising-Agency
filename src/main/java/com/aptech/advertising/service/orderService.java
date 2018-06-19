package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.orderDB;
import com.aptech.advertising.entity.Order;

public class orderService implements IServiceOrder{

	orderDB orderDAO = new orderDB();
	public List<Order> allOrder() throws IOException {
		return orderDAO.findAll();
	}

	public boolean addOrder(Order order) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public Order isExistOrder(String customerID) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Order isCorrectOrder(String AccountID, String customerID) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateOrder(Order order) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteOrder(String orderID) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
