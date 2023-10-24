package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public NIF(String number) {
        this.number = number;
    }

    public boolean isValid() {
        String nifString = String.valueOf(number);
        if (nifString.length() != 9) {
            return false;
        }
        // Asegúrate de que el número sea un valor numérico antes de aplicar el operador %.
        try {
            int numericValue = Integer.parseInt(nifString.substring(0, 8));
            char controlCode = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numericValue % 23);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String toString(){
        return String.valueOf(number);
    }
}