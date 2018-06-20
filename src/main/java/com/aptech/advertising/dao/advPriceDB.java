package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.aptech.advertising.entity.AdvPrice;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class advPriceDB implements IDB<AdvPrice, Boolean, String, Integer>{

	public Boolean add(AdvPrice e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean update(AdvPrice e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public AdvPrice find(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public AdvPrice checkAccount(String k, String l) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<AdvPrice> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<AdvPrice> advPriceList = null;
		try {
			advPriceList = (List<AdvPrice>) smc.queryForList("AdvPrice.getALLPrice");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return advPriceList;
	}

	public List<AdvPrice> findObject(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public AdvPrice check(String k, Integer i, String m) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
