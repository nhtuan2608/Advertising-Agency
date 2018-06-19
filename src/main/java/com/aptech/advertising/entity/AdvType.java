package com.aptech.advertising.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdvType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String advertisingTypeID;
	private String nameType;
	private String createDateType;
	private List<AdvType> typeList;
	
	public AdvType() {
		this.typeList = new ArrayList<AdvType>();
	}

	public AdvType(String advertisingTypeID, String nameType, String createDateType) {
		this.advertisingTypeID = advertisingTypeID;
		this.nameType = nameType;
		this.createDateType = createDateType;
	}

	public AdvType(String nameType, String createDateType) {
		this.nameType = nameType;
		this.createDateType = createDateType;
	}

	
	public List<AdvType> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<AdvType> typeList) {
		this.typeList = typeList;
	}

	public String getAdvertisingTypeID() {
		return advertisingTypeID;
	}

	public void setAdvertisingTypeID(String advertisingTypeID) {
		this.advertisingTypeID = advertisingTypeID;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getCreateDateType() {
		return createDateType;
	}

	public void setCreateDateType(String createDateType) {
		this.createDateType = createDateType;
	}
	
	
	
}
