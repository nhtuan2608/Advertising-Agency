package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Account;
import com.aptech.advertising.service.accountService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/deleteUser", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/user.jsp") })
public class UserDeleteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String accountId;
	private List<Account> userALL;
	private accountService accService = new accountService();

	public String execute() throws IOException {
		if (accService.deleteUSR(accountId)) {
			addActionMessage("Delete successfully.");
		}
		userALL = accService.allAccount();
		return SUCCESS;
	}

	public List<Account> getUserALL() {
		return userALL;
	}

	public void setUserALL(List<Account> userALL) {
		this.userALL = userALL;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public accountService getAccService() {
		return accService;
	}

	public void setAccService(accountService accService) {
		this.accService = accService;
	}

}
