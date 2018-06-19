package com.aptech.advertising.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private int accountid;
	private String userName;
	private String password;
	private String role;
	List<Account> accList;

	public Account() {
		this.accList = new ArrayList<Account>();
	}

	public Account(int accountid, String userName, String password, String role) {
		this.accountid = accountid;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public Account(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public List<Account> getAccList() {
		return accList;
	}

	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}