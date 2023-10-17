package org.ulpgc.is1.model;

public class NIF {
    public int number;

    public NIF(int number){
        this.number = number;
    }

    //getter and setter
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    //metodo isValid que se encargara de validar si el nif es correcto o no
    public boolean isValid() {
        String nifString = String.valueOf(number);
        if (nifString.length() != 9) {
            return false;
        }
        char controlCode = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(number % 23);
        return nifString.charAt(8) == controlCode;
    }
}
