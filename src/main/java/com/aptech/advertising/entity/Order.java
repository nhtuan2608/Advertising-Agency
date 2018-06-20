package com.aptech.advertising.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	private int orderNo;
	private String orderID;
	private String customerID;
	private int accountID;
	private String orderStatus;
	private String orderDate;
	private String orderRelease;
	private String paymentStatus;
	private List<Order> orderList;

	public Order() {
		this.orderList = new ArrayList<Order>();
	}

	public Order(int orderNo, String orderID, String customerID, int accountID, String orderStatus, String orderDate,
			String orderRelease, String paymentStatus) {
		this.orderNo = orderNo;
		this.orderID = orderID;
		this.customerID = customerID;
		this.accountID = accountID;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderRelease = orderRelease;
		this.paymentStatus = paymentStatus;
	}

	public Order(String customerID, int accountID, String orderStatus, String orderDate, String orderRelease,
			String paymentStatus) {
		this.customerID = customerID;
		this.accountID = accountID;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.orderRelease = orderRelease;
		this.paymentStatus = paymentStatus;
	}

	public Order(String orderID, String customerID, int accountID) {
		this.orderID = orderID;
		this.customerID = customerID;
		this.accountID = accountID;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderRelease() {
		return orderRelease;
	}

	public void setOrderRelease(String orderRelease) {
		this.orderRelease = orderRelease;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
