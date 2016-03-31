package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Created by simonhamermesh on 3/3/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class Address {

    private String city;
    private String street_name;
    private String zip;
    private String state;
    private String street_number;

    @Override
    public String toString(){
        return " This customer's address: " + street_number + " " + street_name + "," + city + "," + state + " " + zip;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }
}
