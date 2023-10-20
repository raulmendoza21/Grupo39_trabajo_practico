package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;

public class PaddleManager {
    private ArrayList<Customer> customers;
    private ArrayList<Court> courts;

    public PaddleManager(ArrayList<Customer> customers, ArrayList<Court> courts) {
        this.customers = customers;
        this.courts = courts;
    }

    public void addCustomer(String name, String surname, NIF nif) {
        customers.add(new Customer(name, surname, nif));
    }

    public void addCourt(String name, int price, CourtType courtType) {
        courts.add(new Court(name, price, courtType));
    }

    public Customer getCustomer(NIF nif) {
        for (Customer customer : customers) {
            if (customer.nif == nif) return customer;
        }
        return null;
    }

    public Court getCourt(String name) {
        for (Court court : courts) {
            if (court.name.equals(name)) {
                return court;
            }
        }
        return null;
    }

    public void reserve(NIF nif, Date date, Court court, ArrayList<Extra> extras) {
        Customer customer = getCustomer(nif);
        customer.reservations.add(new Reservation(court, customer, date, extras));
    }
}
