package com.company;

public enum CandyChocolateType {
    BLACK("Black chocolate"),
    WHITE("White chocolate"),
    NOTSELECTED("Not selected");

private String name;
CandyChocolateType(String name){
    this.name=name;
}
public String getName(){
    return name;
}
}
