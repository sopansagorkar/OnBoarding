package org.epam.onboarding.testng;

import java.util.ArrayList;

public class Students {

    String name;
    String className;
    int age;

    public static Students[][] getStudentData() {
        Students [][] stuArray=null;

        Students students1=new Students();
        Students students2=new Students();

        students1.setAge(30);
        students1.setName("Sopan");
        students1.setClassName("CSE");

        students2.setAge(35);
        students2.setName("Shashank");
        students2.setClassName("MECH");

        ArrayList<Students> arrayList = new ArrayList<Students>();

        arrayList.add(students1);
        arrayList.add(students2);
        stuArray=new Students[arrayList.size()][1];

        for (int i = 0; i < arrayList.size(); i++) {
            Students students=arrayList.get(i);
            stuArray[i][0]=students;
        }
        return stuArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
