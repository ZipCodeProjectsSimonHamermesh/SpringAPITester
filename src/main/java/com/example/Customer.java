package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.Id;

/**
 * Created by simonhamermesh on 3/3/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class Customer {
    @Id
    private String _id;


    private String last_name;

    private String first_name;

    private Address address;

    public Customer() {
    }

    @Override
    public String toString(){
        return "The customer's name is: " + first_name + " " + last_name + ". Their customer id is: " + _id + "\n" + address.toString();
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

    public Address getAddress() {return address;}

    public void setAddress(Address address) {this.address = address;}
}
