package com.shaop.design.principle.openclose.v3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(96, "Java开发", 348d);
        System.out.println(javaCourse.getId() + " " + javaCourse.getName() + " " + javaCourse.getPrice());
        ICourse javaDiscountCourse = new JavaDiscountCourse(96, "Java开发", 348d);
        System.out.println(javaDiscountCourse.getId() + " " + javaDiscountCourse.getName() + " " + javaDiscountCourse.getPrice());

        JavaDiscountCourse discountCourse = (JavaDiscountCourse) javaDiscountCourse;
        BigDecimal discountPrice = BigDecimal.valueOf(discountCourse.getPrice());
        String discountPriceStr = discountPrice.setScale(2, RoundingMode.HALF_UP).toPlainString();
        System.out.println("课程Id：" + discountCourse.getId() + "，课程名：" + discountCourse.getName()
                + "，原价：" + discountCourse.getOriginPrice() + "，折后价：" + discountPriceStr);
        System.out.println("课程Id：" + discountCourse.getId() + "，课程名：" + discountCourse.getName()
                + "，原价：" + discountCourse.getOriginPrice() + "，折后价：" + String.format("%.2f", discountPrice));
        System.out.println("课程Id：" + discountCourse.getId() + "，课程名：" + discountCourse.getName()
                + "，原价：" + discountCourse.getOriginPrice() + "，折后价：" + new DecimalFormat("#0.00").format(discountPrice));
    }
}
