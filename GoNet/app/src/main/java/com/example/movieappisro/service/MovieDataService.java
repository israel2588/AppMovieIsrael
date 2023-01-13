package com.example.movieappisro.service;

import com.example.movieappisro.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    @GET("movie/top_rated")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/upcoming")
    Call<Result> getPopularMoviesUpcoming(@Query("api_key") String apiKey);
}
