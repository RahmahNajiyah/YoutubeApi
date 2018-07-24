package com.rahmahnajiyahimtihan.youtubeapi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube.ItemsItem;
import com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube.ResponYoutube;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class SportFragment extends Fragment {

    RecyclerView recyclerView;
    public SportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sport, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerviewYoutube);//id dr sport fragment(layout)

        //method br
        ambilData();

        return v;

    }

    private void ambilData() {

        new ConfigRetrofit().service.getVideo("snippet","25","Basket","ID","Sport","AIzaSyC_hUJONZrPgyAOlQrpT9O_1jdXwdlEQIE")
                .enqueue(new Callback<ResponYoutube>() {
                    @Override
                    //ini kalau berhasil
                    public void onResponse(Call<ResponYoutube> call, Response<ResponYoutube> response) {
                        //cek respon
                        if (response.isSuccessful()) {
                            //ngambil smua json yg ada
                            ResponYoutube alljson = response.body();

                            //ambil item
                            List<ItemsItem> data = alljson.getItems();

                            Log.d("data :", data.toString());

                            //masukin ke adapter
                            AdapterRv adapter = new AdapterRv(data);

                            //set adapter ke recylerview
                            recyclerView.setAdapter(adapter);

                            //add layout adapter
                            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

                            //buat ngecek
                            Log.d("respon json", alljson.toString());
                            Log.d("respon adapter", String.valueOf(adapter.getItemCount()));

                        }

                    }
                    //ini kalau gagal
                    @Override
                    public void onFailure(Call<ResponYoutube> call, Throwable t) {

                        Log.d("error :", t.getMessage());

                    }
                });
    }

}
