package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.AdvType;
import com.aptech.advertising.service.advTypeService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
@Action(value = "/searchType", results = { @Result(name = "success", location = "/WEB-INF/content/type.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/type.jsp") })
public class AdvTypeSearchAction extends ActionSupport {

	private String searchType;
	private List<AdvType> typeALL;
	private advTypeService typeService = new advTypeService();
	private String msgSearch;

	public String execute() throws IOException {
		if (searchType.trim().equals("")) {
			msgSearch = "Nothing to search.";
		}
		if (!searchType.trim().equals("")) {
			typeALL = typeService.findObject(searchType.trim());
			if(typeALL.size() <= 0 )
			{
				msgSearch = "No exist";
			}
			System.out.println(typeALL);
		}
		return SUCCESS;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public List<AdvType> getTypeALL() {
		return typeALL;
	}

	public void setTypeALL(List<AdvType> typeALL) {
		this.typeALL = typeALL;
	}

	public String getMsgSearch() {
		return msgSearch;
	}

	public void setMsgSearch(String msgSearch) {
		this.msgSearch = msgSearch;
	}

}
