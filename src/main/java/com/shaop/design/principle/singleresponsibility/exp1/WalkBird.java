package com.shaop.design.principle.singleresponsibility.exp1;

public class WalkBird implements Bird {

    @Override
    public void mainMoveModel(String birdName) {
        System.out.println(birdName + "用脚走");
    }

}
