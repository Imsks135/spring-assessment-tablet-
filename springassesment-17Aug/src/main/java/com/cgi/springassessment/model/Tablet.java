package com.cgi.springassessment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tablet {
	  
	@Id
	private int tabletId;
	private String tabletName;
	private String manufacturer;
	private double price;
	private int quanity;
	
	@Override
	public String toString() {
		return "Tablet [tabletId=" + tabletId + ", tabletName=" + tabletName + ", manufacturer=" + manufacturer
				+ ", price=" + price + ", quanity=" + quanity + "]";
	}

	public int getTabletId() {
		return tabletId;
	}

	public void setTabletId(int tabletId) {
		this.tabletId = tabletId;
	}

	public String getTabletName() {
		return tabletName;
	}

	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	
	public Tablet() {
		//default Contructor
	}

	public Tablet(int tabletId, String tabletName, String manufacturer, double price, int quanity) {
		super();
		this.tabletId = tabletId;
		this.tabletName = tabletName;
		this.manufacturer = manufacturer;
		this.price = price;
		this.quanity = quanity;
	}
		

}
