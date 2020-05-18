package com.yabunepro.get_Livedoor_weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("json/v1")
    Call<List<Forcast>> getForcasts(@Query("city") int city);

}
