package org.epam.onboarding.collections;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {

        HashSet<Student> stuSet=new HashSet<>();
        Student objStudent=new Student();

        objStudent.setRollNumber(101);
        objStudent.setName("Sopan");
        objStudent.setClassName("Testing");
        objStudent.setAttendance(79.8);


        stuSet.add(objStudent);
        System.out.println(stuSet.iterator().next().getName());
    }
}
