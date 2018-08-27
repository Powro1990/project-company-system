package com.sda.project;

import java.time.LocalDate;

public class BankAccount {
    private String title;
    private NIP NIP;
    private double amount;
    private OperationType type;
    private LocalDate date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NIP getNIP() {
        return NIP;
    }

    public void setNIP(NIP NIP) {
        this.NIP = NIP;
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
