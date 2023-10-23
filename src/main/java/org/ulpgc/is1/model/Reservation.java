package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Reservation {

	private Court court;
	private Customer customer;
	private static int Next_ID = 0;
	public final int Id;
	private LocalDate date;
	private ArrayList<Extra> extras;

	public Reservation(Court court, Customer customer, LocalDate date) {
		this.court = court;
		this.customer = customer;
		this.extras = new ArrayList<Extra>();
		this.date = date;
		Id = Next_ID;
		Next_ID += 1;
	}

	public int price() {
		int extrasTotal = 0;
		for (Extra extraPrice : extras) extrasTotal += extraPrice.getPrice();
		return court.getPrice() + extrasTotal;
	}
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void addExtra(Extra extra) {
		this.extras.add(extra);
	}
}
