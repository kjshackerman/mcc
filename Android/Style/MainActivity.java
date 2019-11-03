package com.example.style;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button font, color, plus, minus, st;
        final TextView text;

        font = findViewById(R.id.font);
        color = findViewById(R.id.color);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        text = findViewById(R.id.text);
        st = findViewById(R.id.style);

        final int[] size = {15};
        final Typeface[] type = {Typeface.MONOSPACE, Typeface.SANS_SERIF, Typeface.SERIF, Typeface.DEFAULT};
        final int[] style = {Typeface.ITALIC, Typeface.BOLD, Typeface.BOLD_ITALIC};

        font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index;
                Random r = new Random();
                int c = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
                text.setTextColor(c);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size[0] += 2;
                text.setTextSize(size[0]);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size[0] -= 2;
                text.setTextSize(size[0]);
            }
        });
    }
}
