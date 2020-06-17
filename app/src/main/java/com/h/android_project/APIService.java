package com.h.android_project;

import com.h.android_project.models.LoginResponse;
import com.h.android_project.models.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(@Field("email") String email,
                              @Field("password") String password);

    @FormUrlEncoded
    @POST("register")
    Call<RegisterResponse> register(@Field("email") String email,
                                    @Field("password") String password);
}
