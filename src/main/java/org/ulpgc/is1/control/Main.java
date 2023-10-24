package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import javax.sound.midi.SysexMessage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static org.apache.commons.lang3.ArrayUtils.removeElement;

public class Main {

    public static void init() {
        PaddleManager manager = new PaddleManager();
        manager.addCustomer("Pepe", "Chola", "12345678A");
        manager.addCustomer("Raúl", "MEndozs", "12SD34TT4");

        manager.addCourt("Pista1", 10, CourtType.Fast_court);
        manager.addCourt("Pista2", 10, CourtType.Slow_court);

        ArrayList<Customer> customers = manager.getCustomers();
        ArrayList<Court> courts = manager.getCourts();

        //verificacion si nif es valido, en caso de que no nif = XXXX
        for (Customer customer : customers) {
            if (!customer.getNif().isValid()) {
                customer.setNif(new NIF("XXXX"));
            }
        }

        System.out.println("Nombre: " + customers.get(0).getName() + ", " + customers.get(0).getSurname() +
                ", NIF: " + customers.get(0).getNif());
        System.out.println("Nombre: " + customers.get(1).getName() + ", " + customers.get(1).getSurname() +
                ", NIF: " + customers.get(1).getNif());


        System.out.println("Pista: " + courts.get(1).getName() + ", Precio: " + courts.get(1).getPrice() +
                ", Tipo: " + courts.get(1).getCourtType() + "\n");

        manager.reserve(customers.get(0).getNif(), LocalDate.of(2023, 12, 30), courts.get(1));
        manager.reserve(customers.get(1).getNif(), LocalDate.of(2023, 12, 30), courts.get(1));

        System.out.println("Hay un total de: " + manager.countCustomers() + " reservas.\n");

		manager.showReservations();
    }

    public static void main(String[] args) {
        init();
    }
}