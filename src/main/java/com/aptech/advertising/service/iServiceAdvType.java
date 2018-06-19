package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Account;
import com.aptech.advertising.entity.AdvType;

public interface iServiceAdvType {
	List<AdvType> allType() throws IOException;
	List<AdvType> findObject(String accountName) throws IOException;
	boolean addType(AdvType type) throws IOException;
	AdvType findType(String typeName) throws IOException;
	AdvType findExist(String advertisingTypeID, String nameType) throws IOException;
    boolean updateType (AdvType type) throws IOException;
    boolean deleteType (String typeID) throws IOException;
}
