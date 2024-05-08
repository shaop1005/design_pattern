package com.shaop.design.principle.dependenceinversion.custom;

public class Client {

    public static void main(String[] args) {
        BeverageStore colaFactory = new ColaBeverageStoreFactory();
        colaFactory.saleBeverage(null);
        BeverageStore juiceFactory = new JuiceBeverageStoreFactory();
        juiceFactory.saleBeverage(null);


        BeverageStore factory = new BeverageStoreFactory();
        factory.saleBeverage("cola");
        factory.saleBeverage("juice");
    }

}
