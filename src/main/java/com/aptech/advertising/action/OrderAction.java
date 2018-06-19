package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Order;
import com.aptech.advertising.service.orderService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value="/allorder" , results = { @Result(name = "success", location = "/WEB-INF/content/order.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class OrderAction extends ActionSupport{
		private static final long serialVersionUID = 1L;

		private List<Order> orderALL;
		private orderService orderService = new orderService();

		public String execute() throws IOException {
			orderALL = orderService.allOrder();
			System.out.println("ds order "+orderALL);
			return SUCCESS;
		}

		public List<Order> getOrderALL() {
			return orderALL;
		}

		public void setOrderALL(List<Order> orderALL) {
			this.orderALL = orderALL;
		}

		public orderService getOrderService() {
			return orderService;
		}

		public void setOrderService(orderService orderService) {
			this.orderService = orderService;
		}

		
}
