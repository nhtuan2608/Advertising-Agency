package com.aptech.advertising.service;

import java.io.IOException;
import java.util.List;

import com.aptech.advertising.entity.Advertising;

public interface IServiceAdvertising {
	List<Advertising> allAdv() throws IOException;
	boolean addAdv(Advertising adv) throws IOException;
	Advertising isExistAdv(String accountName) throws IOException;
	Advertising isCorrectAdv(String accountName,String pwd) throws IOException;
    boolean updateAdv (Advertising account) throws IOException;
    boolean deleteAdv (String advertisingID) throws IOException;
}
