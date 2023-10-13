package org.ulpgc.is1.model;

public class Customer {
    public String name;
    public String surname;
    public NIF nif;

    public Customer(String name, String surname, NIF nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
    }
}
