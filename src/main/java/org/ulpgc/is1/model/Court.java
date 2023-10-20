package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Court {

	public String name;
	public int price;
	private ArrayList<Reservation> reservations;
	private CourtType courtType;

	public Court(String name, int price, CourtType courtType){
		this.name = name;
		this.price = price;
		this.reservations = new ArrayList<>();
		this.courtType = courtType;
	}
	public int getPrice() {
		return price;
	}
}
