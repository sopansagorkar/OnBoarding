package org.epam.onboarding.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        Map<String,Student> studentMap=new HashMap<>();
        Student stu=new Student();
        Student stu1=new Student();
        stu.setName("Sopan");
        stu.setAttendance(81.3456);
        stu.setRollNumber(102);

        stu1.setName("Sopan1");
        stu1.setAttendance(81.3456);
        stu1.setRollNumber(102);

        studentMap.put("Engineering Student",stu);
        studentMap.put("Engineering Student",stu1);


        System.out.println(studentMap.get("Engineering Student").getName().toUpperCase(Locale.ROOT));
    }
}
