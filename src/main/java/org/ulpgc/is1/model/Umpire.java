package org.ulpgc.is1.model;

public class Umpire extends Extra {

    private String name;
    private String surname;

    public Umpire(int price, String name, String surname) {
        super(price);
        this.name = name;
        this.surname = surname;
    }
    @Override
    public String getName() {
        return this.name + this.surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
