package com.shaop.design.principle.dependenceinversion.custom;

public class JuiceBeverageStoreFactory extends BeverageStore{

    @Override
    Beverage createBeverage(String type) {
        Beverage juice = new Juice();
        return juice;
    }

}
