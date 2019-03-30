package com.example.shreyas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import  android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt;
    EditText nameTxt;
    String enterText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.myButton);
        txt=(TextView)findViewById(R.id.NameText);
        nameTxt=(EditText) findViewById(R.id.name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,nextActivity.class);
            startActivity(i);
            }
        });

    }
}
