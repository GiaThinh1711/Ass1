package network;

import java.util.List;

import model.Weather;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL ="http://dataservice.accuweather.com";
    @GET("/forecasts/v1/hourly/12hour/353412?apikey=1IAy7g0bDHdzo69GAmz6X8PNriQIjT7Z&language=vi-vn&metric=true\n")
    Call<List<Weather>> getHour();
    @GET("/forecasts/v1/daily/5day/353412?apikey=1IAy7g0bDHdzo69GAmz6X8PNriQIjT7Z&language=vi-vn&metric=true\n")
    Call<List<Weather>> getDay();
}
