package com.sda.project;

import java.time.LocalDate;

public class Invoice {
    private long id;
    private Nip sellerNip;
    private Nip buyerNip;
    private LocalDate invoiceDate;
    private LocalDate pamentDate;
    private double gross;
    private double net;
    private int vat;
    private String number;

    public Invoice(long id, Nip sellerNip, Nip buyerNip, LocalDate invoiceDate, LocalDate pamentDate, double gross, double net, int vat, String number) {
        this.id = id;
        this.sellerNip = sellerNip;
        this.buyerNip = buyerNip;
        this.invoiceDate = invoiceDate;
        this.pamentDate = pamentDate;
        this.gross = gross;
        this.net = net;
        this.vat = vat;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Nip getSellerNip() {
        return sellerNip;
    }

    public void setSellerNip(Nip sellerNip) {
        this.sellerNip = sellerNip;
    }

    public Nip getBuyerNip() {
        return buyerNip;
    }

    public void setBuyerNip(Nip buyerNip) {
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
