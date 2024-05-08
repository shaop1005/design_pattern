package com.shaop.design.principle.dependenceinversion.v4;

public class Geely {

    private ICourse course;

    public void studyImoocCourse () {
        this.course.studyCourse();
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }
}
