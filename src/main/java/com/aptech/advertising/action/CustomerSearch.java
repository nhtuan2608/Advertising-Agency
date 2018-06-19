package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Customer;
import com.aptech.advertising.service.customerService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
@Action(value = "/searchCustomer", results = { @Result(name = "success", location = "/WEB-INF/content/customer.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/customer.jsp") })
public class CustomerSearch extends ActionSupport{

		private String searchCustomer;
		private List<Customer> customerALL;
		private customerService cusService = new customerService();
		private String msgSearch;
		

		public String execute() throws IOException {
			if(searchCustomer.trim().equals(""))
			{
				msgSearch = "Nothing to search.";
			}
			if(!searchCustomer.trim().equals(""))
			{
				customerALL = cusService.findCustomer(searchCustomer.trim());
				System.out.println(customerALL);
			}
	        return SUCCESS;
		}


		public String getSearchCustomer() {
			return searchCustomer;
		}


		public void setSearchCustomer(String searchCustomer) {
			this.searchCustomer = searchCustomer;
		}


		public List<Customer> getCustomerALL() {
			return customerALL;
		}


		public void setCustomerALL(List<Customer> customerALL) {
			this.customerALL = customerALL;
		}


		public String getMsgSearch() {
			return msgSearch;
		}


		public void setMsgSearch(String msgSearch) {
			this.msgSearch = msgSearch;
		}
	
}
