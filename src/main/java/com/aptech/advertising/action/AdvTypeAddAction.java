package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.AdvType;
import com.aptech.advertising.service.advTypeService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/addType", results = { @Result(name = "success", location = "/WEB-INF/content/type.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/type.jsp") })
public class AdvTypeAddAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String AdvertisingTypeID;
	private String NameType;
	private String CreateDateType;
	private String msg;
	private List<AdvType> typeALL;
	private advTypeService typeService = new advTypeService();

	public String execute() throws IOException {
		if (StringUtils.isBlank(AdvertisingTypeID)) {
			msg = "AdvID is empty pls provide.";
		} else if (StringUtils.isBlank(NameType)) {
			msg = "Name Adv is empty pls provide.";
		} else if (StringUtils.isBlank(CreateDateType)) {
			msg = "Create Date is empty pls provide.";
		} else {
			AdvType type = null;
			type = typeService.findExist(AdvertisingTypeID, NameType);
			System.out.println("check user add: " + type);
			if (type == null) {
				type = new AdvType(AdvertisingTypeID, NameType, CreateDateType);
				if (typeService.addType(type)) {
					addActionMessage("Create Type is successfully.");
				}
			} else {
				msg = "Type already exsit.";
			}
		}
		typeALL = typeService.allType();
		return SUCCESS;
	}

	public String getAdvertisingTypeID() {
		return AdvertisingTypeID;
	}

	public void setAdvertisingTypeID(String advertisingTypeID) {
		AdvertisingTypeID = advertisingTypeID;
	}

	public String getNameType() {
		return NameType;
	}

	public void setNameType(String nameType) {
		NameType = nameType;
	}

	public String getCreateDateType() {
		return CreateDateType;
	}

	public void setCreateDateType(String createDateType) {
		CreateDateType = createDateType;
	}

	public List<AdvType> getTypeALL() {
		return typeALL;
	}

	public void setTypeALL(List<AdvType> typeALL) {
		this.typeALL = typeALL;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public advTypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(advTypeService typeService) {
		this.typeService = typeService;
	}

}
