package com.aptech.advertising.entity;

import java.io.Serializable;

public class Advertising implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int advertisingID;
	private String description;
	private String imageAdv;
	private String createDateAdv;
	private int quantityAdv;
	private int AdvertisingPriceID;
	private String AdvertisingTypeID;
	
	public Advertising() {
		
	}

	public Advertising(int advertisingID, String description, String imageAdv, String createDateAdv, int quantityAdv,
			int advertisingPriceID, String advertisingTypeID) {
		this.advertisingID = advertisingID;
		this.description = description;
		this.imageAdv = imageAdv;
		this.createDateAdv = createDateAdv;
		this.quantityAdv = quantityAdv;
		this.AdvertisingPriceID = advertisingPriceID;
		this.AdvertisingTypeID = advertisingTypeID;
	}

	public Advertising(String description, String imageAdv, String createDateAdv, int quantityAdv,
			int advertisingPriceID, String advertisingTypeID) {
		this.description = description;
		this.imageAdv = imageAdv;
		this.createDateAdv = createDateAdv;
		this.quantityAdv = quantityAdv;
		this.AdvertisingPriceID = advertisingPriceID;
		this.AdvertisingTypeID = advertisingTypeID;
	}

	public int getAdvertisingID() {
		return advertisingID;
	}

	public void setAdvertisingID(int advertisingID) {
		this.advertisingID = advertisingID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageAdv() {
		return imageAdv;
	}

	public void setImageAdv(String imageAdv) {
		this.imageAdv = imageAdv;
	}

	public String getCreateDateAdv() {
		return createDateAdv;
	}

	public void setCreateDateAdv(String createDateAdv) {
		this.createDateAdv = createDateAdv;
	}

	public int getQuantityAdv() {
		return quantityAdv;
	}

	public void setQuantityAdv(int quantityAdv) {
		this.quantityAdv = quantityAdv;
	}

	public int getAdvertisingPriceID() {
		return AdvertisingPriceID;
	}

	public void setAdvertisingPriceID(int advertisingPriceID) {
		AdvertisingPriceID = advertisingPriceID;
	}

	public String getAdvertisingTypeID() {
		return AdvertisingTypeID;
	}

	public void setAdvertisingTypeID(String advertisingTypeID) {
		AdvertisingTypeID = advertisingTypeID;
	}
	
	
}
