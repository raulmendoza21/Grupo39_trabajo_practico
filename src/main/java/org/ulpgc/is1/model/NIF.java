package org.ulpgc.is1.model;

public class NIF {
    public String number;

    public NIF(String number) {
        if (isValid(number)) {
            this.number = number;
        }
        else {
            this.number = "XXXX";
        }
    }

    public boolean isValid(String nif) {
        if (nif.length() != 9) {
            return false;
        }
        try {
            int numericValue = Integer.parseInt(nif.substring(0, 8));
            char letter = nif.charAt(8);
            char expectedLetter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numericValue % 23);
            return letter == expectedLetter;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String toString(){
        return String.valueOf(number);
    }
}