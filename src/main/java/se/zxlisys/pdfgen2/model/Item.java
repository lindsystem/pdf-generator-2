/*
 * Copyright Lind System - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 *
 * Written by Martin Lind <martin@lindsystem.se>, July 2014
 */
package se.zxlisys.pdfgen2.model;

import java.math.BigDecimal;

/**
 * @author Martin Lind
 * @version 1
 */
public class Item {
    private String description;
    private BigDecimal cost;
    private BigDecimal vatPercentage;

    public Item() { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(BigDecimal vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (cost != null ? !cost.equals(item.cost) : item.cost != null) return false;
        if (description != null ? !description.equals(item.description) : item.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
