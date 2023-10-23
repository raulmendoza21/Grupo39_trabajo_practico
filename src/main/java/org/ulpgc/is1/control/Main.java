package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Date;

import static org.apache.commons.lang3.ArrayUtils.removeElement;

public class Main {

    public static void init() {
        PaddleManager manager = new PaddleManager();
        manager.addCustomer("Pepe", "Chola", "12345678A");
        manager.addCustomer("Raúl", "MEndozs", "4554555A");

        manager.addCourt("Pista1", 10, CourtType.Fast_court);
        manager.addCourt("Pista2", 10, CourtType.Slow_court);

        ArrayList<Customer> customers = manager.getCustomers();
        ArrayList<Court> courts = manager.getCourts();

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


        System.out.println("Pista: " + courts.get(1).getName() + ", Precio: " + courts.get(1).getPrice() +
                ", Tipo: " + courts.get(1).getCourtType());

        Date date = new Date();
        ArrayList<Extra> extras1 = new ArrayList<>();
        manager.reserve(customers.get(0).getNif(), date, courts.get(1), extras1);

        customers.remove(1);

        int count = 0;
        for (Customer customer : customers) count += 1;
        System.out.println("Número de clientes: " + count);

		// TODO punto 10 init
    }

    public static void main(String[] args) {
        init();
    }
}