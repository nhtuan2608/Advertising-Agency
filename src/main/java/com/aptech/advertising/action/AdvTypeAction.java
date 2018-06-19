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
@Action(value = "/alladvtype", results = { @Result(name = "success", location = "/WEB-INF/content/type.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class AdvTypeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<AdvType> typeALL;
	private advTypeService typeService = new advTypeService();

	
	public String execute() throws IOException {
		typeALL = typeService.allType();
		System.out.println("ds type " + typeALL);
		return SUCCESS;
	}

	public List<AdvType> getTypeALL() {
		return typeALL;
	}

	public void setTypeALL(List<AdvType> typeALL) {
		this.typeALL = typeALL;
	}

	public advTypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(advTypeService typeService) {
		this.typeService = typeService;
	}

}
