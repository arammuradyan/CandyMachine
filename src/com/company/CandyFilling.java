package com.company;

public enum CandyFilling {
    NUTS("Nuts"),
    NUGA("Nuga"),
    NOTSELECTED("null");


    private String name;

    CandyFilling(String name){
        this.name=name;
    }
public  String getName(){
        return name;
}
}
