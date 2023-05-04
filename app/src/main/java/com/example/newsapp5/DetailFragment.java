package com.example.newsapp5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class DetailFragment extends Fragment {

    private ArrayList<DataModel2> list = new ArrayList<>();

    public DetailFragment() {
        // Required empty public constructor
    }


    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recyclerviewlayout,container,false);

        addData();
        recyclerview(view);
        return view;
    }
    private void recyclerview(View view){
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        MyAdapter3 myAdapter3 = new MyAdapter3(list);
        recyclerView.setAdapter(myAdapter3);


    }
    private void addData(){

        list.add(new DataModel2("Related news Heading1",R.drawable.e));
        list.add(new DataModel2("Related news Heading2",R.drawable.d));
        list.add(new DataModel2("Related news Heading3",R.drawable.c));


    }
}
