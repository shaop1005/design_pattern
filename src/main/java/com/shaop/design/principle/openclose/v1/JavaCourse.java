package com.shaop.design.principle.openclose.v1;

public class JavaCourse implements ICourse {

    private final Integer id;
    private final String name;
    private final Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public Double getDiscountPrice() {
        return this.price * 0.8;
    }
}
