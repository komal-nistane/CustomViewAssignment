package com.example.customviewdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class CustomView extends AppCompatButton {

    com.example.customviewdemo.CustomView mSubmit;


    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init(){
        mSubmit =(CustomView) findViewById(R.id.custom_button_view);
        StringBuilder buttonText = new StringBuilder("Submit");
        StringBuilder reverseName = buttonText.reverse();
        this.setText(reverseName);
        this.setTextColor(Color.BLACK);
    }



}
