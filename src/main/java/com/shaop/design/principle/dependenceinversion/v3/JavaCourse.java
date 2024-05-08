package com.shaop.design.principle.dependenceinversion.v3;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
