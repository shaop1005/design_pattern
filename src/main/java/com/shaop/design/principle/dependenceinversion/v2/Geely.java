package com.shaop.design.principle.dependenceinversion.v2;

public class Geely {

    public void studyImoocCourse (ICourse course) {
        course.studyCourse();
    }

}
