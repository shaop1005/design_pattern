package com.shaop.design.principle.dependenceinversion.v4;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
