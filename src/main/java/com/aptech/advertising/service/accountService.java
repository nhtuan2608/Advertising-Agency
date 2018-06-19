package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.accountDB;
import com.aptech.advertising.entity.Account;

public class accountService implements IServiceAccount{
	accountDB accDAO = new accountDB();

	public List<Account> allAccount() throws IOException {
		return accDAO.findAll();
	}

	public boolean addAccount(Account account) throws IOException {
		return accDAO.add(account);
	}

	public Account isExistUSR(String accountName) throws IOException {
		Account usr = accDAO.find(accountName);
		return usr;
	}

	public Account isCorrectPWD(String accountName, String pwd) throws IOException {
		Account usr = accDAO.checkAccount(accountName, pwd);
		System.out.println("usr accSer: "+ usr);
		return usr;
	}

	public boolean updateUSR(Account account) throws IOException {
		return accDAO.update(account);
	}

	public boolean deleteUSR(String accountID) throws IOException {
		return accDAO.delete(accountID);
	}

	public List<Account> findAccount(String accountName) throws IOException {
		return accDAO.findObject(accountName);
	}

}
