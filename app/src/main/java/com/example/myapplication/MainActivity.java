package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.Model.WeatherResult;
import com.example.myapplication.Retrofit.OpenWeatherServiceAPI;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Retrofit object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //OpenWeather API
        OpenWeatherServiceAPI openWeatherServiceAPI = retrofit.create(OpenWeatherServiceAPI.class);
        Call<List<WeatherResult>> call = openWeatherServiceAPI.getWeatherByCity();

        call.enqueue(new Callback<List<WeatherResult>>() {
            @Override
            public void onResponse(Call<List<WeatherResult>> call, Response<List<WeatherResult>> response) {


            }

            @Override
            public void onFailure(Call<List<WeatherResult>> call, Throwable t) {



            }
        });

    }
}
