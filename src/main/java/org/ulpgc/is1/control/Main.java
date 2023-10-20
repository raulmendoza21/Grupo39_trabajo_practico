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
                System.out.println(customer.getNif());;
            }
            else {
                System.out.println("NIF no válido");
            }
        }

        System.out.println("Nombre: " + customers.get(0).getName() + ", " + customers.get(0).getSurname() +
                ", NIF: " + customers.get(0).getNif());
        System.out.println("Nombre: " + customers.get(1).getName() + ", " + customers.get(1).getSurname() +
                ", NIF: " + customers.get(1).getNif());
    }
    public static void main(String[] args) {
        System.out.println("QUE DISE MI COLEGA");
    }


    /*  i. Init. Crear dos clientes. El primer cliente será miembro del club de paddle.
            El segundo cliente tendrá el NIF: “12SD34TT4”.
        ii. Init. Crear dos pistas de paddle, una será de tipo rápido y otra de tipo lento.
        iii. Imprimir por pantalla los NIF’s válidos de los clientes del club. (*) En el caso que
            el cliente tenga un NIF no válido se almacenará el valor: “XXXX”.
        iv. Imprimir por pantalla los datos del primer cliente.
        v. Imprimir por pantalla los datos del segundo cliente.
        vi. Imprimir por pantalla los datos de la segunda pista.
        vii. Crear una reserva por parte del primer cliente en la segunda pista.
        viii. Borrar el segundo cliente.
        ix. Imprimir por pantalla el número de clientes del club.
        x. Imprimir por pantalla de todas las reservas realizadas: el nombre del cliente
            que ha hecho la reserva, el nombre de la pista, el día y el coste de dicha
            reserva.
    */



}
