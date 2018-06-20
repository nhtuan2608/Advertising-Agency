package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.aptech.advertising.entity.OrderDetail;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class orderDetailDB implements IDB<OrderDetail, Boolean, String, Integer>{

	public Boolean add(OrderDetail e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean update(OrderDetail e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetail find(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetail checkAccount(String k, String l) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<OrderDetail> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<OrderDetail> detailList = null;
		try {
			detailList = (List<OrderDetail>) smc.queryForList("orderDetail.getALLDetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detailList;
	}

	public List<OrderDetail> findObject(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDetail check(String k, Integer i, String m) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
