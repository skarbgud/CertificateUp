package com.example.joljak_ex1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class p1_1_1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay1_1_1_2);


        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/웹디자인기능사"));
                startActivity(intent);

            }
        });
        Button button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/컴퓨터그래픽스운용기능사"));
                startActivity(intent);

            }
        });
        Button button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/영사기능사"));
                startActivity(intent);

            }
        });
        Button button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/농기계운전기능사"));
                startActivity(intent);

            }
        });
        Button button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/세탁기능사"));
                startActivity(intent);

            }
        });
        Button button6=(Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/미용사"));
                startActivity(intent);

            }
        });
        Button button7=(Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/미용사"));
                startActivity(intent);

            }
        });
        Button button8=(Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/미용사"));
                startActivity(intent);

            }
        });
        Button button9=(Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/미용사"));
                startActivity(intent);

            }
        });
        Button button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/한식조리기능사"));
                startActivity(intent);

            }
        });


        Button button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/중식조리기능사"));
                startActivity(intent);

            }
        });
        Button button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/양식조리기능사"));
                startActivity(intent);

            }
        });
        Button button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/일식조리기능사"));
                startActivity(intent);

            }
        });
        Button button14=(Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/복어?from=복어조리기능사#s-7"));
                startActivity(intent);

            }
        });
        Button button15=(Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/조주기능사"));
                startActivity(intent);

            }
        });
        Button button16=(Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설재료시험기능사"));

                startActivity(intent);

            }
        });
        Button button17=(Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/측량기능사"));

                startActivity(intent);

            }
        });
        Button button18=(Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/콘크리트기능사"));

                startActivity(intent);

            }
        });
        Button button19=(Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/항공사진기능사"));

                startActivity(intent);

            }
        });
        Button button20=(Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/조경기능사"));

                startActivity(intent);

            }
        });
        Button button21=(Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/지게차운전기능사"));

                startActivity(intent);

            }
        });
        Button button22=(Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/굴삭기운전기능사"));

                startActivity(intent);

            }
        });
        Button button23=(Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/천공기운전기능사"));

                startActivity(intent);

            }
        });
        Button button24=(Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/광산보안기능사"));

                startActivity(intent);

            }
        });
        Button button25=(Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/화약취급기능사"));

                startActivity(intent);

            }
        });
        Button button26=(Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/컴퓨터응용선반기능사"));

                startActivity(intent);

            }
        });
        Button button27=(Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/컴퓨터응용밀링기능사"));

                startActivity(intent);

            }
        });
        Button button28=(Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전산응용기계제도기능사"));

                startActivity(intent);

            }
        });
        Button button29=(Button) findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/건설기계정비기능사"));

                startActivity(intent);

            }
        });
        Button button30=(Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/설비보전기능사"));

                startActivity(intent);

            }
        });
        Button button31=(Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/승강기기능사"));

                startActivity(intent);

            }
        });
        Button button32=(Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/생산자동화기능사"));

                startActivity(intent);

            }
        });
        Button button33=(Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/항공기체정비기능사"));

                startActivity(intent);

            }
        });
        Button button34=(Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/자동차보수도장기능사"));

                startActivity(intent);

            }
        });
        Button button35=(Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/자동차정비기능사"));

                startActivity(intent);

            }
        });
        Button button36=(Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/자동차차체수리기능사"));

                startActivity(intent);

            }
        });
        Button button37=(Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/금형기능사"));

                startActivity(intent);

            }
        });
        Button button38=(Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/금속재료시험기능사"));

                startActivity(intent);

            }
        });
        Button button39=(Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/열처리기능사"));

                startActivity(intent);

            }
        });
        Button button40=(Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/제선기능사"));

                startActivity(intent);

            }
        });
        Button button41=(Button) findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/용접기능사"));

                startActivity(intent);

            }
        });
        Button button42=(Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/특수용접기능사"));

                startActivity(intent);

            }
        });
        Button button43=(Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/광고도장기능사"));

                startActivity(intent);

            }
        });
        Button button44=(Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/위험물기능사"));

                startActivity(intent);

            }
        });
        Button button45=(Button) findViewById(R.id.button45);
        button45.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전기기능사"));

                startActivity(intent);

            }
        });
        Button button46=(Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전자기기기능사"));

                startActivity(intent);

            }
        });
        Button button47=(Button) findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보기기운용기능사"));

                startActivity(intent);

            }
        });
        Button button48=(Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/정보처리기능사"));

                startActivity(intent);

            }
        });
        Button button49=(Button) findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/전파전자통신기능사"));

                startActivity(intent);

            }
        });
        Button button50=(Button) findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/통신선로기능사"));

                startActivity(intent);

            }
        });
        Button button51=(Button) findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/제과기능사"));

                startActivity(intent);

            }
        });
        Button button52=(Button) findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/제빵기능사"));

                startActivity(intent);

            }
        });
        Button button53=(Button) findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/사진기능사"));

                startActivity(intent);

            }
        });
        Button button54=(Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/식육처리기능사"));

                startActivity(intent);

            }
        });
        Button button55=(Button) findViewById(R.id.button55);
        button55.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/환경기능사"));

                startActivity(intent);

            }
        });
        Button button56=(Button) findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://namu.wiki/w/신재생에너지발전설비기능사(태양광)"));

                startActivity(intent);

            }
        });
    }
}
