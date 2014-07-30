/*
 * Copyright Lind System - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 *
 * Written by Martin Lind <martin@lindsystem.se>, July 2014
 */
package se.zxlisys.pdfgen2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Lind
 * @version 1
 */
public class Address {
    public String name;
    public List<String> addressFields;
    public String state;
    public String country;

    public Address() {
        addressFields = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddressFields() {
        return addressFields;
    }

    public void setAddressFields(List<String> addressFields) {
        this.addressFields = addressFields;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (name != null ? !name.equals(address.name) : address.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", addressFields=" + addressFields +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
