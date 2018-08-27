package com.sda.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NIP
{
    String nip;

    public NIP(String nip) {
        this.nip = nip;
    }

    public void readNip () {

        try {
            BufferedReader br = new BufferedReader(new FileReader("nipnumber.csv"));
            br.readLine();

        }
        catch (IOException e){
            System.out.println("Wrong file!");
        }

    }

    public int[] createIntArray(String exampleNip) {
        exampleNip = nip.replace("-", "");
        int[] num = new int[exampleNip.length()];
        for (int i = 0; i < exampleNip.length(); i++) {
            num[i] = exampleNip.charAt(i) - '0';
        }

        return num;
    }

    public boolean isTheNipCorrect (int[] nipNumber) {
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

        if (nipNumber[9] == sum)
            return true;
        else
            return false;
    }


}

