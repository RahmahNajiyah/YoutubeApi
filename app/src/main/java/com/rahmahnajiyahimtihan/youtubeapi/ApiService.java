package com.rahmahnajiyahimtihan.youtubeapi;

import com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube.ResponYoutube;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by User on 4/16/2018.
 */

public interface ApiService {
    //guna interface untuk request ke server
    //kenapa pakai robo pojo supaya gk perlu buat 1 by 1 kelas2 yg ada di ResponseYoutube
    //https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=25&q=surfing&regionCode=ID&key={YOUR_API_KEY}

    @GET("search")
    Call<ResponYoutube> getVideo(@Query("part") String part,
                                 @Query("maxResult") String result,
                                 @Query("q") String keyword,
                                 @Query("regionCode") String region,
                                 @Query("type") String type,
                                 @Query("key") String key);

}
