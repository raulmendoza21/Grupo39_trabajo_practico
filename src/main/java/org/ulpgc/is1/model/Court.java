package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Court {

	private String name;
	private int price;
	private ArrayList<Reservation> reservations;
	private CourtType courtType;

	public Court(String name, int price, ArrayList<Reservation> reservations, CourtType courtType){
		this.name = name;
		this.price = price;
		this.reservations = new ArrayList<Reservation>();
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
