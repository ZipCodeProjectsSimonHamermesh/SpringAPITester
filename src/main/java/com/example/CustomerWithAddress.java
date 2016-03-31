package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by simonhamermesh on 3/9/16.
 */

@Entity
public class CustomerWithAddress {

    @Id
    private String _id;
    private String last_name;
    private String first_name;

    private String city;
    private String street_name;
    private String zip;
    private String state;
    private String street_number;

    CustomerWithAddress(){}


    CustomerWithAddress(Customer c){
        this.set_id(c.get_id());
        this.setLast_name(c.getLast_name());
        this.setFirst_name(c.getFirst_name());
        this.setCity(c.getAddress().getCity());
        this.setStreet_name(c.getAddress().getCity());
        this.setZip(c.getAddress().getZip());
        this.setState(c.getAddress().getState());
        this.setStreet_number(c.getAddress().getStreet_number());
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
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
