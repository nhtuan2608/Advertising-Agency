package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.OrderDetail;


public interface IServiceOrderDetail {
	List<OrderDetail> allDetail() throws IOException;
	boolean addDetail(OrderDetail type) throws IOException;
	OrderDetail isExistDetail(String detailName) throws IOException;
    boolean updateDetail (OrderDetail detail) throws IOException;
    boolean deleteDetail (String detailID) throws IOException;
}
