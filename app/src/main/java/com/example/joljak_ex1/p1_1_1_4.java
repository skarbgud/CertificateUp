package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_1_1_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_1_1_4);

        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/품질경영기사"));
                startActivity(intent);

            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건축기사"));
                startActivity(intent);

            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/실내건축기사"));
                startActivity(intent);

            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설재료시험기사"));
                startActivity(intent);

            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/지적기사"));
                startActivity(intent);

            }
        });
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/조경기사"));
                startActivity(intent);

            }
        });
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/교통기사"));
                startActivity(intent);

            }
        });
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/도시계획기사"));
                startActivity(intent);

            }
        });
        Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/일반기계기사"));
                startActivity(intent);

            }
        });
        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설기계설비기사"));
                startActivity(intent);

            }
        });
        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/승강기기사"));
                startActivity(intent);

            }
        });
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/화공기사"));
                startActivity(intent);

            }
        });
        Button button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/화학분석기사"));
                startActivity(intent);

            }
        });
        Button button14=(Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전기기사"));
                startActivity(intent);

            }
        });
        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전기공사기사"));

                startActivity(intent);

            }
        });
        Button button16=(Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/철도신호기사"));

                startActivity(intent);

            }
        });
        Button button17=(Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전자계산기기사"));

                startActivity(intent);

            }
        });
        Button button18=(Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전자기사"));

                startActivity(intent);

            }
        });
        Button button19=(Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전자계산기조직응용기사"));

                startActivity(intent);

            }
        });
        Button button20=(Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보처리기사"));

                startActivity(intent);

            }
        });
        Button button21=(Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보보안기사"));

                startActivity(intent);

            }
        });
        Button button22=(Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/방송통신기사"));

                startActivity(intent);

            }
        });
        Button button23=(Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/무선설비기사"));

                startActivity(intent);

            }
        });
        Button button24=(Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보통신기사"));

                startActivity(intent);

            }
        });
        Button button25=(Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/식품기사"));

                startActivity(intent);

            }
        });
        Button button26=(Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/산업안전기사"));

                startActivity(intent);

            }
        });
        Button button27=(Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/산업위생관리기사"));

                startActivity(intent);

            }
        });
        Button button28=(Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/소방설비기사(기계분야)"));

                startActivity(intent);

            }
        });
        Button button29=(Button) findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/소방설비기사(전기분야)"));

                startActivity(intent);

            }
        });
        Button button30=(Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/대기환경기사"));

                startActivity(intent);

            }
        });
        Button button31=(Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/수질환경기사"));

                startActivity(intent);

            }
        });
        Button button32=(Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/기상기사"));

                startActivity(intent);

            }
        });
        Button button33=(Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/신재생에너지발전설비기사(태양광)"));

                startActivity(intent);

            }
        });

    }
}
