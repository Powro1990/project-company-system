package com.sda.project;

import java.time.LocalDate;

public class BankAccount {
    @CsvColumnName("Title")
    private String title;
    @CsvColumnName("Nip")
    private Nip Nip;
    @CsvColumnName("Amount")
    private double amount;
    private OperationType type;
    @CsvColumnName("Date")
    private LocalDate date;

    public BankAccount(String title, Nip nip, double amount, OperationType type, LocalDate date) {
        this.title = title;
        Nip = nip;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Nip getNip() {
        return Nip;
    }

    public void setNip(Nip nip) {
        this.Nip = nip;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
