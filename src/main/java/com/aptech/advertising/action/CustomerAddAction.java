package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Customer;
import com.aptech.advertising.service.customerService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value="/")
@Action(value = "/addCustomer", results = { @Result(name = "success", location = "/WEB-INF/content/customer.jsp"),
        @Result(name = "error", location = "/WEB-INF/content/customer.jsp") })
public class CustomerAddAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String customerID;
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhone;
	private String customerStatus;
	private String msg;
	private List<Customer> customerList;
	private customerService cusService = new customerService();
	
	public String execute() throws IOException {
        if (StringUtils.isBlank(customerName)) {
            msg = "Customer's name is empty pls provide.";
        }
        else if (StringUtils.isBlank(customerAddress)) {
        	msg = "Customer's address is empty pls provide.";
        }
        else if (StringUtils.isBlank(customerEmail)) {
        	msg = "Customer's Email is empty pls provide.";
        }
        else if (StringUtils.isBlank(customerPhone)) {
        	msg = "Customer's telephone is empty pls provide.";
        }
        else if (StringUtils.isBlank(customerStatus)) {
        	msg = "Customer's status is empty pls provide.";
        }
        else {
            Customer customer = null;
            customer = cusService.isExistCustomer(customerID, customerName);
            System.out.println("check user add: "+customer);
            if (customer == null) {
            	customer = new Customer(customerID, customerName, customerAddress, customerEmail, customerPhone, customerStatus);
                if (cusService.addCustomer(customer)) {
                    addActionMessage("Create User is successfully.");
                }
            } else {
            	msg = "User already exsit.";
            }
        }
        customerList = cusService.allCustomer();
        return SUCCESS;
    }

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	
	
	
}
