package com.parsemethods;

public class ParseTest {
    public static void main(String[] args) {
        String numberStr = "123";
        int number = Integer.parseInt(numberStr); // parse String to int

        String doubleStr = "45.67";
        double d = Double.parseDouble(doubleStr); // parse String to double

        String boolStr = "true";
        boolean flag = Boolean.parseBoolean(boolStr); // parse String to boolean

        System.out.println("Integer: " + number);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + flag);
    }
}