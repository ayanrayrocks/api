package com.api.base;

import com.api.models.request.ProfileRequest;
import io.restassured.response.Response;

public class UserProfileManagement extends BaseService{

    private static final String BASE_PATH = "/api/userprofile";

    public Response getprofile(String token) {
        setAuthTocken(token);
        return getRequest("/profile");
    }

    public Response updateprofile(String token, ProfileRequest payload) {
        setAuthTocken(token);
        return getRequest("/profile");
    }


}
