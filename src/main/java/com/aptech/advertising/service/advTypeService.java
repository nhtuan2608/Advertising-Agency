package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.dao.advTypeDB;
import com.aptech.advertising.entity.AdvType;

public class advTypeService implements iServiceAdvType{

	advTypeDB advTypeDAO = new advTypeDB();
	public List<AdvType> allType() throws IOException {
		return advTypeDAO.findAll();
	}

	public boolean addType(AdvType type) throws IOException {
		return advTypeDAO.add(type);
	}

	public AdvType findType(String typeName) throws IOException {
		return advTypeDAO.find(typeName);
	}

	public boolean updateType(AdvType type) throws IOException {
		return advTypeDAO.update(type);
	}

	public boolean deleteType(String typeID) throws IOException {
		return advTypeDAO.delete(typeID);
	}

	public AdvType findExist(String advertisingTypeID, String nameType) throws IOException {
		return advTypeDAO.checkAccount(advertisingTypeID, nameType);
	}

	public List<AdvType> findObject(String advertisingTypeID) throws IOException {
		return advTypeDAO.findObject(advertisingTypeID);
	}

}
