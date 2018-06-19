package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.orderDetailDB;
import com.aptech.advertising.entity.OrderDetail;

public class orderDetailService implements IServiceOrderDetail{

	orderDetailDB orderDetailDAO = new orderDetailDB();
	public List<OrderDetail> allDetail() throws IOException {
		return orderDetailDAO.findAll();
	}

	public boolean addDetail(OrderDetail type) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public OrderDetail isExistDetail(String detailName) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateDetail(OrderDetail detail) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteDetail(String detailID) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
