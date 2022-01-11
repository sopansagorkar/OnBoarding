package org.epam.onboarding.testng;

import org.testng.annotations.DataProvider;

public class DataProviderCLass {

    @DataProvider(name = "studentData")
    public Object[][] studentData(){
        Students students[][]=Students.getStudentData();
        return students;
    }
}
