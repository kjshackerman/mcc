package com.example.changepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText old, newpass, confirm;
        final Button change;

        old = findViewById(R.id.old);
        newpass = findViewById(R.id.newpass);
        confirm = findViewById(R.id.confirm);
        change = findViewById(R.id.change);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                if (old.getText().toString().equals("old") && newpass.getText().toString().equals(confirm.getText().toString()))
                {
                   Toast.makeText(context, "Password Changed Successfully", duration).show();
                }
                else
                {
                    Toast.makeText(context, "Error. Try Again", duration).show();
                }
            }
        });
    }
}
