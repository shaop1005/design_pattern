package com.shaop.design.principle.dependenceinversion.v4;

public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();
        JavaCourse javaCourse = new JavaCourse();
        FECourse feCourse = new FECourse();
        PythonCourse pythonCourse = new PythonCourse();

        geely.setCourse(javaCourse);
        geely.studyImoocCourse();
        geely.setCourse(feCourse);
        geely.studyImoocCourse();
        geely.setCourse(pythonCourse);
        geely.studyImoocCourse();
    }

}
