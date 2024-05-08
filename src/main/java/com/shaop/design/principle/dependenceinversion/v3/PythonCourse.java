package com.shaop.design.principle.dependenceinversion.v3;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
