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
		return orderDAO.add(order);
	}

	public Order isExistOrder(String OrderID) throws IOException {
		return orderDAO.find(OrderID);
	}

	public Order isCorrectOrder(String AccountID, String customerID) throws IOException {
		return null;
	}

	public boolean updateOrder(Order order) throws IOException {
		return orderDAO.update(order);
	}

	public boolean deleteOrder(String orderID) throws IOException {
		return orderDAO.delete(orderID);
	}

	public List<Order> findOrder(String orderID) throws IOException {
		return orderDAO.findObject(orderID);
	}

	public Order isCorrectOrder(String OrderID, int AccountID, String customerID) throws IOException {
		return orderDAO.check(OrderID, AccountID, customerID);
	}

}
