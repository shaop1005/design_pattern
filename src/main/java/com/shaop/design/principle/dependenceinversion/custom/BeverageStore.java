package com.shaop.design.principle.dependenceinversion.custom;

/**
 * 饮料店
 */
public abstract class BeverageStore {

    public Beverage saleBeverage (String type) {
        Beverage beverage = createBeverage(type);
        System.out.println("sale " + type);
        return beverage;
    }

    abstract Beverage createBeverage(String type);

}