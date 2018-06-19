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
@Action(value = "/alluser", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
        @Result(name = "error", location = "/WEB-INF/content/login.jsp") })
public class UserAction extends ActionSupport {

	private accountService accService = new accountService();
    private static final long serialVersionUID = 1L;
    private List<Account> userALL;

    public String execute() throws IOException {
    	userALL = accService.allAccount();
        return SUCCESS;
    }

    public List<Account> getUserALL() {
        return userALL;
    }

    public void setUserALL(List<Account> userALL) {
        this.userALL = userALL;
    }
    
    

}
