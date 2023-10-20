package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Court {

	public String name;
	public int price;
	private ArrayList<Reservation> reservations;
	private CourtType courtType;

	public Court(String name, int price, ArrayList<Reservation> reservations, CourtType courtType){
		this.name = name;
		this.price = price;
		this.reservations = new ArrayList<Reservation>();
		this.courtType = courtType;
	}
}
