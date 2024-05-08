package com.shaop.design.principle.dependenceinversion.v3;

public class Test {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        Geely geely1 = new Geely(javaCourse);
        FECourse feCourse = new FECourse();
        Geely geely2 = new Geely(feCourse);
        PythonCourse pythonCourse = new PythonCourse();
        Geely geely3 = new Geely(pythonCourse);

        geely1.studyImoocCourse();
        geely2.studyImoocCourse();
        geely3.studyImoocCourse();
    }

}
