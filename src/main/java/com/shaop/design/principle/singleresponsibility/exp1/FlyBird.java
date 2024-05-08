package com.shaop.design.principle.singleresponsibility.exp1;

public class FlyBird implements Bird {
    @Override
    public void mainMoveModel(String birdName) {
        System.out.println(birdName + "用翅膀飞");
    }
}
