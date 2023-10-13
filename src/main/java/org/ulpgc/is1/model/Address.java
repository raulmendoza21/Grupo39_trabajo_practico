package org.ulpgc.is1.model;

public class Address {
    public String street;
    public int number;
    public int postalCode;
    public String city;

    public Address(String street, int number, int postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }
}
