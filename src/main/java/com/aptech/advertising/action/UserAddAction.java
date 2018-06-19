package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Account;
import com.aptech.advertising.service.accountService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/addUser", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/user.jsp") })
public class UserAddAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String role;
	private String msgPwd;
	private String msgName;
	private String msg;

	public String getMsgPwd() {
		return msgPwd;
	}

	public void setMsgPwd(String msgPwd) {
		this.msgPwd = msgPwd;
	}

	public String getMsgName() {
		return msgName;
	}

	public void setMsgName(String msgName) {
		this.msgName = msgName;
	}

	private List<Account> userALL;
	private accountService accService = new accountService();

	public String execute() throws IOException {
		if (StringUtils.isBlank(userName) && StringUtils.isBlank(password)) {
			msgName = "Username is empty please provide.";
			msgPwd = "Password is empty please provide.";
		} else if (StringUtils.isBlank(userName)) {
			msgName = "Username is empty please provide.";
		}else if (StringUtils.isBlank(password)) {
			msgPwd = "Password is empty pls provide.";
		} else {
			Account user = accService.isCorrectPWD(userName, password);
			System.out.println("check user add: " + user);
			if (user == null) {
				Account account = new Account(userName, password, role);
				if (accService.addAccount(account)) {
					addActionMessage("Create User is successfully.");
				}
			} else {
				msg = "User already exsit.";
			}
		}
		userALL = accService.allAccount();
		return SUCCESS;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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


	public List<Account> getUserALL() {
		return userALL;
	}

	public void setUserALL(List<Account> userALL) {
		this.userALL = userALL;
	}

}
