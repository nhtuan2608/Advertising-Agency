package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.aptech.advertising.entity.Advertising;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class advertisingDB implements IDB<Advertising, Boolean, String, Integer>{

	public Boolean add(Advertising e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean update(Advertising e) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Advertising find(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Advertising checkAccount(String k, String l) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Advertising> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Advertising> advList = null;
		try {
			advList = (List<Advertising>) smc.queryForList("Advertising.getALLAdv");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return advList;
	}

	public List<Advertising> findObject(String k) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Advertising check(String k, Integer i, String m) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
