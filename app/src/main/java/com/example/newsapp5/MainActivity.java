package com.example.newsapp5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView tsrecyclerview,newsrecyclerview;
    ArrayList<DataModel> tslist, newslist;

    MyAdapter myAdapter;
    Myadapter2 myadapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tsrecyclerview = findViewById(R.id.recyclerView);
        newsrecyclerview = findViewById(R.id.recyclerView2);

        tslist = new ArrayList<>();
        newslist = new ArrayList<>();

        tslist.add(new DataModel("Heading A", R.drawable.e));
        tslist.add(new DataModel("Heading B", R.drawable.d));
        tslist.add(new DataModel("Heading C", R.drawable.c));
        //tslist.add(new DataModel("Heading D", R.drawable.b));
        //tslist.add(new DataModel("Heading E", R.drawable.a));

        //newslist.add(new DataModel("Heading A", R.drawable.e));
        newslist.add(new DataModel("Heading B", R.drawable.ic_action_name));
        //newslist.add(new DataModel("Heading C", R.drawable.c));
        newslist.add(new DataModel("Heading D", R.drawable.ic_action_name));
        newslist.add(new DataModel("Heading E", R.drawable.ic_action_name));

        RecyclerView.LayoutManager layoutManager1;
        layoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        RecyclerView.LayoutManager layoutManager2;
        layoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        myAdapter = new MyAdapter(this,tslist);
        tsrecyclerview.setAdapter(myAdapter);
        tsrecyclerview.setLayoutManager(layoutManager1);

        myadapter2 = new Myadapter2(this,newslist);
        newsrecyclerview.setAdapter(myadapter2);
        newsrecyclerview.setLayoutManager(layoutManager2);





    }
}