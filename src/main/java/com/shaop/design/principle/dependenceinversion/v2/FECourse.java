package com.shaop.design.principle.dependenceinversion.v2;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
