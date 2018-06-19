package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.Advertising;
import com.aptech.advertising.service.advService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/alladv", results = { @Result(name = "success", location = "/WEB-INF/content/advertising.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class AdvAction extends ActionSupport{
		private static final long serialVersionUID = 1L;

		private List<Advertising> advALL;
		private advService advService = new advService();

		public String execute() throws IOException {
			advALL = advService.allAdv();
			System.out.println("ds Adv " + advALL);
			return SUCCESS;
		}

		public List<Advertising> getAdvALL() {
			return advALL;
		}

		public void setAdvALL(List<Advertising> advALL) {
			this.advALL = advALL;
		}

		public advService getAdvService() {
			return advService;
		}

		public void setAdvService(advService advService) {
			this.advService = advService;
		}
		
		
}
