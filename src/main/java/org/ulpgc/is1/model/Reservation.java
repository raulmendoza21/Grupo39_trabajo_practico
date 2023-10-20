package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class Reservation {

	private Court court;
	private Customer customer;
	private static int Next_ID = 0;
	public final int Id;
	public Date date;
	private ArrayList<Extra> extras;

	public Reservation(Court court, Customer customer, Date date, ArrayList<Extra> extras) {
		this.court = court;
		this.customer = customer;
		this.extras = new ArrayList<Extra>();
		this.date = date;
		Id = Next_ID;
		Next_ID += 1;
	}
	//public int price();/ arreglar esto
}
