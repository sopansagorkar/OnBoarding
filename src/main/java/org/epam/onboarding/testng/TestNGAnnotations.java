package org.epam.onboarding.testng;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @Test
    public void testCase() {
        System.out.println("@Test Annotation method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass called");
    }

    @BeforeGroups
    public void beforeGroup() {
        System.out.println("@BeforeGroups called");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest called");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod called");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite called");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass called");
    }

    @AfterGroups
    public void afterGroup() {
        System.out.println("@AfterGroups called");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest called");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod called");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite called");
    }

    @Test(dataProvider = "studentData",dataProviderClass = DataProviderCLass.class)
    public void getStudentData(Students s){
        System.out.println(s.getName());
        System.out.println(s.getClassName());
        System.out.println(s.getAge());
    }
}
