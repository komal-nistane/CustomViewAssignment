package com.example.customviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class CustomView extends AppCompatButton {

    Paint mPaint;
    Rect mRect;
    int mSquareColor;
    com.example.customviewdemo.CustomView mSubmit;


    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    private void init(@Nullable AttributeSet set){
        mSubmit =(com.example.customviewdemo.CustomView) findViewById(R.id.custom_button_view);
        StringBuilder buttonText = new StringBuilder("Submit");
        StringBuilder reverseName = buttonText.reverse();
        this.setText(reverseName);
        this.setTextColor(Color.BLACK);
    }



}
