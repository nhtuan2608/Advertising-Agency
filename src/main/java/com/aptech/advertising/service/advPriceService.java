package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.advPriceDB;
import com.aptech.advertising.entity.AdvPrice;

public class advPriceService implements IServiceAdvPrice{
	advPriceDB advPriceDAO = new advPriceDB();
	public List<AdvPrice> allPrice() throws IOException {
		return advPriceDAO.findAll();
	}

	public boolean addPrice(AdvPrice price) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public AdvPrice isExistPrice(String accountName) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePrice(AdvPrice price) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletePrice(String price) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}

}
