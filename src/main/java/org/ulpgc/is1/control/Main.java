package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Main {

    public static void init() {
        PaddleManager manager = new PaddleManager();
        manager.addCustomer("Pepe", "Chola", "12345678A");
        manager.addCustomer("a", "a", "12SD34TT4");

        manager.addCourt("nombre", 10, CourtType.Fast_court);
        manager.addCourt("nombre", 10, CourtType.Slow_court);

        ArrayList<Customer> customers = manager.getCustomers();

        for (Customer customer : customers) {
            if (customer.getNif().isValid()) {
                System.out.println(customer.getNif());
            } else {
                System.out.println("NIF no válido");
            }
        }

        System.out.println("Nombre: " + customers.get(0).getName() + ", " + customers.get(0).getSurname() +
                ", NIF: " + customers.get(0).getNif());
        System.out.println("Nombre: " + customers.get(1).getName() + ", " + customers.get(1).getSurname() +
                ", NIF: " + customers.get(1).getNif());
    }

    public static void main(String[] args) {
        init();
    }
}