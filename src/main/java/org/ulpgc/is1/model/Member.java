package org.ulpgc.is1.model;

public class Member extends Customer {
    private int points;
    private Address address;

    public Member(String name, String surname, String nif, int points, Address address) {
        super(name, surname, nif);
        this.points = points;
        this.address = address;
    }

    public int getPoints() {
        return points;
    }

    public Address getAddress() {
        return address;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
