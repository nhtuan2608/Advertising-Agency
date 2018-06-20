package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aptech.advertising.entity.AdvType;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class advTypeDB implements IDB<AdvType, Boolean, String, Integer> {

	public Boolean add(AdvType type) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("advertisingTypeID", type.getAdvertisingTypeID());
		paramMap.put("nameType", type.getNameType());
		paramMap.put("createDateType", type.getCreateDateType());
		try {
			smc.insert("AdvType.addType", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean delete(String advertisingTypeID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Boolean ret = true;
		try {
			smc.delete("AdvType.deleteType", advertisingTypeID);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Boolean update(AdvType type) throws IOException {
		Boolean ret = true;
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("advertisingTypeID", type.getAdvertisingTypeID());
		paramMap.put("nameType", type.getNameType());
		paramMap.put("createDateType", type.getCreateDateType());
		try {
			smc.update("AdvType.updateType", paramMap);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public AdvType find(String advertisingTypeID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		AdvType type = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("advertisingTypeID", advertisingTypeID);
		try {
			type = (AdvType) smc.queryForObject("AdvType.findTypeByID", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return type;
	}

	public AdvType checkAccount(String advertisingTypeID, String nameType) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		AdvType type = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("advertisingTypeID", advertisingTypeID);
		paramMap.put("nameType", nameType);
		try {
			type = (AdvType) smc.queryForObject("AdvType.findType", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return type;
	}

	@SuppressWarnings("unchecked")
	public List<AdvType> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<AdvType> advList = null;
		try {
			advList = (List<AdvType>) smc.queryForList("AdvType.getALLType");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return advList;
	}

	@SuppressWarnings("unchecked")
	public List<AdvType> findObject(String advertisingTypeID) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<AdvType> advList = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("advertisingTypeID", advertisingTypeID);
		try {
			advList = (List<AdvType>) smc.queryForList("AdvType.findTypeByID", paramMap);
			System.out.println(advList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return advList;
	}

	public AdvType check(String k, Integer i, String m) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
