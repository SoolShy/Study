package com.example.study;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MarqueTextView extends android.support.v7.widget.AppCompatTextView {

    public MarqueTextView(Context context) {
        super(context);
    }

    public MarqueTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
