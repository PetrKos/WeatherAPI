package com.example.myapplication.Retrofit;

import com.example.myapplication.Model.WeatherResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherServiceAPI {
    @GET("weather")
    Call<List<WeatherResult>> getWeatherByCity(/*@Query("q") String city,
                                         @Query("appid") String appid*/);

}
