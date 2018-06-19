package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Order;

public interface IServiceOrder {
	List<Order> allOrder() throws IOException;
	boolean addOrder(Order order) throws IOException;
	Order isExistOrder(String customerID) throws IOException;
	Order isCorrectOrder(String AccountID,String customerID) throws IOException;
    boolean updateOrder (Order order) throws IOException;
    boolean deleteOrder (String orderID) throws IOException;
}
