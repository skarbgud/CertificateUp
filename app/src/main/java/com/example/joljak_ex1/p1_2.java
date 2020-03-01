package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_2);

        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/MOS"));
                startActivity(intent);

            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/ICDL"));
                startActivity(intent);

            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/CISCO?from=CCNA"));
                startActivity(intent);

            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/OCJP"));
                startActivity(intent);

            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/SCEA(자격증)"));
                startActivity(intent);

            }
        });

        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/PMP"));
                startActivity(intent);

            }
        });


        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/CFA"));
                startActivity(intent);

            }
        });
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/CIIA"));
                startActivity(intent);

            }
        });
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/재무설계사?from=자산관리사#s-2.2"));
                startActivity(intent);

            }
        });
        Button button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/FRM"));
                startActivity(intent);

            }
        });

        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/EA"));

                startActivity(intent);

            }
        });


    }
}
