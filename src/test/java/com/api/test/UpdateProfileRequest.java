package com.api.test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagement;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;

public class UpdateProfileRequest {



    public void updateProfile(){

        AuthService auth = new AuthService();
        Response response = auth.login(new LoginRequest("ayan.ray@gmail.com","ayan.ray123"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        String token = loginResponse.getToken();

        ProfileRequest profileRequest = new ProfileRequest.Builder()
                .email("ayan@gmail.com")
                .firstName("ayan")
                .lastName("chak")
                .phoneNumber("998")
                .password("iuoio")
                .build();
        UserProfileManagement userProfileManagement = new UserProfileManagement();
        response = userProfileManagement.updateprofile(token,profileRequest);
        UserProfileResponse response1 = response.as(UserProfileResponse.class);
        System.out.println(response1.toString());


    }
}
