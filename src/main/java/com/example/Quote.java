package com.example;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by simonhamermesh on 3/3/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;

    public Quote(){};

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){

        return "Quote{ type= " + type + "\\, value= " + value + "}";
    }

}
