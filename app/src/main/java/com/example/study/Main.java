package com.example.study;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.study.ListView.ListViewActivity;

public class Main extends AppCompatActivity {
    private Button btn_tv1,button,btn_lv;
    private ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        btn_tv1 = findViewById(R.id.btn_tv1);
        btn_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, Textview.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,btnActivity.class);
                startActivity(intent);
            }
        });
        imageView = findViewById(R.id.iv1);
        Glide.with(this).load("https://images.pexels.com/photos/2115562/pexels-photo-2115562.jpeg?cs=srgb&dl=analog-photography-art-beautiful-2115562.jpg&fm=jpg").into(imageView);
        btn_lv = findViewById(R.id.btn_lv);
        btn_lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
