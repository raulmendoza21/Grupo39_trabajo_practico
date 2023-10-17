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

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public NIF getNif() {
        return nif;
    }
    public void setNif(NIF nif) {
        this.nif = nif;
    }
}