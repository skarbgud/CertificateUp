package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_1_1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_1_1_3);

        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/영사산업기사"));
                startActivity(intent);

            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설재료시험산업기사"));
                startActivity(intent);

            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/잠수산업기사"));
                startActivity(intent);

            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/철도토목산업기사"));
                startActivity(intent);

            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/콘크리트산업기사"));
                startActivity(intent);

            }
        });
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/자동차정비산업기사"));
                startActivity(intent);

            }
        });
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/금속재료산업기사"));
                startActivity(intent);

            }
        });
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/위험물산업기사"));
                startActivity(intent);

            }
        });
        Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전기산업기사"));
                startActivity(intent);

            }
        });
        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/사무자동화산업기사"));
                startActivity(intent);

            }
        });
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/가스산업기사"));
                startActivity(intent);

            }
        });
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설안전산업기사"));
                startActivity(intent);

            }
        });
        Button button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/산업안전산업기사"));
                startActivity(intent);

            }
        });
        Button button14=(Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/대기환경산업기사"));
                startActivity(intent);

            }
        });
        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/수질환경산업기사"));

                startActivity(intent);

            }
        });

    }
}
