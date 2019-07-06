package com.company;

public enum CandyName {

    SNICKERS("Snickers"),
    MARS("Mars"),
    BOUNTY("Bounty"),
    TWIX("Twix"),
    MILKYWAY("Milky way"),
    MANDMS("m&m's"),
    NOTSELECTED("Not selected");


    private String name;

    CandyName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
}

}
