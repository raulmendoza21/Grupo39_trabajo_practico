package org.ulpgc.is1.model;

public class Court {

	private String name;
	private int price;

	private CourtType courtType;

	public Court(String name, int price, CourtType courtType){
		this.name = name;
		this.price = price;
		this.courtType = courtType;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
