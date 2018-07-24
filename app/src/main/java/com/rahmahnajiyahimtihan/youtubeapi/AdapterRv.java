package com.rahmahnajiyahimtihan.youtubeapi;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahmahnajiyahimtihan.youtubeapi.ResponseYoutube.ItemsItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by User on 4/17/2018.
 */

//diambil dr dokumentsai recyle view
public class AdapterRv extends RecyclerView.Adapter<AdapterRv.ViewHolder> {
    private List<ItemsItem> mDataset; //dr string diganti jd listview

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        //inisialisasi
        public TextView judul, channel, tgl;
        ImageView img;

        public ViewHolder(View v) {
            super(v);

            //deklarasi
            judul = (TextView) v.findViewById(R.id.textJudul);
            channel = (TextView) v.findViewById(R.id.textChannel);
            tgl = (TextView) v.findViewById(R.id.textTanggal);
            img = (ImageView) v.findViewById(R.id.itemImg);
        }

        public void bind(final ItemsItem itemsItem) {
            judul.setText(itemsItem.getSnippet().getTitle());
            channel.setText(itemsItem.getSnippet().getChannelTitle());
            tgl.setText(itemsItem.getSnippet().getPublishedAt());

            Picasso.with(itemView.getContext()).load(itemsItem.getSnippet()
                    .getThumbnails().getHigh().getUrl()).into(img);//ngeset gmbr pake picasso

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(itemView.getContext().getApplicationContext(), FullscreenDemoActivity.class);
                    i.putExtra("video", itemsItem.getId().getVideoId());
                    itemView.getContext().startActivity(i);

                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterRv (List<ItemsItem> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdapterRv .ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recyclerview, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.mTextView.setText(mDataset[position]);

        //bikin mehod di holder
        holder.bind(mDataset.get(position));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}


