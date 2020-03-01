package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_3);

        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/HSK"));
                startActivity(intent);

            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/JLPT"));
                startActivity(intent);

            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/TOEIC?from=토익"));
                startActivity(intent);

            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/TOEFL?from=토플"));
                startActivity(intent);

            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/TEPS?from=텝스"));
                startActivity(intent);

            }
        });
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/IELTS?from=아이엘츠"));
                startActivity(intent);

            }
        });
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/GRE"));
                startActivity(intent);

            }
        });
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/TESOL?from=테솔"));
                startActivity(intent);

            }
        });
        Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/토르플?from=TORFL"));
                startActivity(intent);

            }
        });
        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/DELE"));
                startActivity(intent);

            }
        });
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/DELF/DALF"));
                startActivity(intent);

            }
        });
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/Goethe-Zertifikat?from=ZD"));
                startActivity(intent);

            }
        });

    }
}
