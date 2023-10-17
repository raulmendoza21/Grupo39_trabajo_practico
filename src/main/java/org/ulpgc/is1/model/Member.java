package org.ulpgc.is1.model;

public class Member extends Customer {
    public int points;
    public Address address;

    public Member(String name, String surname, NIF nif, int points, Address address) {
        super(name, surname, nif);
        this.points = points;
        this.address = address;
    }

    //getter and setter
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
