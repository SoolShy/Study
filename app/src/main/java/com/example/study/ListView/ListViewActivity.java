package com.example.study.ListView;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.study.R;

public class ListViewActivity extends AppCompatActivity {
    private ListView mlv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mlv1 = findViewById(R.id.mlv1);
        mlv1.setAdapter(new ListViewAdapter(ListViewActivity.this));
    }
}
