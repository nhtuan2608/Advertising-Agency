package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Order;

public interface IServiceOrder {
	List<Order> allOrder() throws IOException;
	List<Order> findOrder(String orderID) throws IOException;
	boolean addOrder(Order order) throws IOException;
	Order isExistOrder(String OrderID) throws IOException;
	Order isCorrectOrder(String OrderID, int AccountID,String customerID) throws IOException;
    boolean updateOrder (Order order) throws IOException;
    boolean deleteOrder (String orderID) throws IOException;
}
