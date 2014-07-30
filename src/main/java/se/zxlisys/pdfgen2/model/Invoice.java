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
public class Invoice {
    private Long number;

    private Date invoiceDate;
    private Date expiryDate;

    private String creditorName;
    private String creditorReference;
    private Address creditor;

    private String debtorName;
    private String debtorCustomerNumber;
    private String debtorReference;
    private Address debtor;

    public Specification specification;

    public Payment paymentInfo;


    public Invoice() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public String getCreditorReference() {
        return creditorReference;
    }

    public void setCreditorReference(String creditorReference) {
        this.creditorReference = creditorReference;
    }

    public Address getCreditor() {
        return creditor;
    }

    public void setCreditor(Address creditor) {
        this.creditor = creditor;
    }

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public String getDebtorCustomerNumber() {
        return debtorCustomerNumber;
    }

    public void setDebtorCustomerNumber(String debtorCustomerNumber) {
        this.debtorCustomerNumber = debtorCustomerNumber;
    }

    public String getDebtorReference() {
        return debtorReference;
    }

    public void setDebtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
    }

    public Address getDebtor() {
        return debtor;
    }

    public void setDebtor(Address debtor) {
        this.debtor = debtor;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Payment getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(Payment paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Invoice)) return false;

        Invoice invoice = (Invoice) o;

        if (creditorName != null ? !creditorName.equals(invoice.creditorName) : invoice.creditorName != null)
            return false;
        if (debtorName != null ? !debtorName.equals(invoice.debtorName) : invoice.debtorName != null) return false;
        if (invoiceDate != null ? !invoiceDate.equals(invoice.invoiceDate) : invoice.invoiceDate != null) return false;
        if (number != null ? !number.equals(invoice.number) : invoice.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (invoiceDate != null ? invoiceDate.hashCode() : 0);
        result = 31 * result + (creditorName != null ? creditorName.hashCode() : 0);
        result = 31 * result + (debtorName != null ? debtorName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number=" + number +
                ", invoiceDate=" + invoiceDate +
                ", expiryDate=" + expiryDate +
                ", creditorName='" + creditorName + '\'' +
                ", creditorReference='" + creditorReference + '\'' +
                ", creditor=" + creditor +
                ", debtorName='" + debtorName + '\'' +
                ", debtorCustomerNumber='" + debtorCustomerNumber + '\'' +
                ", debtorReference='" + debtorReference + '\'' +
                ", debtor=" + debtor +
                ", specification=" + specification +
                ", paymentInfo=" + paymentInfo +
                '}';
    }
}
