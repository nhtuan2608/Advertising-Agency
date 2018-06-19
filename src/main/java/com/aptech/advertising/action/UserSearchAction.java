package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Account;
import com.aptech.advertising.service.accountService;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
@ResultPath(value = "/")
@Action(value = "/searchUser", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/user.jsp") })
public class UserSearchAction extends ActionSupport {

	private String searchUser;
	private List<Account> userALL;
	private accountService accService = new accountService();
	private String msg;
	private int refresh;
	

	public String execute() throws IOException {
		if(searchUser.trim().equals(""))
		{
			msg = "Nothing to search.";
		}
		if(!searchUser.trim().equals(""))
		{
			userALL = accService.findAccount(searchUser.trim());
			System.out.println(userALL);
		}
		if(refresh == 1) {
			msg = "";
			userALL = accService.allAccount();
		}
        return SUCCESS;
	}
	public int getRefresh() {
		return refresh;
	}

	public void setRefresh(int refresh) {
		this.refresh = refresh;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getSearchUser() {
		return searchUser;
	}

	public void setSearchUser(String searchUser) {
		this.searchUser = searchUser;
	}

	public List<Account> getUserALL() {
		return userALL;
	}

	public void setUserALL(List<Account> userALL) {
		this.userALL = userALL;
	}


}
