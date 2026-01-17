package com.api.test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagement;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileRequest {


    @Test
    public void getProfile(){
        AuthService auth = new AuthService();
        Response response = auth.login(new LoginRequest("ayan.ray@gmail.com","ayan.ray123"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();

        UserProfileManagement userProfileManagement = new UserProfileManagement();
        Response response1=  userProfileManagement.getprofile(token);
        Assert.assertEquals(response1.statusCode(),200);
        UserProfileResponse userProfileResponse = response1.as(UserProfileResponse.class);
        System.out.println(userProfileResponse.getEmail());

    }
}
