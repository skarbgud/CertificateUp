package com.example.joljak_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button korea = (Button)findViewById(R.id.korea);
        korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(p1.this, p1_1.class);
                startActivity(intent);
            }
        });
        Button inter = (Button)findViewById(R.id.inter);
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(p1.this, p1_2.class);
                startActivity(intent);
            }
        });
        Button lang = (Button)findViewById(R.id.lang);
        lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(p1.this, p1_3.class);
                startActivity(intent);
            }
        });
    }
}
