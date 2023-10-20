package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String surname;
    public NIF nif;
    public ArrayList<Reservation> reservations;

    public Customer(String name, String surname, NIF nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.reservations = new ArrayList<>();
    }
}