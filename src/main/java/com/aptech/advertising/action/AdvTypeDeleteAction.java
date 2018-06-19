package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.AdvType;
import com.aptech.advertising.service.advTypeService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/deleteType", results = { @Result(name = "success", location = "/WEB-INF/content/type.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/type.jsp") })
public class AdvTypeDeleteAction extends ActionSupport{
		private static final long serialVersionUID = 1L;
		private String AdvertisingTypeID;
		private List<AdvType> typeALL;
		private advTypeService typeService = new advTypeService();

		public String execute() throws IOException {
			if (typeService.deleteType(AdvertisingTypeID)) {
				addActionMessage("Delete successfully.");
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

		public List<AdvType> getTypeALL() {
			return typeALL;
		}

		public void setTypeALL(List<AdvType> typeALL) {
			this.typeALL = typeALL;
		}
		
}
