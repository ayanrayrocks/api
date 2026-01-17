package com.api.test;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPassword {


    @Test
    public void forgetPassword() {
        AuthService authService = new AuthService();
        Response response = authService.forgetPassword("ayan.ray@gamil.com");
        Assert.assertEquals(response.getStatusCode(), 200);
        System.out.println(response.prettyPrint());
    }
}
