package com.sda.project;

public class Company {


    @CsvColumnName("Name")
    private String name;
    @CsvColumnName("Nip")
    private Nip Nip;

    public Company(String name, Nip nip) {
        this.name = name;
        Nip = nip;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nip getNip() {
        return Nip;
    }

    public void setNip(Nip nip) {
        this.Nip = nip;
    }
}
