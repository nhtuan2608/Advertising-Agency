package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.AdvPrice;

public interface IServiceAdvPrice {
	List<AdvPrice> allPrice() throws IOException;
	boolean addPrice(AdvPrice price) throws IOException;
	AdvPrice isExistPrice(String priceName) throws IOException;
    boolean updatePrice (AdvPrice price) throws IOException;
    boolean deletePrice (String price) throws IOException;
}
