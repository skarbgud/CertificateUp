package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_1_1_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_1_1_6);

        Button button48=(Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/발송배전기술사"));
                startActivity(intent);

            }
        });
        Button button54=(Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보관리기술사"));
                startActivity(intent);

            }
        });
        Button button55=(Button) findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/컴퓨터시스템응용기술사"));
                startActivity(intent);

            }
        });
    }
}
