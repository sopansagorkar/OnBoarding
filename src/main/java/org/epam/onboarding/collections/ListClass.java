package org.epam.onboarding.collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        Student objStudent=new Student();
        Student objStudent1=new Student();

        objStudent.setRollNumber(101);
        objStudent.setName("Sopan");
        objStudent.setClassName("Testing");
        objStudent.setAttendance(79.8);

        objStudent1.setRollNumber(102);
        objStudent1.setName("Purva");
        objStudent1.setClassName("Dance");
        objStudent1.setAttendance(99.8);

        List<Student> studentList=new ArrayList<>();

        studentList.add(objStudent);
        studentList.add(objStudent1);


        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getRollNumber());
            System.out.println(studentList.get(i).getName());
            System.out.println(studentList.get(i).getClassName());
            System.out.println(studentList.get(i).getAttendance());
        }

    }
}
