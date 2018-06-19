package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.aptech.advertising.entity.Order;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class orderDB implements IDB<Order, Boolean, String> {

	public Boolean add(Order e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean update(Order e) throws IOException {
		// TODO Auto-generated method stub
		return null;
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

	public List<Order> findObject(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
