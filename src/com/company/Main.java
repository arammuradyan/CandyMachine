package com.company;


import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Machine machine=Machine.getInstance();
        showMenu(scanner,machine );
    }

    public static void showMenu(Scanner scanner,Machine machine){
        System.out.println("Choose action");
        System.out.println("1. show candy list 2. sale a candy 3. add new candy 4. sort by name");
        System.out.println("5. sort by price   6. show profit  7. exit" );
        int i =scanner.nextInt();
        switch (i){
            case 1:
                machine.printCandyList();
                showMenu(scanner,machine);
                break;
            case 2:
                machine.saleCandy(scanner);
                showMenu(scanner,machine);
                break;
            case 3:
                System.out.println("Enter candy price");
                int price=scanner.nextInt();
                machine.addCandy(createCandy(getCandyName(scanner),getCandyFilling(scanner),getCandyChocolateType(scanner),price));
                showMenu(scanner,machine);
                break;
            case 4:
                System.out.println("Candy list sorted by name");
                Collections.sort(machine.getCandy(),new SortByName());
                machine.printCandyList();
                showMenu(scanner,machine);
                break;
            case 5:
                System.out.println("Candy list sorted by name");
                Collections.sort(machine.getCandy(),new SortByPrice());
                machine.printCandyList();
                showMenu(scanner,machine);
                break;
            case 6:
                System.out.println("amount profit - "+machine.getProfit());
                showMenu(scanner,machine);
                break;
            case 7:
                System.out.println("amount profit - "+machine.getProfit());
                System.out.println("Work is done!!!");
                break;
                default:
                    System.out.println(" \u001B[31m wrong number \u001B[0m");
                    showMenu(scanner,machine);
                    break;
        }

    }

    public static CandyName getCandyName(Scanner scanner){
      CandyName cm=null;
        System.out.println("Choose candy name");
      System.out.println("1. Snickers 2. Mars 3. Bounty 4. Twix 5. Milky way 6. m&m's ");
      int i=scanner.nextInt();
        switch (i){
            case 1:
                cm=CandyName.SNICKERS;
                break;
            case 2:
                cm= CandyName.MARS;
            break;
            case 3:
                cm= CandyName.BOUNTY;
            break;
            case 4:
                cm=CandyName.TWIX;
            break;
            case 5:
                cm=CandyName.MILKYWAY;
            break;
            case 6:
                cm=CandyName.MANDMS;
            break;
            default:
                System.out.println(" \u001B[31m wrong number \u001B[0m");
                getCandyName(scanner);
                break;
        }
  return cm;
    }
    public static CandyFilling getCandyFilling(Scanner scanner) {
        CandyFilling cf = null;
        System.out.println("Choose candy filling");
        System.out.println("1. Nuts 2. Nuga");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                cf = CandyFilling.NUTS;
                break;
            case 2:
                cf = CandyFilling.NUGA;
                break;
                default:
                System.out.println(" \u001B[31m wrong number \u001B[0m");
                getCandyFilling(scanner);
                break;
        }
        return cf;
    }
    public static CandyChocolateType getCandyChocolateType(Scanner scanner) {
        CandyChocolateType cct=null;
        System.out.println("Choose candy chocolate type");
        System.out.println("1. Black 2. White");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                cct = CandyChocolateType.BLACK;
                break;
            case 2:
                cct = CandyChocolateType.WHITE;
                break;
            default:
                System.out.println(" \u001B[31m wrong number \u001B[0m");
                getCandyChocolateType(scanner);
                break;
        }
        return cct;
    }

    public static Candy createCandy(CandyName name,CandyFilling filling,CandyChocolateType chocolateType,int price){
        return new Candy.CandyBuilder(name,price).withFilling(filling).withChoclateType(chocolateType).build();
}
}
