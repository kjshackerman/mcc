package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mul, div;
    EditText inp1, inp2, op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);

        inp1 = (EditText)findViewById(R.id.inp1);
        inp2 = (EditText)findViewById(R.id.inp2);
        op = (EditText)findViewById(R.id.op);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(inp1.getText() + "");
                int num2  =Integer.parseInt(inp2.getText() + "");
                op.setText(num1+num2+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(inp1.getText()+"");
                int num2 = Integer.parseInt(inp2.getText()+"");
                op.setText(num1-num2+"");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(inp1.getText()+"");
                int num2 = Integer.parseInt(inp2.getText()+"");
                op.setText(num1*num2+"");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(inp1.getText()+"");
                int num2 = Integer.parseInt(inp2.getText()+"");
                op.setText(num1/num2+"");
            }
        });

    }
}
