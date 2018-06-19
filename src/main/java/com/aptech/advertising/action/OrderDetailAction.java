package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.OrderDetail;
import com.aptech.advertising.service.orderDetailService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value="/alldetail" , results = { @Result(name = "success", location = "/WEB-INF/content/detail.jsp"),
			@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class OrderDetailAction extends ActionSupport{
		private static final long serialVersionUID = 1L;

		private List<OrderDetail> detailALL;
		private orderDetailService detailService = new orderDetailService();

		public String execute() throws IOException {
			detailALL = detailService.allDetail();
			System.out.println("ds customer "+detailALL);
			return SUCCESS;
		}

		public List<OrderDetail> getDetailALL() {
			return detailALL;
		}

		public void setDetailALL(List<OrderDetail> detailALL) {
			this.detailALL = detailALL;
		}

		public orderDetailService getDetailService() {
			return detailService;
		}

		public void setDetailService(orderDetailService detailService) {
			this.detailService = detailService;
		}

}
