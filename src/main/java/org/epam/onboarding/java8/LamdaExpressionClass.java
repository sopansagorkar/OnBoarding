package org.epam.onboarding.java8;

public class LamdaExpressionClass {

    public static void main(String[] args) {

        Square s=(a)->a*a;
        System.out.println(s.calculate(10));

    }
}
