package com.example.newsapp5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder> {

    private List<DataModel2> list;

    public MyAdapter3(List<DataModel2> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titleimage.setImageResource(list.get(position).getImage());
        holder.heading.setText(list.get(position).getHeading());
    }

    @Override
    public int getItemCount() {
        return list.size();
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
