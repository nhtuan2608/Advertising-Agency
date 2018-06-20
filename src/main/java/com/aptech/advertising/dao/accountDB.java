package com.aptech.advertising.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aptech.advertising.entity.Account;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class accountDB implements IDB<Account, Boolean, String, Integer> {

	public Boolean add(Account usr) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", usr.getUserName());
		paramMap.put("password", usr.getPassword());
		paramMap.put("role", usr.getRole());
		try {
			smc.insert("Users.addUser", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public Boolean delete(String userId) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Boolean ret = true;
		try {
			smc.delete("Users.deleteUser", userId);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Boolean update(Account user) throws IOException {
		Boolean ret = true;
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", user.getAccountid());
		paramMap.put("username", user.getUserName());
		paramMap.put("password", user.getPassword());
		paramMap.put("role", user.getRole());
		try {
			smc.update("Users.updateUser", paramMap);
			ret = true;
		} catch (SQLException e) {
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}

	public Account find(String username) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Account user = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("username", username);
		try {
			user = (Account) smc.queryForObject("Users.findUser", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public Account checkAccount(String accountName, String password) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Account user = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userName", accountName);
		paramMap.put("password", password);
		try {
			user = (Account) smc.queryForObject("Users.getUserByUserNamePassword", paramMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<Account> findAll() throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Account> userList = null;
		try {
			userList = (List<Account>) smc.queryForList("Users.getALLUser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	@SuppressWarnings("unchecked")
	public List<Account> findObject(String username) throws IOException {
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		List<Account> userList = null;
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("userName", username);
		try {
			userList = (List<Account>) smc.queryForList("Users.findUser", paramMap);
			System.out.println(userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	public Account check(String k, Integer i, String customerID) throws IOException {
		return null;
	}

}
