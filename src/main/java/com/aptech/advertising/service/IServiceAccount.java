package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Account;

public interface IServiceAccount {
	List<Account> allAccount() throws IOException;
	List<Account> findAccount(String accountName) throws IOException;
	boolean addAccount(Account account) throws IOException;
	Account isExistUSR(String accountName) throws IOException;
	Account isCorrectPWD(String accountName,String pwd) throws IOException;
    boolean updateUSR (Account account) throws IOException;
    boolean deleteUSR (String accountID) throws IOException;
}
