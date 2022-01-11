package org.epam.onboarding.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredGet {
    @BeforeTest
    public void setUpAPIConfiguration(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
    }

    @Test
    public void getRequestTest(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();
        System.out.println(response.getBody().prettyPrint());
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
    }
}
