package com.sda.project;

public class Nip {

    private String nip;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Nip(final String nip) {
        this.nip = isTheNipCorrect(nip);
    }

    public String isTheNipCorrect(String nip) throws InvalidNipNumber {
        String tempNip = nip.replace("-", "").replace(" ", "");
        if (!tempNip.matches("^\\d{10}$")) {
            throw new InvalidNipNumber("Invalid NIP content");
        } else {
            int[] nipNumber = new int[tempNip.length()];
            for (int i = 0; i < tempNip.length(); i++) {
                nipNumber[i] = tempNip.charAt(i) - '0';
            }
            int sum;
            sum = 6 * nipNumber[0] +
                    5 * nipNumber[1] +
                    7 * nipNumber[2] +
                    2 * nipNumber[3] +
                    3 * nipNumber[4] +
                    4 * nipNumber[5] +
                    5 * nipNumber[6] +
                    6 * nipNumber[7] +
                    7 * nipNumber[8];
            sum %= 11;

            if (nipNumber[9] == sum) {
                return tempNip.replaceAll("^(\\d{3})(\\d{3})(\\d{2})(\\d{2})$", "$1-$2-$3-$4");

            } else {
                throw new InvalidNipNumber("Invalid NIP checksum");
            }
        }
    }
}


