package com.h.android_project.models;

import com.google.gson.annotations.SerializedName;

public class RegisterResponse {
    @SerializedName("id")
    public String id;

    @SerializedName("token")
    public String token;
}
