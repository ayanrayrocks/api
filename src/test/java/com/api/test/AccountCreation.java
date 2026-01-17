package com.api.test;

import com.api.base.AuthService;
import com.api.models.request.SignUp;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreation {

    @Test
    public void creatAccount(){

        SignUp signUp = new SignUp.Builder().setEmail("ayan@gmail.com")
                .setPassword("12345")
                .setFirstName("Ayan")
                .setLastName("Ray")
                .setPhoneNumber("123456789")
                .build();

        AuthService authService = new AuthService();
        Response response = authService.signUp(signUp);
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.prettyPrint());
    }

}
