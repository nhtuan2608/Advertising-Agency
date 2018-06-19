package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Customer;
import com.aptech.advertising.service.customerService;
import com.opensymphony.xwork2.ActionSupport;


@ResultPath(value = "/")
@Action(value="/allcustomer" , results = { @Result(name = "success", location = "/WEB-INF/content/customer.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class CustomerAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private List<Customer> customerALL;
	private customerService cusService = new customerService();
	private String takeDate = ResultAction.getDateNow;
	
	public String getTakeDate() {
		return takeDate;
	}

	public void setTakeDate(String takeDate) {
		this.takeDate = takeDate;
	}

	public String execute() throws IOException {
		customerALL = cusService.allCustomer();
		System.out.println("ds customer "+customerALL);
		System.out.println("Today: "+ takeDate);
		return SUCCESS;
	}

	public List<Customer> getCustomerALL() {
		return customerALL;
	}

	public void setCustomerALL(List<Customer> customerALL) {
		this.customerALL = customerALL;
	}



}
