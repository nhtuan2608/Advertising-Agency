package com.aptech.advertising.entity;

import java.io.Serializable;

public class AdvPrice implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int advertisingPriceID;
	private String advName;
	private String advLength;
	private String advWidth;
	private String advSize;
	private int advPrice;
	private String advPosition;
	private String advPagePosition;
	private String form;
	
	public AdvPrice() {
		
	}

	public AdvPrice(int advertisingPriceID, String advName, String advLength, String advWidth,
			String advSize, int advPrice, String advPosition, String advPagePosition, String form) {
		this.advertisingPriceID = advertisingPriceID;
		this.advName = advName;
		this.advLength = advLength;
		this.advWidth = advWidth;
		this.advSize = advSize;
		this.advPrice = advPrice;
		this.advPosition = advPosition;
		this.advPagePosition = advPagePosition;
		this.form = form;
	}

	public AdvPrice(String advName, String advLength, String advWidth, String advSize, int advPrice,
			String advPosition, String advPagePosition, String form) {
		super();
		this.advName = advName;
		this.advLength = advLength;
		this.advWidth = advWidth;
		this.advSize = advSize;
		this.advPrice = advPrice;
		this.advPosition = advPosition;
		this.advPagePosition = advPagePosition;
		this.form = form;
	}

	public int getAdvertisingPriceID() {
		return advertisingPriceID;
	}

	public void setAdvertisingPriceID(int advertisingPriceID) {
		this.advertisingPriceID = advertisingPriceID;
	}

	public String getAdvName() {
		return advName;
	}

	public void setAdvName(String advName) {
		this.advName = advName;
	}

	public String getAdvLength() {
		return advLength;
	}

	public void setAdvLength(String advLength) {
		this.advLength = advLength;
	}

	public String getAdvWidth() {
		return advWidth;
	}

	public void setAdvWidth(String advWidth) {
		this.advWidth = advWidth;
	}

	public String getAdvSize() {
		return advSize;
	}

	public void setAdvSize(String advSize) {
		this.advSize = advSize;
	}

	public int getAdvPrice() {
		return advPrice;
	}

	public void setAdvPrice(int advPrice) {
		this.advPrice = advPrice;
	}

	public String getAdvPosition() {
		return advPosition;
	}

	public void setAdvPosition(String advPosition) {
		this.advPosition = advPosition;
	}

	public String getAdvPagePosition() {
		return advPagePosition;
	}

	public void setAdvPagePosition(String advPagePosition) {
		this.advPagePosition = advPagePosition;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}
		
}
