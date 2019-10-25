package com.example.jsondataapplication;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    private List<String> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageView;
        public MyViewHolder(ImageView view) {
            super(view);
            //textView = view;
            imageView = view;
        }
    }

    public DataAdapter(List<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

//        TextView view = (TextView) LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_view, parent, false);
        ImageView view = (ImageView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       // holder.textView.setText(mDataset.get(position));
        Picasso.get().load(mDataset.get(position)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
