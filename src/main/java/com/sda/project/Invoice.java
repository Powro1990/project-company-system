package com.sda.project;

import java.time.LocalDate;

public class Invoice {
    private long id;
    private NIP sellerNIP;
    private NIP buyerNIP;
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

    public NIP getSellerNIP() {
        return sellerNIP;
    }

    public void setSellerNIP(NIP sellerNIP) {
        this.sellerNIP = sellerNIP;
    }

    public NIP getBuyerNIP() {
        return buyerNIP;
    }

    public void setBuyerNIP(NIP buyerNIP) {
        this.buyerNIP = buyerNIP;
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
