package com.shaop.design.principle.dependenceinversion.v3;

public class Geely {

    private final ICourse course;

    public Geely(ICourse course) {
        this.course = course;
    }

    public void studyImoocCourse () {
        this.course.studyCourse();
    }

}
