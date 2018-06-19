package com.aptech.advertising.action;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.actionfrom.LoginActionForm;
import com.aptech.advertising.entity.Account;
import com.aptech.advertising.service.accountService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/result", results = { @Result(name = "success", location = "/WEB-INF/content/user.jsp"),
        @Result(name = "error", location = "/WEB-INF/content/login.jsp") })

public class ResultAction extends ActionSupport {
    private String accountName;
	private String pwd;
    private String messageErr;
    private accountService accService = new accountService();
	private static final long serialVersionUID = 1L;
    
    private LoginActionForm form = new LoginActionForm();
    List<Account> userALL;
    Account user;
    public static String getDateNow;

    
    
    public String execute() throws IOException {
    	user = accService.isCorrectPWD(accountName, pwd);
    	getDate();
       if (user == null){
            messageErr = "In validate username and password.";
            return ERROR;
        } else {
            userALL = accService.allAccount();
            return SUCCESS;
        }

    }

    private String getDate() {
    	Calendar now = Calendar.getInstance();
    	int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
    	String dayOfMonthStr = String.valueOf(dayOfMonth);
    	int month = now.get(Calendar.MONTH);
    	String monthStr = "0"+String.valueOf(month);
    	String year = String.valueOf(now.get(Calendar.YEAR));
    	String datenow = dayOfMonthStr+"/"+monthStr+"/"+year;
    	System.out.print(datenow);
    	getDateNow = "CA"+ year + monthStr + dayOfMonthStr; 
    	System.out.println(getDateNow);
		return getDateNow;
    	
    }
    
    
	public static String getGetDateNow() {
		return getDateNow;
	}

	public static void setGetDateNow(String getDateNow) {
		ResultAction.getDateNow = getDateNow;
	}

	public Account getUser() {
		return user;
	}


	public void setUser(Account user) {
		this.user = user;
	}


	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
    public String getMessageErr() {
        return messageErr;
    }

    public void setMessageErr(String messageErr) {
        this.messageErr = messageErr;
    }

    public LoginActionForm getLoginActionForm() {
        return form;
    }

    public LoginActionForm getForm() {
        return form;
    }

    public void setForm(LoginActionForm form) {
        this.form = form;
    }

    public List<Account> getUserALL() {
        return userALL;
    }

    public void setUserALL(List<Account> userALL) {
        this.userALL = userALL;
    }

}
