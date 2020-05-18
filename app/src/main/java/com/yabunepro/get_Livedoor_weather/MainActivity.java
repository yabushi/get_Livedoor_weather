package com.yabunepro.get_Livedoor_weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tvTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://weather.livedoor.com/forecast/webservice/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<MinimumWeatherInfo>> call = jsonPlaceHolderApi.getMinimumWeatherInfo();

        call.enqueue(new Callback<List<MinimumWeatherInfo>>() {
            @Override
            public void onResponse(Call<List<MinimumWeatherInfo>> call, Response<List<MinimumWeatherInfo>> response) {

            }

            @Override
            public void onFailure(Call<List<MinimumWeatherInfo>> call, Throwable t) {
                tvTitle.setText(t.getMessage());
            }
        });
    }
}
