package com.rahmahnajiyahimtihan.youtubeapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 4/16/2018.
 */

public class ConfigRetrofit  {
    //AIzaSyC_hUJONZrPgyAOlQrpT9O_1jdXwdlEQIE
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.googleapis.com/youtube/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    ApiService service = retrofit.create(ApiService.class);


}
