package com.example.trainingapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* // 1 TextView
        setContentView(R.layout.activity_main);

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
        /* // 2 EditText
        setContentView(R.layout.edit_text);
        EditText editText = findViewById(R.id.edit_text1);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                TextView textView = findViewById(R.id.textView1);
                textView.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        */
        /* //3 Button
        setContentView(R.layout.button);
       */
        // Button 2 введение при нажатии
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        TextView textView = new TextView(this);
        textView.setId(View.generateViewId());
        textView.setText("");
        textView.setTextSize(30);
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        ConstraintLayout.LayoutParams textViewLayout = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        textViewLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        textView.setLayoutParams(textViewLayout);


        EditText editText = new EditText(this);
        editText.setId(View.generateViewId());

        ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        editText.setHint("Введите имя");
        editText.setTextSize(30);

        editTextLayout.topToBottom = textView.getId();
        editTextLayout.leftToLeft = textView.getId();
        editTextLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        editText.setLayoutParams(editTextLayout);

        Button button = new Button(this);

        ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);

        button.setText("Ввод");
        buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayout.topToBottom = editText.getId();

        // Установка OnClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //обработка нажатия на кнопку
                textView.setText("Welcome to the GYM, " + editText.getText() + " buddy!");

            }
        });

        button.setLayoutParams(buttonLayout);

        constraintLayout.addView(textView);
        constraintLayout.addView(editText);
        constraintLayout.addView(button);

        setContentView(constraintLayout);





    }

    public void sendMessage (View view) {
        TextView textView = findViewById(R.id.get_name);
        EditText editText = findViewById(R.id.edit_name);
        textView.setText("Welcome to the GYM, " + editText.getText() + " SLAVE");
    }


}