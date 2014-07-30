/*
 * Copyright Lind System - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 *
 * Written by Martin Lind <martin@lindsystem.se>, July 2014
 */
package se.zxlisys.pdfgen2.model;

import java.util.Date;

/**
 * @author Martin Lind
 * @version 1
 */
public class Payment {
    private String ocr;
    private String giro;
    private String payment;
    private Date expiryDate;

    public Payment() { }

    public String getOcr() {
        return ocr;
    }

    public void setOcr(String ocr) {
        this.ocr = ocr;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOcrControlDigit() {
        return "0"; // Calculate Luhn algorithm.

    }

    public String getPaymentControlDigit() {
        return "0"; // Calculate Luhn algorithm.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment1 = (Payment) o;

        if (expiryDate != null ? !expiryDate.equals(payment1.expiryDate) : payment1.expiryDate != null) return false;
        if (giro != null ? !giro.equals(payment1.giro) : payment1.giro != null) return false;
        if (ocr != null ? !ocr.equals(payment1.ocr) : payment1.ocr != null) return false;
        if (payment != null ? !payment.equals(payment1.payment) : payment1.payment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ocr != null ? ocr.hashCode() : 0;
        result = 31 * result + (giro != null ? giro.hashCode() : 0);
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "ocr='" + ocr + '\'' +
                ", giro='" + giro + '\'' +
                ", payment='" + payment + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
