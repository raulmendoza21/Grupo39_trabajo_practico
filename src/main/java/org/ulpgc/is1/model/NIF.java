package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public NIF(String number) {
        this.number = number;
    }

    //metodo isValid que saque de internet, se encargara de validar si el nif es correcto o no
    public boolean isValid() {
        String nifString = String.valueOf(number);
        if (nifString.length() != 9) {
            return false;
        }
        // Asegúrate de que el número sea un valor numérico antes de aplicar el operador %.
        int numericValue = Integer.parseInt(nifString.substring(0, 8));
        char controlCode = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numericValue % 23);
        return nifString.charAt(8) == controlCode;

    }
}