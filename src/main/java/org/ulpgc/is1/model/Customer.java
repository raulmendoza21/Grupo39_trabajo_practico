package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private NIF nif;
    public ArrayList<Reservation> reservations;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public Customer(String name, String surname, String nif) {
        this.name = name;
        this.surname = surname;
        this.nif = new NIF(nif);
        this.reservations = new ArrayList<>();
    }

    public NIF getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}