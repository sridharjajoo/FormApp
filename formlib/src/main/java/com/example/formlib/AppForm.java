package com.example.formlib;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class AppForm extends LinearLayout{


    public AppForm(Context context) {
        super(context);
        initialize(context);
    }

    private void initialize(Context context) {
        inflate(context, R.layout.form, this);
    }

    public AppForm(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
