package com.aptech.advertising.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderDetail implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int orderDetailID;
	private int advertisingID;
	private int quantityOrder;
	private int priceOrder;
	private String statusOrder;
	private int orderID;
	private List<OrderDetail> accDetail;
	
	public OrderDetail() {
		this.accDetail = new ArrayList<OrderDetail>();
	}

	
	public List<OrderDetail> getAccDetail() {
		return accDetail;
	}


	public void setAccDetail(List<OrderDetail> accDetail) {
		this.accDetail = accDetail;
	}


	public OrderDetail(int orderDetailID, int advertisingID, int quantityOrder, int priceOrder, String statusOrder,
			int orderID) {
		super();
		this.orderDetailID = orderDetailID;
		this.advertisingID = advertisingID;
		this.quantityOrder = quantityOrder;
		this.priceOrder = priceOrder;
		this.statusOrder = statusOrder;
		this.orderID = orderID;
	}

	public OrderDetail(int advertisingID, int quantityOrder, int priceOrder, String statusOrder, int orderID) {
		super();
		this.advertisingID = advertisingID;
		this.quantityOrder = quantityOrder;
		this.priceOrder = priceOrder;
		this.statusOrder = statusOrder;
		this.orderID = orderID;
	}

	public int getOrderDetailID() {
		return orderDetailID;
	}

	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}

	public int getAdvertisingID() {
		return advertisingID;
	}

	public void setAdvertisingID(int advertisingID) {
		this.advertisingID = advertisingID;
	}

	public int getQuantityOrder() {
		return quantityOrder;
	}

	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public int getPriceOrder() {
		return priceOrder;
	}

	public void setPriceOrder(int priceOrder) {
		this.priceOrder = priceOrder;
	}

	public String getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(String statusOrder) {
		this.statusOrder = statusOrder;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
}
