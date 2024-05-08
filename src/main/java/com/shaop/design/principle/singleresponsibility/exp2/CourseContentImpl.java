package com.shaop.design.principle.singleresponsibility.exp2;

public class CourseContentImpl implements ICourseContent{
    @Override
    public String getCourseName() {
        return "";
    }

    @Override
    public byte[] getCourseContent() {
        return new byte[0];
    }
}
