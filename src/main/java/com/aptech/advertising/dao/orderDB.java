package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aptech.advertising.entity.Order;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class orderDB implements IDB<Order, Boolean, String, Integer> {

	public Boolean add(Order o) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("OrderID", o.getOrderID());
		paramMap.put("CustomerID", o.getCustomerID());
		paramMap.put("OrderStatus", o.getOrderStatus());
		paramMap.put("AccountID", o.getAccountID());
		paramMap.put("OrderDate", o.getOrderDate());
		paramMap.put("OrderRelease", o.getOrderRelease());
		paramMap.put("PaymentStatus", o.getPaymentStatus());
		try {
			smc.insert("AdvOrder.addOrder", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean delete(String OrderID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Boolean ret = true;
		try {
			smc.delete("AdvOrder.deleteOrder", OrderID);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Boolean update(Order e) throws IOException {
		Boolean ret = true;
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("CustomerID", e.getCustomerID());
		paramMap.put("OrderStatus", e.getOrderStatus());
		paramMap.put("AccountID", e.getAccountID());
		paramMap.put("OrderDate", e.getOrderDate());
		paramMap.put("OrderRelease", e.getOrderRelease());
		paramMap.put("PaymentStatus", e.getPaymentStatus());
		
		try {
			smc.update("AdvOrder.updateOrder", paramMap);
			ret = true;
		} catch (SQLException ex) {
			ex.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Order find(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Order checkAccount(String k, String l) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Order> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Order> orderList = null;
		try {
			orderList = (List<Order>) smc.queryForList("AdvOrder.getALLOrder");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}

	@SuppressWarnings("unchecked")
	public List<Order> findObject(String orderID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Order> orderList = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("OrderID", orderID);
		try {
			orderList = (List<Order>) smc.queryForList("AdvOrder.findOrderByID",paramMap);
			System.out.println(orderList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}

	public Order check(String OrderID, Integer AccountID, String customerID) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
