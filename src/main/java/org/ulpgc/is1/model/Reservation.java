package org.ulpgc.is1.model;

public class Reservation {

	private Court court;
	private Date Date;
	private static int Next_ID = 0;
	final int Id;

	public Reservation(Court court, Date date, int id) {
		this.court = court;
		Date = date;
		Id = id;
	}
}
