package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.advertisingDB;
import com.aptech.advertising.entity.Advertising;

public class advService implements IServiceAdvertising{

	advertisingDB advertisingDAO = new advertisingDB();
	public List<Advertising> allAdv() throws IOException {
		return advertisingDAO.findAll();
	}

	public boolean addAdv(Advertising adv) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public Advertising isExistAdv(String accountName) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public Advertising isCorrectAdv(String accountName, String pwd) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateAdv(Advertising account) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAdv(String advertisingID) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
