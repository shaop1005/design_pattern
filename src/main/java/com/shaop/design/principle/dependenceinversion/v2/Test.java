package com.shaop.design.principle.dependenceinversion.v2;

public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();
        JavaCourse javaCourse = new JavaCourse();
        FECourse feCourse = new FECourse();
        PythonCourse pythonCourse = new PythonCourse();

        geely.studyImoocCourse(javaCourse);
        geely.studyImoocCourse(feCourse);
        geely.studyImoocCourse(pythonCourse);
    }

}
