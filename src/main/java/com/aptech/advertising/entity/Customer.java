package com.aptech.advertising.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int customerNo;
	private String customerID;
	private String customerName;
	private String customerAddress;
	private String customerEmail; 
	private String customerPhone; 
	private String customerStatus;
	private List<Customer> customerList;
	
	public Customer() {
		this.customerList = new ArrayList<Customer>();
	}

	public Customer(int customerNo,String customerID, String customerName, String customerAddress, String customerEmail, String customerPhone, String customerStatus) {
		this.customerNo = customerNo;
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerStatus = customerStatus;
	}
	public Customer(String customerID,String customerName, String customerAddress, String customerEmail, String customerPhone, String customerStatus) {
		this.customerID = customerID;
		this.customerName =customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customerStatus = customerStatus;
		this.customerEmail = customerEmail;
	}
	
	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	/**
	 * @return the customerNo
	 */
	public int getCustomerNo() {
		return customerNo;
	}
	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the customerEmail
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * @param customerEmail the customerEmail to set
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	/**
	 * @return the customerPhone
	 */
	public String getCustomerPhone() {
		return customerPhone;
	}

	/**
	 * @param customerPhone the customerPhone to set
	 */
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	/**
	 * @return the customerStatus
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}

	/**
	 * @param customerStatus the customerStatus to set
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	
@Override
	public String toString() {
		return "customerModel{" + "customerID=" + customerID + ", customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone + ", customerStatus=" + customerStatus +'}';
	}
	
}
