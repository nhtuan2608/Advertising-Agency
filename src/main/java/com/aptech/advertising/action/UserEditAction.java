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
@Action(value = "/editUser", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/user.jsp") })
public class UserEditAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String role;
	private String smg;
	private List<Account> userALL;
	private accountService accService = new accountService();

	public String execute() throws IOException {
		Account user = accService.isExistUSR(userName);
		System.out.println("user: "+user);
		if (user != null) {
			userName = user.getUserName();
			password = user.getPassword();
			role = user.getRole();

			user = new Account(userName, password, role);
			System.out.println("user to add: "+user);
			if (accService.updateUSR(user)) {
				addActionMessage("Update successfully.");
			}

		}
		userALL = accService.allAccount();
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public accountService getAccService() {
		return accService;
	}

	public void setAccService(accountService accService) {
		this.accService = accService;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSmg() {
		return smg;
	}

	public void setSmg(String smg) {
		this.smg = smg;
	}

	public List<Account> getUserALL() {
		return userALL;
	}

	public void setUserALL(List<Account> userALL) {
		this.userALL = userALL;
	}

}
