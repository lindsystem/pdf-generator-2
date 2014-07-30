/*
 * Copyright Lind System - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 *
 * Written by Martin Lind <martin@lindsystem.se>, July 2014
 */
package se.zxlisys.pdfgen2.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Martin Lind
 * @version 1
 */
public class Specification {
    private Map<Item, BigDecimal> items;

    public Specification() {
        items = new HashMap<Item, BigDecimal>();
    }

    public Map<Item, BigDecimal> getItems() {
        return items;
    }

    public void addItem(Item item, BigDecimal amount) {
        if (items.containsKey(item)) {
            BigDecimal currentAmount = items.get(item);
            items.put(item, currentAmount.add(amount));

            return;
        }

        items.put(item, amount);
    }

    public void removeItem(Item item) {
        if (!items.containsKey(item)) {
            return;
        }

        items.remove(item);
    }

    public BigDecimal getTotalFor(Item item) {
        if (!items.containsKey(item)) {
            return BigDecimal.ZERO;
        }

        return item.getCost().multiply(items.get(item));
    }

    public BigDecimal getNet() {
        BigDecimal net = BigDecimal.ZERO;

        for (Map.Entry<Item, BigDecimal> entry : items.entrySet()) {
            net = net.add(calculateTotalOfEntry(entry));
        }

        return net;
    }

    public BigDecimal getVat() {
        BigDecimal vat = BigDecimal.ZERO;

        for (Map.Entry<Item, BigDecimal> entry : items.entrySet()) {
            vat = vat.add(calculateTotalOfEntry(entry).multiply(entry.getKey().getVatPercentage()));
        }

        return vat;
    }

    public BigDecimal getGross() {
        BigDecimal net = getNet();
        BigDecimal vat = getVat();

        return net.add(vat);
    }

    private BigDecimal calculateTotalOfEntry(Map.Entry<Item, BigDecimal> entry) {
        return entry.getKey().getCost().multiply(entry.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specification)) return false;

        Specification that = (Specification) o;

        if (items != null ? !items.equals(that.items) : that.items != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return items != null ? items.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "items=" + items +
                '}';
    }
}
