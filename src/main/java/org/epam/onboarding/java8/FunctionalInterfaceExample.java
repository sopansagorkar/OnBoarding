package org.epam.onboarding.java8;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        int a=10;
        Square square=(int b)->b*b;
        int output= square.calculate(a);
        System.out.println(output);
    }
}
