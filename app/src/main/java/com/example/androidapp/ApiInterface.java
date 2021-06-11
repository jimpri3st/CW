package com.example.androidapp;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/popular")
    Call<MovieResult> getAllMovies(@Query("api_key") String key, @Query("page") int page);

    @GET("movie/upcoming")
    Call<MovieResult> getAllUpcomingMovies(@Query("api_key") String key);

    @GET("movie/{movie_id}")
    Call<Movies> getSelectedMovie(@Path("movie_id") int id, @Query("api_key") String key);

    @GET("movie/{movie_id}/credits")
    Call<MovieResult> getMovieCredits(@Path("movie_id") int id, @Query("api_key") String key);

    @POST("movie/{movie_id}/rating")
    Call<JsonObject> postMovieRating(@Path("movie_id") int id, @Query("api_key") String key, @Body JsonObject request);

}
