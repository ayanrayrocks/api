package com.api.base;

import com.api.models.request.LoginRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class BaseService { //wrapper for rest Assured

    private static final String BASE_URL = "http://localhost:8080/";
    private RequestSpecification requestSpecification;

    protected void setAuthTocken(String token) {
        requestSpecification.header("Authorization", "Bearer " + token);
    }

    public BaseService() {
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object payLoad, String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
    }

    protected Response getRequest(String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).get(endPoint);
    }


    protected Response putRequest(Object payLoad, String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payLoad).post(endPoint);
    }
}
