package com.company;

public class Candy {
   private  CandyName name;
    private CandyFilling filling;
    private CandyChocolateType chocolateType;
    private int price;

    public CandyName getName() {
        return name;
    }

    public CandyFilling getFilling() {
        return filling;
    }

    public CandyChocolateType getChocolateType() {
        return chocolateType;
    }

    public int getPrice() {
        return price;
    }

   public Candy(CandyBuilder cb){
this.name=cb.name;
this.price=cb.price;
this.filling=cb.filling;
this.chocolateType=cb.chocolateType;
   }
   @Override
    public String toString() {
        return "Candy{" +
                "name=" + name.getName() +
                ", filling=" + filling.getName() +
                ", chocolateType=" + chocolateType.getName() +
                ", price=" + price +
                '}';
    }
public static class CandyBuilder{
   private CandyName name;
    private CandyFilling filling;
    private CandyChocolateType chocolateType;
    private int price;

    public CandyBuilder (CandyName name,int price){
        this.name=name;
        this.price=price;
    }

    public CandyBuilder withFilling(CandyFilling filling){
        this.filling=filling;
        return this;
    }
    public CandyBuilder withChoclateType(CandyChocolateType chocolateType){
        this.chocolateType=chocolateType;
        return this;
    }
 public Candy build(){
        return new Candy(this) ;
 }

}
}
