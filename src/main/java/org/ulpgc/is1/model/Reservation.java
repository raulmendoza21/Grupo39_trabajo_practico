package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Reservation {

	private Court court;
	private Customer customer;
	private static int Next_ID = 0;
	public final int Id;
	private Date date;
	private ArrayList<Extra> extras;

	public Reservation(Court court, Customer customer, Date date, int id, ArrayList<Extra> extras) {
		this.court = court;
		this.customer = customer;
		this.extras = new ArrayList<Extra>();
		this.date = date;
		Id = id;
	}

	public int price() {
		int extrasTotal = 0;
		for (Extra extraPrice : extras) extrasTotal += extraPrice.getPrice();
		return court.getPrice() + extrasTotal;
	}
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
