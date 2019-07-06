package com.company;

import java.util.Comparator;

public class SortByPrice implements Comparator<Candy> {
    @Override
    public int compare(Candy o1, Candy o2) {
        if(o1.getPrice()-o2.getPrice()>0){
            return 1;
        } else if(o1.getPrice()-o2.getPrice()<0){
            return -1;
        }else return 0;
    }
}
