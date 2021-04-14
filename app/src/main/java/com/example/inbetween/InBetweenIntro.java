package com.example.inbetween;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class InBetweenIntro extends AppCompatActivity {
    Button btnplay,btnhtp,btnexit;
    ImageButton btnfb,btntwitter,btnig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_between_intro);
        btnplay=findViewById(R.id.BTN_Play);
        btnhtp=findViewById(R.id.BTN_HTP);
        btnexit=findViewById(R.id.BTN_Exit);
        btnfb=findViewById(R.id.BTN_Facebook);
        btntwitter=findViewById(R.id.BTN_Twitter);
        btnig=findViewById(R.id.BTN_Instagram);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });

        btnhtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                htp();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });

        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFacebook();
            }
        });

        btntwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twitter();
            }
        });

        btnig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insta();
            }
        });
    }

    public void play(){
        Intent intent=new Intent (this,Game.class);
        startActivity(intent);

    }    public void htp(){
        Intent intent=new Intent(this,HowToPlay.class);
        startActivity(intent);
    }
    public void exit(){
        System.exit(0);
    }
    public void openFacebook() {
            Uri uri = Uri.parse("https://www.facebook.com/saintdaaryl");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
    }

    public void twitter(){
        Uri uri = Uri.parse("https://www.twitter.com/saintdaaryl");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void insta(){
        Uri uri = Uri.parse("https://www.instagram.com/saintdaaryl");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}