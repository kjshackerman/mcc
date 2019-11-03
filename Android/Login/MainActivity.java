package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_login = findViewById(R.id.button_login);
        final EditText user_text = (EditText) findViewById(R.id.userid);
        final EditText pass_text = (EditText) findViewById(R.id.password);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                if(user_text.getText().toString().equals("abc") && pass_text.getText().toString().equals("abc"))
                {
                    Toast.makeText(context, "Correct Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(context, "Wrong Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
