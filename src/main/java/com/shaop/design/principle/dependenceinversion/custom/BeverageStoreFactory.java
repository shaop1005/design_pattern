package com.shaop.design.principle.dependenceinversion.custom;

public class BeverageStoreFactory extends BeverageStore {

    @Override
    Beverage createBeverage(String type) {
        if (type.equals("cola")) {
            return new Cola();
        } else if (type.equals("juice")) {
            return new Juice();
        }
        return null;
    }

}
