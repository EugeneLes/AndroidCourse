package com.leskovskij.classwork6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.leskovskij.androidcourse.R;

import java.util.ArrayList;

public class ClassWork6Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> stringArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_work6);

        stringArrayList.add("Item 0");
        stringArrayList.add("Item 1");
        stringArrayList.add("Item 2");
        stringArrayList.add("Item 3");
        stringArrayList.add("Item 4");
        stringArrayList.add("Item 5");
        stringArrayList.add("Item 6");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ClassWork6Adapter classWork6Adapter = new ClassWork6Adapter(stringArrayList);

        recyclerView.setAdapter(classWork6Adapter);



    }
}
