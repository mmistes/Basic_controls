package com.example.trainingapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);

        // устанавливаем высоту текста
        textView.setTextSize(30);

        // установка фонового цвета
        textView.setBackgroundColor(0xffe8eaf6);

        // установка цвета текста
        textView.setTextColor(0xff5c6bc0);

        // делаем все буквы заглавными
        textView.setAllCaps(true);

        // устанавливаем вравнивание текста по центру
        textView.setTextAlignment(textView.TEXT_ALIGNMENT_CENTER);

        // устанавливаем текст
        textView.setText("На самом деле, всё это база!");

        // установка шрифта

        textView.setTypeface(Typeface.SANS_SERIF);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
*/




    }
}