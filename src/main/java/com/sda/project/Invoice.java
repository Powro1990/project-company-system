package com.sda.project;

import java.time.LocalDate;

public class Invoice {
    private long id;
    private NIP sellerNip;
    private NIP buyerNip;
    private LocalDate invoiceDate;
    private LocalDate pamentDate;
    private double gross;
    private double net;
    private int vat;
    private String number;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NIP getSellerNip() {
        return sellerNip;
    }

    public void setSellerNip(NIP sellerNip) {
        this.sellerNip = sellerNip;
    }

    public NIP getBuyerNip() {
        return buyerNip;
    }

    public void setBuyerNip(NIP buyerNip) {
        this.buyerNip = buyerNip;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getPamentDate() {
        return pamentDate;
    }

    public void setPamentDate(LocalDate pamentDate) {
        this.pamentDate = pamentDate;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
