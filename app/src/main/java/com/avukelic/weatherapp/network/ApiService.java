package com.avukelic.weatherapp.network;

import com.avukelic.weatherapp.model.ForecastResponse;
import com.avukelic.weatherapp.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by avukelic on 02-Oct-18.
 */
public interface ApiService {

    @GET("/data/2.5/weather")
    Call<WeatherResponse> getWeather(@Query("appid") String apiKey, @Query("q") String city, @Query("units") String units);
    @GET("/data/2.5/weather")
    Call<WeatherResponse> getWeatherWithGps(@Query("appid") String apiKey, @Query("lat") double lat,@Query("lon") double lon, @Query("units") String units);
    @GET("/data/2.5/forecast")
    Call<ForecastResponse> getForecast(@Query("appid") String apiKey, @Query("q") String city, @Query("units") String units);
    @GET("/data/2.5/forecast")
    Call<ForecastResponse> getForecastWithGps(@Query("appid") String apiKey, @Query("lat") double lat,@Query("lon") double lon, @Query("units") String units);
}
