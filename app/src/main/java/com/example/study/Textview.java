package com.example.study;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Textview extends AppCompatActivity {
    private TextView tv_1,tv_2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_layout);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_1.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tv_2.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}
