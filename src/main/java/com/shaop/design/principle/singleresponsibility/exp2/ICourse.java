package com.shaop.design.principle.singleresponsibility.exp2;

public interface ICourse {

    String getCourseName();
    byte[] getCourseContent();

    void studyCourse();
    void refundCourse();

}
