package com.aptech.advertising.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.aptech.advertising.entity.AdvPrice;
import com.aptech.advertising.entity.Advertising;
import com.aptech.advertising.service.advPriceService;
import com.aptech.advertising.service.advService;
import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
@Action(value = "/allprice", results = { @Result(name = "success", location = "/WEB-INF/content/price.jsp"),
		@Result(name = "error", location = "/WEB-INF/content/404.html") })
public class AdvPriceAction extends ActionSupport{
			private static final long serialVersionUID = 1L;

			private List<AdvPrice> priceALL;
			private advPriceService advPriceService = new advPriceService();

			public String execute() throws IOException {
				priceALL = advPriceService.allPrice();
				System.out.println("ds Price " + priceALL);
				return SUCCESS;
			}

			public List<AdvPrice> getPriceALL() {
				return priceALL;
			}

			public void setPriceALL(List<AdvPrice> priceALL) {
				this.priceALL = priceALL;
			}
			

}
