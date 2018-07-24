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
public class FruitFragment extends Fragment {

    RecyclerView recyclerView;
    public FruitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sport, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerviewYoutube);

        ambilData();

        return v;
    }

    private void ambilData() {

        new ConfigRetrofit().service.getVideo("snippet", "25", "Fruit", "ID", "Fruit", "AIzaSyC_hUJONZrPgyAOlQrpT9O_1jdXwdlEQIE")
                .enqueue(new Callback<ResponYoutube>() {
                    @Override
                    //jk berhasil
                    public void onResponse(Call<ResponYoutube> call, Response<ResponYoutube> response) {

                        //cek respon
                        if (response.isSuccessful()) {

                        //ambil json
                            ResponYoutube alljson = response.body();

                        //ambil item
                            List<ItemsItem> data = alljson.getItems();

                            Log.d("data :", data.toString());

                        //about adapter
                            AdapterRv adapter = new AdapterRv(data);

                            recyclerView.setAdapter(adapter);

                            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

                        //ngecek
                            Log.d("respon json", alljson.toString());
                            Log.d("respon adapter", String.valueOf(adapter.getItemCount()));
                        }

                    }

                    @Override
                    //jk gagal
                    public void onFailure(Call<ResponYoutube> call, Throwable t) {

                        Log.d("error", t.getMessage());

                    }
                });
    }

}
