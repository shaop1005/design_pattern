package com.shaop.design.principle.dependenceinversion.custom;

public class ColaBeverageStoreFactory extends BeverageStore{

    @Override
    Beverage createBeverage(String type) {
        Beverage cola = new Cola();
        return cola;
    }

}
