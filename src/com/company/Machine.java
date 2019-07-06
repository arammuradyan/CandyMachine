package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Machine {
   private int profit;
    private ArrayList<Candy> candy=new ArrayList<>();

    private static  Machine INSTANCE;

    private Machine() {
    }

    public static Machine getInstance(){
        if(INSTANCE==null){
        INSTANCE= new Machine();}

        return INSTANCE;
    }


    public int getProfit() {
        return profit;
    }

    public List<Candy> getCandy() {
        return candy;
    }
public void sumProfit(int index){
        profit+=candy.get(index).getPrice();
}
public void addCandy(Candy c){
        candy.add(c);
    System.out.println("a new candy added");
}
public void saleCandy(Scanner scanner){
        if(candy.isEmpty()){
            System.out.println("\u001B[31m Storage is empty \u001B[0m");
        Main.showMenu(scanner,getInstance());
        }
        else{
    System.out.println("Choose candy to buy");
        int index=scanner.nextInt();
       if(index>=0 && index<candy.size()){
        sumProfit(index);
        candy.remove(index);
           System.out.println("choosen candy saled");}
       else {
           System.out.println(" \u001B[31m wrong number \u001B[0m");
           saleCandy(scanner);
       }
        }
}

public void printCandyList(){
        if(candy.isEmpty()){
            System.out.println("\u001B[31m Storage is empty \u001B[0m");
        }
        int index=0;
    for (Candy c:getCandy()) {
        System.out.println(index+" "+c.toString());
        index++;
    }
}

}
