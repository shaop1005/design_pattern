package com.shaop.design.principle.dependenceinversion.v4;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}