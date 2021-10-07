package com.ninad.signuppage;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface myapi {
    @FormUrlEncoded
    @POST("db.php")
    Call<model> adddata(@Field("name") String name, @Field("username") String username, @Field("password") String password);
}
