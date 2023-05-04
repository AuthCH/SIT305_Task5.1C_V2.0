package com.example.newsapp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter2 extends RecyclerView.Adapter<Myadapter2.MyViewHolder> {

    Context mContext;
    ArrayList<DataModel> newslist;

    public Myadapter2(Context mContext, ArrayList<DataModel> newslist) {
        this.mContext = mContext;
        this.newslist = newslist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerviewlayout,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titleimage.setImageResource(newslist.get(position).getImage());
        holder.heading.setText(newslist.get(position).getNews());
    }

    @Override
    public int getItemCount() {
        return newslist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView titleimage;
        TextView heading;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleimage = itemView.findViewById(R.id.imageView);
            heading = itemView.findViewById(R.id.textView3);
        }
    }
}
