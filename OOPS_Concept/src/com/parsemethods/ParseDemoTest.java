package com.parsemethods;

import java.time.LocalDate;

public class ParseDemoTest {
    public static void main(String[] args) {
        String intString = "123";
        String doubleString = "45.67";
        String booleanString = "true";
        String dateString = "2023-10-27";

        int intValue = Integer.parseInt(intString);
        double doubleValue = Double.parseDouble(doubleString);
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        LocalDate dateValue = LocalDate.parse(dateString);

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Date value: " + dateValue);
    }
}