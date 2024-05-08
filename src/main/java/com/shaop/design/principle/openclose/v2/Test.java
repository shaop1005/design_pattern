package com.shaop.design.principle.openclose.v2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java开发", 348d);
        System.out.println(javaCourse.getId() + " " + javaCourse.getName() + " " + javaCourse.getPrice());
    }
}
