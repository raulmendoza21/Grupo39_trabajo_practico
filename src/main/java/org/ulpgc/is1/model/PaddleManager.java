package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PaddleManager {

    private ArrayList<Customer> customers;
    private ArrayList<Court> courts;

    public PaddleManager() {
        this.customers = new ArrayList<>();
        this.courts = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, String nif) {
        customers.add(new Customer(name, surname, nif));
    }

    public void addCourt(String name, int price, CourtType courtType) {
        courts.add(new Court(name, price, courtType));
    }

    public Customer getCustomer(NIF nif) {
        for (Customer customer : customers) {
            if (customer.getNif() == nif) return customer;
        }
        return null;
    }

    public Court getCourt(String name) {
        for (Court court : courts) {
            if (court.getName().equals(name)) {
                return court;
            }
        }
        return null;
    }

    public void reserve(NIF nif, LocalDate date, Court court) {
        Customer customer = getCustomer(nif);
        customer.reservations.add(new Reservation(court, customer, date));
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Court> getCourts() {
        return courts;
    }
}
