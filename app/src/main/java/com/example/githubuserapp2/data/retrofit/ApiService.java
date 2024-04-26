package com.example.githubuserapp2.data.retrofit;


import com.example.githubuserapp2.data.response.GithubSearchResponse;
import com.example.githubuserapp2.data.response.GithubUser;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({"Authorization: token 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"})
    @GET("search/users")
    Call<GithubSearchResponse> searchUsers(@Query("q") String query);

    @Headers({"Authorization: token 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"})
    @GET("users/{username}")
    Call<GithubUser> getUser(@Path("username") String username);


}

