package com.api.test;



import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;

import org.testng.annotations.Test;

public class LoginAPITest {

    @Test
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("ayan@gmail.com","ayan1234");
        System.out.println(loginRequest.getEmail());
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);

        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
        System.out.println(loginResponse.getEmail());
        System.out.println(response.getBody().prettyPrint());
    }
}
