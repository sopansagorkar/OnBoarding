package org.epam.onboarding.collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] a) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student obj = new Student();

        obj.setName("Sopan");

        studentArrayList.add(obj);

        System.out.println(studentArrayList.get(0).getClassName());
        System.out.println("Hello world !!");
    }
}
