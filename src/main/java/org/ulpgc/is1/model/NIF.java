package org.ulpgc.is1.model;

public class NIF {
    public int number;

    public NIF(int number){
        this.number = number;
    }

    //metodo isValid que saque de internet, se encargara de validar si el nif es correcto o no
    public boolean isValid() {
        String nifString = String.valueOf(number);
        if (nifString.length() != 9) {
            return false;
        }
        char controlCode = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(number % 23);
        return nifString.charAt(8) == controlCode;
    }

    public static void main(String[] args) {
        NIF nif = new NIF(12345678); // Reemplaza 12345678 con tu número de ejemplo
        System.out.println(nif.isValid()); // Devuelve true si el NIF es válido, de lo contrario devuelve false
    }
}
