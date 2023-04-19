package com.example.recycleview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<News> newsArrayList;
    MyAdapter myAdapter;
    String[] newsHeading;
    int[] imageResourceId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newsArrayList = new ArrayList<>();
         myAdapter = new MyAdapter(this,newsArrayList);
         recyclerView.setAdapter(myAdapter);


         newsHeading = new  String[]{

                 "In rural India, the dependency on an English-competent teacher in order to",
                 " enable efficient English learning is the single biggest bottleneck in",
                 " the pursuit of English Literacy. All incumbent English learning solutions",
                 " necessitate the need of a fluent English-speaking teacher, lack of which results",
                 " in even passionate & hardworking teachers mostly teaching only basics like alphabets",
                 " vocabulary, etc, which do not necessarily make the child capable of navigating ",
                 "difficult English in higher grades. Millions of kids in schools across India continue to ",
                 "remain cut-off from opportunities to better their lives due to poor English skills",
                 " the pursuit of English Literacy. All incumbent English learning solutions",
                 " necessitate the need of a fluent English-speaking teacher, lack of which results",
                 " in even passionate & hardworking teachers mostly teaching only basics like alphabets",


         };
         imageResourceId= new int[]{
                 R.drawable.k,
                 R.drawable.b,
                 R.drawable.c,
                 R.drawable.e,
                 R.drawable.f,
                 R.drawable.g,
                 R.drawable.h,
                 R.drawable.j,
                 R.drawable.l,
                 R.drawable.m,
                 R.drawable.n,
                 R.drawable.o,

         };
         getData();
    }

    private void getData() {

        for ( int i =0;i<newsHeading.length;i++){
            News news = new News(newsHeading[i],imageResourceId[i] );
            newsArrayList.add(news);
        }
        myAdapter.notifyDataSetChanged();
    }
}